package pageLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TransactionPage {
	
	
	public TransactionPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	//------------------------------------------------
	private By data1 = By.xpath("//table/tbody/tr[1]/td[2]");
	
	
	
	
	
	
	//------------------------------------------------
	
	public void getTransactionsDetails(WebDriver driver)
	{
		for(int i=1;i<=10;i++)
		{
			for(int j=1;j<=9;j++)
			{
				String data =driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td["+j+"]")).getText();
				System.out.print(data + "  ");
			}
			System.out.println();
		}
	}

	
	
//	String data =driver.findElement(data1).getText();
//	return data;
}
