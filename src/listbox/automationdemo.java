package listbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class automationdemo {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new FirefoxDriver();
	Thread.sleep(7000);
	driver.get("https://demo.automationtesting.in/Register.html");
	Thread.sleep(7000);
	WebElement ref = driver.findElement(By.id("Skills"));
	Select s=new Select(ref);
	List<WebElement> ref1 = s.getOptions();
	System.out.println("tottal are "+ref1.size());
	for(int i=0;i<ref1.size();i++)
	{
		s.selectByIndex(i);
		String str=ref1.get(i).getText();
		System.out.println(str);
	}
	int count=0;
	for(int i=0;i<ref1.size();i=i+2)
	{
	s.selectByIndex(i);
	String str1=ref1.get(i).getText();
	System.out.println(str1);
	count++;
	
	}
	System.out.println("total alternate options are"+count);
}
}
