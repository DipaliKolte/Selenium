package programming;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class program2 {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new FirefoxDriver();
	driver.get("http://www.google.com");
	Thread.sleep(2000);
	int a=driver.manage().window().getSize().getHeight();
	Thread.sleep(2000);
	int b=driver.manage().window().getSize().getWidth();
	Thread.sleep(2000);
	System.out.println(a);
	System.out.println(b);
	Thread.sleep(2000);
	int c=driver.manage().window().getPosition().getX();
	int d=driver.manage().window().getPosition().getY();
	System.out.println(c);
	System.out.println(d);
	
	
}
}
