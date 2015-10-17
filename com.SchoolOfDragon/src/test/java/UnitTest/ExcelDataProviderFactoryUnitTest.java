package UnitTest;

import org.testng.annotations.Test;

import DataProvider.ExcelDataProvider;
import Factory.ExcelDataProviderFactory;
import junit.framework.Assert;

public class ExcelDataProviderFactoryUnitTest 
{
	@Test
	public static void getExcelObject()
	{
		ExcelDataProvider excel = ExcelDataProviderFactory.getExcel();
		Assert.assertTrue(excel!=null);
	}
}
