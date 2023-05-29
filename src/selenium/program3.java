package selenium;

import org.openqa.selenium.firefox.FirefoxDriver;

public class program3 {
public static void main(String[] args) throws InterruptedException {
	FirefoxDriver ff=new FirefoxDriver();
	
	ff.get("http://www.google.com");
	Thread.sleep(3000);
	
	ff.get("http://www.facebook.com");
	Thread.sleep(3000);
	ff.navigate().back();
	Thread.sleep(3000);
	ff.navigate().forward();
	Thread.sleep(3000);
	ff.navigate().refresh();
	Thread.sleep(3000);
	ff.close();
	
	
	
	
}
}
