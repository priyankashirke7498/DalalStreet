package testLayer;

import org.testng.annotations.Test;

import pageLayer.DashBoardPage;
import pageLayer.LoginPage;
import pageLayer.TransactionPage;
import testBase.TestBase;

public class TransactionTest extends TestBase {
	
	@Test
	public void clickOnTransaction() throws InterruptedException
	{
		Thread.sleep(4000);
		dash.clickOnTransactionsLink(driver);
		Thread.sleep(4000);
		trans.getTransactionsDetails(driver);

	}

}
