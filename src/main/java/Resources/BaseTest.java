package Resources;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest 
{
	static 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aditya\\Downloads\\chromedriver.exe");
	}

	
	public static WebDriver driver;
	
	public static void getScreenShot(String result) throws IOException
	{
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\ScreenShot\\" + result + "picture.png");
		FileUtils.copyFile(src, des); 
	}
	
	
	public static void OpenBrowser(String sBrowser)
	{
		if(sBrowser.equals("chrome"))
		{
			 driver = new ChromeDriver();
			 driver.manage().window().maximize();
			 driver.get("http://qaclickacademy.com");
			 driver.manage().timeouts().implicitlyWait(10,TimeUnit.MILLISECONDS);
				
			
		}
		else
		{
			 driver = new FirefoxDriver();
			
		}
		
	}
	
	
	
	
	
	
}
