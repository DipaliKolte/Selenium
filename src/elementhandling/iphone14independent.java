package elementhandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class iphone14independent {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.flipkart.com");
		Thread.sleep(8000);
		driver.findElement(By.name("q")).sendKeys("iphone14");
		Thread.sleep(8000);
		driver.findElement(By.className("L0Z3Pu")).click();
		Thread.sleep(8000);
		WebElement price=driver.findElement(By.xpath(".//div[text()='APPLE iPhone 14 (Purple, 128 GB)']//ancestor::div[@class='_3pLy-c row']//div[@class='_30jeq3 _1_WHN1']"));
		
		String p1=price.getText();
		System.out.println("price is"+p1);
		Thread.sleep(8000);
		WebElement ratings=driver.findElement(By.xpath(".//div[text()='APPLE iPhone 14 (Purple, 128 GB)']/..//span[contains(text(),' Ratings')]"));
		String r1=ratings.getText();
		System.out.println("ratings are"+r1);
		
		
	}

}
