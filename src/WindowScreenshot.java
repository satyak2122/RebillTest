 

import java.awt.AWTException;
import java.awt.HeadlessException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class WindowScreenshot 
{
	@Test
	 public void TestJavaS1() throws Exception 
	{
		try
		{
	// Open Firefox
		System.setProperty("webdriver.gecko.driver", "G:\\Rebill_Selenium_jar\\FirefoxDriver\\geckodriver.exe");
	 WebDriver driver=new FirefoxDriver();
	 
	// Maximize the window
	driver.manage().window().maximize();
	 
	// Pass the url
	driver.get("http://www.google.com");
	
	// This code will capture screenshot of current screen		
	BufferedImage image = new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
		    
	// This will store screenshot on Specific location
	ImageIO.write(image, "png", new File(System.getProperty("user.dir")+"\\WindowScreenshot\\"+System.currentTimeMillis()+".png")); 
	 
	Thread.sleep(5000);
	driver.close();
	}
	 
	catch (IOException e)
	 {
	  System.out.println(e.getMessage());
	 
	 }
	}
}
