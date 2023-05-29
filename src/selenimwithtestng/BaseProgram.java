package selenimwithtestng;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import com.beust.jcommander.Parameter;

public class BaseProgram {
	WebDriver driver;
 @Parameters("browsername")
	@BeforeClass
	public void openBrowser(String browsername)
	{
		if(browsername.equals("Firefox"))
		{
			driver=new FirefoxDriver();
		}
		else if(browsername.equals("Chrome"))
		{
			driver=new ChromeDriver();
			
		}
		else
		{
			driver=new EdgeDriver();
			
		}
	}
	@BeforeMethod
	public void openApp()
	{
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	
	@AfterClass
	public void closeBrowser()
	{
		driver.close();
	}

}
