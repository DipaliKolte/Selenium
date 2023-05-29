package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class loginfacebook {
	public static void main(String[] args) throws InterruptedException {
		
	
WebDriver driver=new FirefoxDriver();
driver.get("http://www.facebook.com");
Thread.sleep(2000);
driver.findElement(By.id("email")).sendKeys("dipalikoltw9");
Thread.sleep(2000);
driver.findElement(By.id("pass")).sendKeys("aniket");
Thread.sleep(2000);
driver.findElement(By.name("login")).click();
Thread.sleep(2000);
driver.findElement(By.linkText("Forgotten password?")).click();
	}

}
