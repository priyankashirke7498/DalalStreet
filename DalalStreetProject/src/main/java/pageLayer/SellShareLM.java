package pageLayer;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.TestBase;

public class SellShareLM extends TestBase {
	
	public SellShareLM()
	{
		PageFactory.initElements(driver, this);
	}
	
	//-----------------Sell Button1-----------------
	@FindBy(xpath="//a[contains(text(),'Sell')]")
	private WebElement sell_btn1;
		
	@FindBy(xpath="//input[@id='quantity']")
	private WebElement qty_txt;
	
	@FindBy(xpath="(//input[@class='form-control form-control'])[2]")
	private WebElement price_txt;
	
	@FindBy(xpath="//div[text()='Order Created successfully']")
	private WebElement status_msg;
		
	//--------------Sell Button2------------------------
	@FindBy(xpath="//button[contains(text(),'Sell')]")
	private WebElement Sell_btn2;
		
	public void clickOnSellButton1()
	{
		sell_btn1.click();
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
