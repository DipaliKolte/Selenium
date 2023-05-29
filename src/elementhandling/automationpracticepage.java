package elementhandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class automationpracticepage {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		Thread.sleep(4000);
		driver.get("https://automatenow.io/sandbox-automation-testing-practice-website/form-fields/");
		
		Thread.sleep(4000);
		driver.findElement(By.id("g1103-name")).sendKeys("dipali aniket kolte");
		Thread.sleep(4000);
		driver.findElement(By.xpath(".//label[.='What is your favorite drink?']")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath(".//input[@value='Water']")).click();
		Thread.sleep(7000);
		
		driver.findElement(By.xpath(".//input[@value='Blue']")).click();
		Thread.sleep(7000);
		
		driver.findElement(By.xpath(".//span[@class='ui-selectmenu-icon ui-icon ui-icon-triangle-1-s']")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath(".//div[@class='ui-menu-item-wrapper ui-state-active']")).click();
	}

}
