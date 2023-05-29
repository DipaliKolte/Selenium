package programming;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class program1 {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new FirefoxDriver();
	Thread.sleep(2000);
	driver.get("http://www.flipkart.com");
	Thread.sleep(2000);
	String a=driver.getTitle();
	System.out.println(a);
	Thread.sleep(2000);
	WebDriver rv=new ChromeDriver();
	Thread.sleep(2000);
	rv.get("http://www.flipkart.com");
	Thread.sleep(2000);
	String b=rv.getTitle();
	System.out.println(b);
	if(a.contains(b))
	{
		System.out.println("title is same");
	}
		else
		{System.out.println("title is not match");
	}
}
}
