package pageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.TestBase;

public class LoginPage extends TestBase {
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//---------------obj repo--------------------
	@FindBy(xpath="//input[@name='email']")
	private WebElement email_txt;
	
	@FindBy(xpath="//input[@name='password']")
	private WebElement password_txt;
	
	@FindBy(xpath="//button[text()='Log In']")
	private WebElement login_btn;
	
	
	//-------------Action Method------------------
	
	public void enterEmailID()
	{
		email_txt.sendKeys("amarwaghmare573@gmail.com");
	}
	
	public void enterPassword()
	{
		password_txt.sendKeys("Test@1234");
	}
	
	public void clickonLogin()
	{
		login_btn.click();
	}
	
	public String getCurrenturl()
	{
		String url = driver.getCurrentUrl();
		return url;
	}
}
