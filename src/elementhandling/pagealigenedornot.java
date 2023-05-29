package elementhandling;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class pagealigenedornot {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new FirefoxDriver();
		Thread.sleep(4000);
		driver.get("https://demo.actitime.com/login.do");
		WebElement tgt=driver.findElement(By.id("username"));
		Rectangle user=tgt.getRect();
		System.out.println(user.getX());
		System.out.println(user.getY());
		System.out.println(user.getHeight());
		System.out.println(user.getWidth());
		
		
	}

}
