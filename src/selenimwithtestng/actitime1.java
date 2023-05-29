package selenimwithtestng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class actitime1 extends BaseProgram {
	@DataProvider
	public Object[][] testData()
	{
		Object[][] rv=new Object[1][2];
		rv[0][0]="admin";
		rv[0][1]="manager";
		return rv;
	}
@Test(dataProvider="testData")
public void testactimeLogin(String un,String pwd)
{
	
	
	driver.findElement(By.id("username")).sendKeys(un);
	driver.findElement(By.name("pwd")).sendKeys(pwd);
	driver.findElement(By.id("loginButton")).click();
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
	wait.until(ExpectedConditions.titleContains("Time"));
	String title=driver.getTitle();
	Assert.assertEquals(title, "actiTIME - Enter Time-Track");
	
}
}