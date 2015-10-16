package DataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider 
{
	XSSFWorkbook wb;
	XSSFSheet sheet;
	
	public ExcelDataProvider()
	{		
		
		File src = new File("M://Users//smartsubbi//gitRepo//com.SchoolOfDragon//TestData//Data.xlsx");
		
		try
		{
			FileInputStream fis = new FileInputStream(src);
			
			wb = new XSSFWorkbook(fis);
		}
		catch (Exception e)
		{
			
		}
		
	}
	
	public String getData(int sheetIndex, int rowNumber, int colNumber)
	{
		String data = wb.getSheetAt(sheetIndex).getRow(rowNumber).getCell(colNumber).getStringCellValue();
		
		return data;	
	}
	
	

}
