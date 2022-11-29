package pageLayer;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.TestBase;

public class BuyShareLM extends TestBase {

	public BuyShareLM()
	{
		PageFactory.initElements(driver, this);
	}
	

	@FindBy(xpath="//a[contains(text(),'Buy')]")
	private WebElement buy_btn1;
	
	@FindBy(xpath="//input[@name='input-Qunatity']")
	private WebElement qty_txt;
	
	@FindBy(xpath="//button[contains(text(),'Buy')]")
	private WebElement buy_btn2;
	
	@FindBy(xpath="//div[text()='Order Created successfully']")
	private WebElement status_msg;

	public void clickOnBuyBtn1()
	{
		buy_btn1.click();
	}
	
	public void enterOnShareQty(String count)
	{
		qty_txt.click();
		qty_txt.sendKeys(count +Keys.TAB);
	}
	
	public void clickOnBuyBtn2()
	{
		buy_btn2.click();
	}

	public String getStatus()
	{
		String text = status_msg.getText();
		return text;
	}
}

