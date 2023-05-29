package selenimwithtestng;

import org.openqa.selenium.By;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import graphql.Assert;

public class actitime2 extends BaseProgram {
	
	@DataProvider
	public Object[][] testData()
	{
		Object[][] rv=new Object[1][2];
		rv[0][0]="admin1";
		rv[0][1]="manager123";
		return rv;
	}
	@Test(dataProvider="testData")
	public void testInvalidLogin(String un,String pwd)
	
	{
		driver.findElement(By.id("username")).sendKeys(un);
	driver.findElement(By.name("pwd")).sendKeys(pwd);
	driver.findElement(By.id("loginButton")).click();
	boolean value = driver.findElement(By.xpath(".//span[contains(text(),'Username')]")).isDisplayed();
		Assert.assertTrue(value);
	}
	
}
