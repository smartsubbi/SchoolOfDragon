package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CommonHeader 
{
	WebDriver driver;
	
	public CommonHeader(WebDriver driver)
	{
		this.driver = driver;
	}
	
	@FindBy(xpath="//div[@id='ctl00_logindiv']/a[@class='logo'][@title='Log in'][@href='/Login.aspx']")
	WebElement headerLogInLink;
	
	@FindBy(xpath="//div[@id='ctl00_logoutdiv']/a[@class='logo'][@title='Logout'][@href='/Logout.aspx']")
	WebElement headerLogOutLink;
	
	public void clickHeaderLoginLink()
	{
		headerLogInLink.click();
	}
	
	public void clickHeaderLogOutLink()
	{
		headerLogOutLink.click();
	}
	
	

}
