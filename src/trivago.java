import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class trivago {
public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver=new FirefoxDriver();
	Thread.sleep(7000);
	driver.get("http://www.trivago.in/");
	Thread.sleep(7000);
	driver.findElement(By.id("input-auto-complete")).sendKeys("pune");
	Thread.sleep(7000);
	driver.findElement(By.xpath(".//button[@data-testid='search-button']")).click();
	Thread.sleep(7000);
	//driver.findElement(By.xpath(".//label[@data-title='Hotel']")).click();
	//Thread.sleep(7000);
	List<WebElement>ref1=driver.findElements(By.xpath(".//button[@class='text-left w-full truncate font-bold']/span[@itemprop='name']"));
	
	System.out.println("total no of hotels are"+ref1.size());
	
	
}
}
