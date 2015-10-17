package UnitTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import DataProvider.ConfigDataProvider;
import DataProvider.ExcelDataProvider;

public class ExcelDataProviderUnitTest 
{
	
	@Test
	public void testExcelDataProvider()
	{
		ExcelDataProvider excel = new ExcelDataProvider();
		String username = excel.getData(0, 1, 0);
		System.out.println("User name is : "+username);
		Assert.assertEquals(username, "subbu2015");
		String password = excel.getData(0, 1, 1);
		System.out.println("Password is : "+password);
		Assert.assertEquals(password, "abcdef");	
	}	
	
}
