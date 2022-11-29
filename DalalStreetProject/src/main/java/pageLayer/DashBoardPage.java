package pageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashBoardPage {

	public DashBoardPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//---------------obj repo------------------------
	
	@FindBy(xpath="(//input[@class='form-control'])[1]")
	private WebElement searchbox_txt;
	
	@FindBy(xpath="(//a[text()='WIPRO'])[2]")
	private WebElement options;
	
	@FindBy(xpath="//a[text()='Transactions']")
	private WebElement transactions_lnk;
	
	//--------------Action Methods------------------
	
	public void searchCompany()
	{
		searchbox_txt.sendKeys("wipro");
	}
	
	public void clickOnCompanyName()
	{
		options.click();
	}
	
	public void clickOnTransactionsLink(WebDriver driver)
	{
		Actions act = new Actions(driver);
		act.moveToElement(transactions_lnk).build().perform();
		transactions_lnk.click();
	}
}
