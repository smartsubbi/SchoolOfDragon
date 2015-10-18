package DataProvider;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider 
{
	XSSFWorkbook wb;
	XSSFSheet sheet;
	XSSFRow row;
	XSSFCell cell;

	public ExcelDataProvider() 
	{

		File src = new File("C://Users//smartsubbi//Desktop//TestData.xlsx");

		try {
			FileInputStream fis = new FileInputStream(src);

			wb = new XSSFWorkbook(fis);
		} 
		catch (Exception e) 
		{

		}

	}

	public int getLastUsedRow(int sheetIndex) 
	{
		int lastUsedRowNumber = wb.getSheetAt(sheetIndex).getLastRowNum();

		return lastUsedRowNumber;
	}

	public String getCellData(int sheetIndex, int rowNumber, int colNumber) 
	{
		
		final DataFormatter df = new DataFormatter();
		
		cell = wb.getSheetAt(sheetIndex).getRow(rowNumber).getCell(colNumber);
		
		if(cell==null)
		{
			return "Empty Cell";
		}
		else
		{
			String cellData = df.formatCellValue(cell);
			
			return cellData;		
		}		
		
	}
	
	public int getFirstRowContains(int sheetIndex, String searchData, int colNumber)
	{
		ExcelDataProvider excel = new ExcelDataProvider();
		int i = 0;
		int usedRowCount = excel.getLastUsedRow(sheetIndex);
		for(;i<usedRowCount;i++)
		{			
			
			if(excel.getCellData(sheetIndex,i,colNumber).equalsIgnoreCase(searchData))
			{
				break;
			}			
		}
		return i;
	}
	
	public static int getTotalTestSteps(int sheetIndex, int firstStep,String data,int colNumber)
	{
		ExcelDataProvider excel = new ExcelDataProvider();
		int usedRowCount = excel.getLastUsedRow(sheetIndex);
		
		for(;firstStep<usedRowCount;firstStep++)
		{			
			if(!data.equals(excel.getCellData(sheetIndex,colNumber,firstStep)))
			{
				break;
			}
		}
		return firstStep;
	}
	

}
