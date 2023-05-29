package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class tagname {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/ABC/Desktop/webpage/tagname.html");
		Thread.sleep(2000);
	
	WebElement un=driver.findElement(By.tagName("input"));
	//enter user name
	un.sendKeys("admin");
	Thread.sleep(2000);
	un.clear();
	Thread.sleep(2000);
	//enter new user name
	un.sendKeys("dipali");
	
	}
	
}
