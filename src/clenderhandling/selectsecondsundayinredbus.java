package clenderhandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class selectsecondsundayinredbus {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new FirefoxDriver();
	Thread.sleep(6000);
	driver.get("https://www.redbus.in/");
	
	driver.findElement(By.id("onward_cal")).click();
	
	  driver.findElement(By.xpath(".//table[@class='rb-monthTable first last']/tbody/tr[1]/td[2]")).click();
driver.findElement(By.xpath(".//table[@class='rb-monthTable first last']/tbody/tr[2]/th[text()='Su']/../../tr[4]/td[7]")).clear();

}
}
