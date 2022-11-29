package testBase;

import java.time.Duration;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import pageLayer.BuyShareIC;
import pageLayer.BuyShareIM;
import pageLayer.BuyShareLC;
import pageLayer.BuyShareLM;
import pageLayer.DashBoardPage;
import pageLayer.LoginPage;
import pageLayer.SellShareIC;
import pageLayer.SellShareIM;
import pageLayer.SellShareLC;
import pageLayer.SellShareLM;
import pageLayer.TransactionPage;
import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	
	
	public static WebDriver driver;
	public static Logger logger;
	public  LoginPage login;
	public  DashBoardPage dash;
	public  TransactionPage trans;
	
	public static BuyShareLM LM;
	public static BuyShareIM IM;
	public static BuyShareLC LC;
	public static BuyShareIC IC;
	
	public static SellShareLM LM1;
	public static SellShareIM IM1;
	public static SellShareLC LC1;
	public static SellShareIC IC1;
	
	@BeforeClass
	public void start()
	{
		logger = Logger.getLogger("DalalStreet Automation Framework");
		PropertyConfigurator.configure("log4j.properties");
		logger.info("frameweok execution started");
	}
	@AfterClass
	public void end()
	{
		logger.info("framework execution completed");
	}
	@Parameters("browser")
	@BeforeMethod
	public void Setup(String br)
	{
		if(br.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if(br.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		else if(br.equalsIgnoreCase("edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		
		driver.get("https://www.apps.dalalstreet.ai/login");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		logger.info("Url launches, maximize and provided waits");
			
		//----------------object creation-------------------------------
		
		login = new LoginPage(driver);
		dash = new DashBoardPage(driver);
		trans = new TransactionPage(driver);
		logger.info("object creation");
		
		//-------------------login steps----------------------------
		
		login.enterEmailID();
		login.enterPassword();
		login.clickonLogin();
		logger.info("login successfully");

		//----------------buy share--------------------------------------
		LM = new BuyShareLM();
		IM = new BuyShareIM();
		LC = new BuyShareLC();
		IC = new BuyShareIC();
		//------------------sell share-----------------------------------
		LM1 = new SellShareLM();
		IM1 = new SellShareIM();
		LC1 = new SellShareLC();
		IC1 = new SellShareIC();
		
		
		
	}
//	@AfterMethod
//	public void tearDown()
//	{
//		driver.quit();
//	}

}
