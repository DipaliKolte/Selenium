package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class id {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new FirefoxDriver();
	driver.get("file:///C:/Users/ABC/Desktop/webpage/id.html");
	Thread.sleep(3000);
	
	WebElement un=driver.findElement(By.tagName("input"));
	un.sendKeys("dipali");
	Thread.sleep(2000);
	WebElement pwd=driver.findElement(By.id("pass"));
	pwd.sendKeys("aniket");
}

}

