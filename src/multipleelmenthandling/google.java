package multipleelmenthandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class google {
	

	public static void main(String[] args)throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		Thread.sleep(7000);
		driver.get("http://www.google.com");
		Thread.sleep(7000);
		List<WebElement> rv = driver.findElements(By.tagName("a"));
		int count=rv.size();
		System.out.println("no of links are"+count);
		Thread.sleep(7000);
		
		for(int a=0;a<rv.size();a++)
		{
			WebElement ref = rv.get(a);
			String txt=ref.getText();
			System.out.println(txt);
			Thread.sleep(7000);
		}
		int visible=0;
		int invisible=0;
		for(int a=0;a<rv.size();a++)
		{
			
			WebElement link=rv.get(a);
		if(link.isDisplayed())
		{
			visible++;
		}
		else
		{
			invisible++;
		}
		}
		System.out.println("***************************************");
		System.out.println("visible links are"+visible);
		System.out.println("invisible links are"+invisible);
		System.out.println("*************************");
		
		
		for(int a=0 ;a<rv.size();a++)
		{
			String str=rv.get(a).getAttribute("href");
			System.out.println(str);
			
		}
		}
		
	}

