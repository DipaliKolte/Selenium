package multipleelmenthandling;

import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class flipkart {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver rv=new FirefoxDriver();
		Thread.sleep(5000);
		rv.get("http://www.flipkart.com");
		
		Thread.sleep(4000);
		rv.findElement(By.name("q")).sendKeys("iphone14");
		Thread.sleep(7000);	
		rv.findElement(By.className("L0Z3Pu")).click();
		Thread.sleep(7000);
		List<WebElement> ref=rv.findElements(By.xpath(".//div[starts-with(text(),'APPLE iPhone 14 (')]"));
		System.out.println("total count is"+ref.size());
		Thread.sleep(7000);
		List<WebElement> price=rv.findElements(By.xpath(".//div[starts-with(text(),'APPLE iPhone 14 (')]//ancestor::div[@class='_3pLy-c row']//div[@class='_30jeq3 _1_WHN1']"));
		
		for(int a=0;a<ref.size();a++)
		{
			WebElement str=ref.get(a);
			
			System.out.println("model name are"+str.getText());	
			Thread.sleep(7000);
			WebElement pp=price.get(a);
			
			System.out.println("model price is"+pp.getText());
		}	
		//print highest and lowest price of iPhone 14
		TreeSet<Integer> ref3=new TreeSet<>(); 
		for(int a=0;a<price.size();a++)
		{
			String str=price.get(a).getText().substring(1).replaceAll(",","");
			int price1=Integer.parseInt(str);
			ref3.add(price1);
		}
		System.out.println("lowest price is"+ref3.first());
		System.out.println("heigtest price is"+ref3.last());
			
	}
	
}
