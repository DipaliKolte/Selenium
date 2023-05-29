package mock1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class goibiba {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		Thread.sleep(4000);
		driver.get("http://www.goibibo.com");
		Thread.sleep(4000);
		driver.findElement(By.xpath(".//span[@class='sc-iwjdpV jUsACy fswDownArrow']")).click();
		Thread.sleep(4000);
		WebElement today_date=driver.findElement(By.xpath("//div[@aria-selected='true']"));
		
		if(today_date.isEnabled())
		{
		today_date.click();
		Thread.sleep(4000);
		System.out.println("element is enabled");
		}
		else
		{
			System.out.println("element is disabled");
		}

	}

}
