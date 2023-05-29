package selenium;
import org.openqa.selenium.firefox.FirefoxDriver;
public class program2 {
public static void main(String[] args) throws InterruptedException {
	FirefoxDriver ff=new FirefoxDriver();
	Thread.sleep(3000);
	ff.get("http://www.google.com");
	FirefoxDriver ff2=new FirefoxDriver();
	Thread.sleep(3000);
	ff2.get("http://www.facebook.com");
	Thread.sleep(3000);
	ff.close();
	ff2.quit();
	
}
}
