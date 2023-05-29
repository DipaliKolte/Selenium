package elementhandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class actitimecheachboxselect {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		Thread.sleep(3000);
		driver.get("http://demo.actitime.com/login.do");
		Thread.sleep(3000);
		driver.findElement(By.id("username")).sendKeys("admin");
		Thread.sleep(3000);
		driver.findElement(By.name("pwd")).sendKeys("manager");
		Thread.sleep(4000);
		
		driver.findElement(By.id("keepLoggedInCheckBox")).click();
		Thread.sleep(4000);
		driver.findElement(By.id("loginButtonContainer")).click();
		Thread.sleep(9000);
		driver.findElement(By.id("container_tasks")).click();
		Thread.sleep(8000);
	
		
		
		
		
		
		
	}

}
