package locator;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class creataccountfacebook {
public static void main(String[] args) throws InterruptedException 
{
	WebDriver driver=new FirefoxDriver();
	driver.get("http://www.facebook.com");
	Thread.sleep(2000);
	driver.findElement(By.linkText("Create new account")).click();
	Thread.sleep(2000);
	driver.findElement(By.name("firstname")).sendKeys("dipali");
	
	

	
}

}
