package programming;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class automationprctice {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		Thread.sleep(7000);
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.findElement(By.id("RESULT_TextField-1")).sendKeys("dipali");
		Thread.sleep(7000);
		driver.findElement(By.id("RESULT_TextField-2")).sendKeys("kolte");
		Thread.sleep(7000);
	}
}
