package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AfterLoggedInPage 
{
	WebDriver driver;
	
	public AfterLoggedInPage(WebDriver driver)
	{
		this.driver = driver;		
	}
	
	@FindBy(xpath="//a[@id='ctl00_mcp_logout'][@class='LaunchClass'][@href='Logout.aspx']")
	WebElement logoutAfterLoggedIn;
	
	public WebElement currentlyLoggedInText(String userName)
	{
		return driver.findElement(By.xpath("//div[@class='launchgame-content']/p/strong"));		
	}

}
