package selenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.firefox.FirefoxDriver;

public class program4 {
public static void main(String[] args) throws InterruptedException {
	FirefoxDriver ff=new FirefoxDriver();
	Thread.sleep(3000);
	ff.navigate().to("http://www.google.com");
	Thread.sleep(3000);
	Dimension d=new Dimension(300,500);
	ff.manage().window().setSize(d);
	Thread.sleep(3000);
	Point p=new Point(150,300);
	ff.manage().window().setPosition(p);
	ff.manage().window().maximize();
	Thread.sleep(3000);
	ff.manage().window().fullscreen();
	Thread.sleep(3000);
	ff.manage().window().minimize();
}
}
