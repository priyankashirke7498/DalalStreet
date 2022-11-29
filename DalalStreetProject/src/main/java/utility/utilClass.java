package utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.PageFactory;

import testBase.TestBase;

public class utilClass extends TestBase {
	
	public utilClass()
	{
		PageFactory.initElements(driver, this);
	}
	
	public static void takeScreenShot(String filename) 
	{
		try
		{
		String path = "C:\\Users\\Admin\\eclipse-workspace\\DalalStreet\\Screenshot\\";
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File des = new File(path+filename+".png");
		FileHandler.copy(src, des);
		}
		catch(IOException e)
		{
			System.out.println("IO Exception - file not found");
			e.printStackTrace();
			
		}
		
	}

}
