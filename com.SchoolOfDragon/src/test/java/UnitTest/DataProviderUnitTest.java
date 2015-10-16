package UnitTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import DataProvider.ConfigDataProvider;
import DataProvider.ExcelDataProvider;

public class DataProviderUnitTest 
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
	
	@Test
	public void testConfigDataProvider()
	{
		ConfigDataProvider config = new ConfigDataProvider();
		String chromePath = config.getChromePath();
		System.out.println("Chrome Path is : "+chromePath);
		Assert.assertEquals(chromePath, "M:\\Users\\smartsubbi\\gitRepo\\com.SchoolOfDragon\\SeleniumDrivers\\chromedriver_win32\\chromedriver.exe");		
	}
}
