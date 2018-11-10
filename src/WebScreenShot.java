

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class WebScreenShot
{
	
	@Test
	 public void TestJavaS1() throws Throwable
	{
	// Open Firefox
		System.setProperty("webdriver.gecko.driver", "G:\\Rebill_Selenium_jar\\FirefoxDriver\\geckodriver.exe");
	 WebDriver driver=new FirefoxDriver();
	 
	// Maximize the window in Browser Window
	driver.manage().window().maximize();
	 
	// Pass the url
	driver.get("http://www.google.com");
	 
	// Take screenshot and store as a file format
	File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	try {
	 // now copy the  screenshot to desired location using copyFile //method
	FileUtils.copyFile(src, new File(System.getProperty("user.dir")+"\\Screenshot\\"+System.currentTimeMillis()+".png"));
	
	Thread.sleep(5000);
	driver.close();
	}
	 
	
	catch (IOException e)
	 {
	  System.out.println(e.getMessage());
	 
	 }
	}

}
