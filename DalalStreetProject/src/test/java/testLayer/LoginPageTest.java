package testLayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageLayer.BuyShareLM;
import pageLayer.LoginPage;
import testBase.TestBase;

public class LoginPageTest extends TestBase {
	String expected_url = "https://www.apps.dalalstreet.ai/dashboard";

	@Test
	public void verifyLogin() throws InterruptedException
	{
		Thread.sleep(4000);
		String actual_url = login.getCurrenturl();
		Thread.sleep(4000);
		Assert.assertEquals(actual_url, expected_url);
		
	}

}
