package Factory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserFactory 
{
	static WebDriver driver;
	
	public static WebDriver getBrowser(String browserName)
	{
		if(browserName.equalsIgnoreCase("firefox"))
		{
			
			driver = new FirefoxDriver();			
		}
		else if(browserName.equalsIgnoreCase("chrome"))
		{
			
			System.setProperty("webdriver.chrome.driver", ConfigDataProviderFactory.getConfig().getChromePath());
			driver = new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("IE"))
		{
			System.setProperty("webdriver.ie.driver", ConfigDataProviderFactory.getConfig().getIEPath());
			driver = new InternetExplorerDriver();
		}	
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);		
		return driver;		
	}
	
	public static void closeBrowser()
	{
		driver.quit();
	}
	
	
	

}
