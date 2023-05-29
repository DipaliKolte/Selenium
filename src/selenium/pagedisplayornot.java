package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class pagedisplayornot {
public static void main(String[] args) throws InterruptedException {
	FirefoxDriver rv=new FirefoxDriver();
	Thread.sleep(2000);
	rv.navigate().to("http://www.facebook.com");
	Thread.sleep(2000);
	rv.findElement(By.linkText("Forgotten password")).click();
	Thread.sleep(2000);
	String dispalyed_page=rv.getTitle();
	String exp_page="Forgotten Password";
	if(dispalyed_page.contains(exp_page))
	{
		System.out.println("forgot password page dispalyed");
	}
	else{System.out.println("forgot pasword page not displayed");
}
}}
