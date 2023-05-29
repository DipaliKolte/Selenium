package multipleelmenthandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class flipkart2 {
public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver=new FirefoxDriver();
	Thread.sleep(7000);
	driver.get("http://www.flipkart.com");
	Thread.sleep(7000);
	driver.findElement(By.xpath(".//button[@class='_2KpZ6l _2doB4z']")).click();
	Thread.sleep(4000);
	List<WebElement> ref1 = driver.findElements(By.xpath(".//img"));
	System.out.println("total no of images are :"+ref1.size());
	Thread.sleep(6000);
	for(int i=0;i<ref1.size();i++)
	{
	
		
		String alt_attribute=ref1.get(i).getAttribute("Alt");
		System.out.println(alt_attribute);
	}
	int count_enabled=0;
	int count_disabled=0;
	for(int i=0;i<ref1.size();i++)
	{
		WebElement ref2=ref1.get(i);
		
		if(ref2.isEnabled())
		{
		count_enabled++;	
		}
		else
		{
			count_disabled++;
		}
	}
	System.out.println("enabled count is"+count_enabled);
	System.out.println("disabled count is"+count_disabled);	
}
}
