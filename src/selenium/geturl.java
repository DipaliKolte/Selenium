package selenium;

import org.openqa.selenium.firefox.FirefoxDriver;

public class geturl {
public static void main(String[] args) throws InterruptedException {
	FirefoxDriver rv=new FirefoxDriver();
	Thread.sleep(3000);
	int a=rv.manage().window().getSize().getHeight();
	System.out.println("height is : "+a);
	int b=rv.manage().window().getSize().getWidth();
	System.out.println("weidth is:"+b);
	System.out.println("...............................");
	int x_loc=rv.manage().window().getPosition().getX();
	System.out.println(" xlocation is:"+x_loc);
	int y_loc=rv.manage().window().getPosition().getY();
System.out.println("y_loc is:"+y_loc);
System.out.println("..............................");
String title=rv.getTitle();
System.out.println("titlteis:"+title);
String url=rv.getCurrentUrl();
System.out.println("url is :"+url);
}
}
