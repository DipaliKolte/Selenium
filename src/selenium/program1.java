package selenium;

import org.openqa.selenium.firefox.FirefoxDriver;

public class program1 {
	public static void main(String[] args) throws InterruptedException {
		FirefoxDriver ff=new FirefoxDriver();
		Thread.sleep(5000);
		ff.get("http://www.facebook.com");
		Thread.sleep(5000);
		ff.close();
	}

	
}
