package mock1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class program1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		Thread.sleep(2000);
		driver.get("https://www.spicejet.com/");
		WebElement today_date=driver.findElement(By.xpath(".//contains(text(),'Departure Date')]"));
		today_date.click();
		Thread.sleep(8000);
		today_date.isDisplayed();
		WebElement return_date=driver.findElement(By.xpath(".//div[contains(text(),'Return Date']"));
		
		return_date.click();
		return_date.sendKeys("oct10");
		return_date.isDisplayed();
		System.out.println(today_date);
		System.out.println(return_date);
		
		
	}

}
