package testLayer;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageLayer.DashBoardPage;
import pageLayer.BuyShareLM;
import pageLayer.BuyShareIC;
import pageLayer.BuyShareIM;
import pageLayer.LoginPage;
import pageLayer.BuyShareLC;
import testBase.TestBase;

public class BuyShareTest extends TestBase {
	
	@Test
	public void verifyBuyShareLM() throws InterruptedException {
		
	String Expected_Status_msg = "Order Created successfully";
	
	Thread.sleep(2000);
	dash.searchCompany();
	Thread.sleep(2000);
	dash.clickOnCompanyName();
	Thread.sleep(2000);
	
	LM.clickOnBuyBtn1();
	LM.enterOnShareQty("2");
	Thread.sleep(4000);
	LM.clickOnBuyBtn2();
	Thread.sleep(2000);
	LM.getStatus();
	Assert.assertEquals(LM.getStatus(), Expected_Status_msg);
	Thread.sleep(5000);
	}
	
	@Test
	public void verifyBuyShareIM() throws InterruptedException {
		
	String Expected_Status_msg = "Order Created Successfully";
	Thread.sleep(2000);
	dash.searchCompany();
	dash.clickOnCompanyName();
	Thread.sleep(2000);

	IM.clickOnBuyBtn1();
	IM.clickOnIntradayButton();
	IM.clickOnMarketButton();
	IM.enterOnShareQty("1");
	Thread.sleep(4000);
	IM.clickOnBuyBtn2();
	Thread.sleep(2000);
	IM.getStatus();
	Assert.assertEquals(IM.getStatus(), Expected_Status_msg);
	Thread.sleep(4000);
	}
	
	@Test
	public void verifyBuyShareLC() throws InterruptedException {
		
	String Expected_Status_msg = "Limit Order Created Successfully";
	Thread.sleep(2000);
	dash.searchCompany();
	dash.clickOnCompanyName();
	Thread.sleep(2000);

	LC.clickOnBuyBtn1();
	LC.clickOnLongtermButton();
	LC.clickOnCustomButton();
	LC.enterOnShareQty("1");
	LC.clickOnPrice("420");
	Thread.sleep(4000);
	LC.clickOnBuyBtn2();
	Thread.sleep(2000);
	LC.getStatus();
	Assert.assertEquals(LC.getStatus(), Expected_Status_msg);
	Thread.sleep(4000);
	}
	
	
	@Test
	public void verifyBuyShareIC() throws InterruptedException {
		
	String Expected_Status_msg = "Limit Order Created Successfully";
	Thread.sleep(2000);
	dash.searchCompany();
	dash.clickOnCompanyName();
	Thread.sleep(2000);

	IC.clickOnBuyBtn1();
	IC.clickOnIntradayButton();
	IC.clickOnCustomButton();
	IC.enterOnShareQty("2");
	IC.clickOnPrice("420");
	Thread.sleep(2000);
	IC.clickOnBuyBtn2();
	Thread.sleep(4000);
	IC.getStatus();
	Assert.assertEquals(IC.getStatus(), Expected_Status_msg);
	Thread.sleep(4000);

	
	
	}

}