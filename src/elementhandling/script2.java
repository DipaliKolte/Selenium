package elementhandling;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class script2 {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new FirefoxDriver();
	driver.get("http://demo.actitime.com/login.do");
     Thread.sleep(2000);
     WebElement un=driver.findElement(By.id("username"));
     un.sendKeys("admin");
     un.sendKeys(Keys.CONTROL+"a");
     un.sendKeys(Keys.CONTROL,"c");
     Thread.sleep(2000);
     un.sendKeys(Keys.chord(Keys.TAB,Keys.CONTROL+"v"));
     un.sendKeys(Keys.chord(Keys.TAB,Keys.CONTROL+"v"));


}
}
