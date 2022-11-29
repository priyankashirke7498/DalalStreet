package pageLayer;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import testBase.TestBase;

public class SellShareIC extends TestBase {
	
	public SellShareIC()
	{
		PageFactory.initElements(driver, this);
	}
	
	//-----------------Sell Button1-----------------
	@FindBy(xpath="//a[contains(text(),'Sell')]")
	private WebElement sell_btn1;
	
	@FindBy(xpath="(//label[text()='Intraday'])[2]")
	private WebElement intraday_btn;

	@FindBy(xpath="(//label[text()='Custom Limit'])[2]")
	private WebElement custom_btn;

	@FindBy(xpath="//input[@id='quantity']")
	private WebElement qty_txt;
	
	@FindBy(xpath="(//input[@class='form-control form-control'])[2]")
	private WebElement price_txt;
	
	//--------------Sell Button2------------------------
	@FindBy(xpath="//button[contains(text(),'Sell')]")
	private WebElement Sell_btn2;
	
	@FindBy(xpath="//div[text()='Order Created successfully']")
	private WebElement status_msg;
	
		
	public void clickOnSellButton1()
	{
		sell_btn1.click();
		
	}
	
	public void clickOnIntradayButton()
	{
		intraday_btn.click();
	}
	
	public void clickOnCustomeLimitButton()
	{
		custom_btn.click();
	}
	public void enterOnShareQty(String count)
	{
		qty_txt.click();
		qty_txt.sendKeys(count +Keys.TAB);
	}
	
	public void clickOnPrice(String price)
	{
		price_txt.click();
		price_txt.sendKeys(price +Keys.TAB);
		
	}
	
	public void clickOnSellButton2()
	{
		Sell_btn2.click();
	}
	
	public String getStatus()
	{
		String text = status_msg.getText();
		return text;
	}
}
