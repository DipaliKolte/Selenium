package selenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.firefox.FirefoxDriver;

public class classwork1 {
	public static void main(String[] args) throws InterruptedException {
		
		FirefoxDriver rv=new FirefoxDriver();
		Thread.sleep(2000);
		rv.get("http://facebook.com");
		Thread.sleep(2000);
		 String output=rv.getTitle();
		System.out.println(output);
		Thread.sleep(2000);
		rv.manage().window().maximize();
		Thread.sleep(2000);
		rv.get("http://www.google.com");
		Dimension d=new Dimension(400,600);
		rv.manage().window().setSize(d);
		System.out.println(d);
		Thread.sleep(2000);
		rv.manage().window().getSize();
		Dimension d2= new Dimension(400*2,600*2);
		rv.manage().window().setSize(d2);
		Thread.sleep(2000);
		rv.navigate().back();
		
		String exppage="Facebook";
		
		while(true)
		{
			Thread.sleep(2000);
			String displayedpage=rv.getTitle();
			if(displayedpage.contains(exppage))
			{
				break;
			}
		}
		
		String name=rv.getCurrentUrl();
		System.out.println(name);
		Thread.sleep(2000);
		int a=rv.manage().window().getPosition().getX();
		int b=rv.manage().window().getPosition().getY();
		
		Point p=new Point(a,b);

		System.out.println(p);
		Thread.sleep(2000);
		Point p1=new Point(500,500);
		rv.manage().window().setPosition(p1);
		System.out.println(p1);
		Thread.sleep(2000);
		rv.navigate().forward();
		rv.get("http://www.google.com");
		Thread.sleep(2000);
		rv.manage().window().minimize();
		rv.close();
		
	}

}

