package testLayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageLayer.DashBoardPage;
import pageLayer.BuyShareIC;
import pageLayer.BuyShareIM;
import pageLayer.LoginPage;
import pageLayer.SellShareIC;
import pageLayer.BuyShareLC;
import pageLayer.BuyShareLM;
import pageLayer.SellShareIM;
import pageLayer.SellShareLC;
import pageLayer.SellShareLM;
import testBase.TestBase;

public class SellShareTest extends TestBase {
	
	@Test
	public void verifySellShareLM() throws InterruptedException
	{
		String Expected_Status_msg = "Order Created successfully";
		Thread.sleep(2000);

		dash.searchCompany();
		dash.clickOnCompanyName();
		Thread.sleep(2000);
		
		LM1.clickOnSellButton1();
		LM1.enterOnShareQty("1");
		Thread.sleep(4000);
		LM1.clickOnSellButton2();
		Thread.sleep(2000);
		LM1.getStatus();
		Assert.assertEquals(LM1.getStatus(), Expected_Status_msg);
		Thread.sleep(4000);
	}
	
	@Test
	public void verifySellShareIM() throws InterruptedException
	{
		String Expected_Status_msg = "Order Created Successfully";
		Thread.sleep(2000);

		dash.searchCompany();
		dash.clickOnCompanyName();
		Thread.sleep(2000);

	
		IM1.clickOnSellButton1();
		IM1.clickOnIntradayButton();
		IM1.clickOnMarketButton();
		IM1.enterOnShareQty("1");
		IM1.clickOnPrice("390");
		Thread.sleep(4000);
		IM1.clickOnSellButton2();
		Thread.sleep(2000);
		IM1.getStatus();
		Assert.assertEquals(IM1.getStatus(), Expected_Status_msg);
		Thread.sleep(4000);
	}
	
	@Test
	public void verifySellShareLC() throws InterruptedException
	{
		String Expected_Status_msg = "Limit Order Created Successfully";
		Thread.sleep(2000);

		dash.searchCompany();
		dash.clickOnCompanyName();
		Thread.sleep(2000);
		LC1.clickOnSellButton1();
		LC1.clickOnLongtermButton();
		LC1.clickOnCustomeLimitButton();
		LC1.enterOnShareQty("1");
		LC1.clickOnPrice("400");
		Thread.sleep(4000);
		LC1.clickOnSellButton2();
		Thread.sleep(2000);
		LC1.getStatus();
		Assert.assertEquals(LC1.getStatus(), Expected_Status_msg);
		Thread.sleep(4000);
	}
	
	@Test
	public void verifySellShareIC() throws InterruptedException
	{
		String Expected_Status_msg = "Order Created successfully";
		Thread.sleep(2000);

		dash.searchCompany();
		dash.clickOnCompanyName();
		Thread.sleep(2000);
		IC1.clickOnSellButton1();
		IC1.clickOnIntradayButton();
		IC1.clickOnCustomeLimitButton();
		IC1.enterOnShareQty("1");
		IC1.clickOnPrice("400");
		Thread.sleep(2000);
		IC1.clickOnSellButton2();
		Thread.sleep(4000);
		IC1.getStatus();
		Assert.assertEquals(IC1.getStatus(), Expected_Status_msg);
		Thread.sleep(4000);

	}

}

