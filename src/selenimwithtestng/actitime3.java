package selenimwithtestng;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class actitime3 extends BaseProgram {

	@DataProvider
	public Object[][] testData()
	{
		Object[][] rv=new Object[1][1];
		rv[0][0]="admin";
		 return rv;
	}
	@Test(dataProvider="testData")
	public void testForgotPassword(String un)
{
	driver.findElement(By.id("toPasswordRecoveryPageLink")).click();
	driver.findElement(By.id("forgetPasswordEmailOrUsername")).sendKeys(un);
	driver.findElement(By.id("forgetPasswordButtonContainer")).click();
		
		}
}
