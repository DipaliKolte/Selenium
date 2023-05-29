package selenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.firefox.FirefoxDriver;

public class homewoek1 {
public static void main(String[] args) throws InterruptedException {
	FirefoxDriver rv=new FirefoxDriver();
	Thread.sleep(3000);
int a=	rv.manage().window().getSize().getHeight();
System.out.println("height is"+a);
int b=rv.manage().window().getSize().getWidth();
System.out.println("width is"+b);
Thread.sleep(3000);
Dimension d=new Dimension(a/2,b/2);
rv.manage().window().setSize(d);
System.out.println("new size is"+d);
}
}
