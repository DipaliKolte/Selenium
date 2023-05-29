import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class gamil {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new FirefoxDriver();
	Thread.sleep(6000);
	driver.get("https://mail.google.com/mail/u/0/#inbox");
	Thread.sleep(7000);
	driver.findElement(By.id("identifierId")).sendKeys("dipalikolte93@gmail.com");
	Thread.sleep(7000);
driver.findElement(By.xpath(".//div[@class='VfPpkd-RLmnJb']")).click();
Thread.sleep(7000);

	
	
}
}
