package pageLayer;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.TestBase;

public class BuyShareLC extends TestBase {
	
	public BuyShareLC()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[contains(text(),'Buy')]")
	private WebElement buy_btn1;
	
	@FindBy(xpath="(//label[contains(text(),'Long-term')])[1]")
	private WebElement longterm_btn;

	@FindBy(xpath="(//label[contains(text(),'Custom Limit')])[1]")
	private WebElement custom_btn;
	
	@FindBy(xpath="//input[@name='input-Qunatity']")
	private WebElement qty_txt;
	
	@FindBy(xpath="//button[contains(text(),'Buy')]")
	private WebElement buy_btn2;
	
	@FindBy(xpath="(//input[@class='form-control'])[4]")
	private WebElement price_txt;
	
	@FindBy(xpath="//div[text()='Limit Order Created Successfully']")
	private WebElement status_msg;

	
	public void clickOnBuyBtn1()
	{
		buy_btn1.click();
	}
	
	public void clickOnLongtermButton()
	{
		longterm_btn.click();
	}
	
	public void clickOnCustomButton()
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
