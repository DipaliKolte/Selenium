import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class amazon {
public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver=new FirefoxDriver();
	driver.get("http://www.amazon.com");
	Thread.sleep(3000);
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone14");
	Thread.sleep(2000);
	driver.findElement(By.id("nav-search-submit-button")).click();
	
	
	
}

}
