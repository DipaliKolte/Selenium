package elementhandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class iddisplay {
	public static void main(String[] args) throws InterruptedException {

WebDriver driver=new FirefoxDriver();
driver.get("http://www.facebook.com");
Thread.sleep(2000);
driver.findElement(By.xpath(".//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
Thread.sleep(2000);
driver.findElement(By.xpath(".//input[@name='reg_email__']")).sendKeys("dipalikolte93@gmail.com");
Thread.sleep(2000);
WebElement msg=driver.findElement(By.xpath(".//.//input[@aria-label='Re-enter email address']"));
msg.isDisplayed();
boolean output=msg.isDisplayed();
if(output)
{
	System.out.println("reenter filled open");
}
else
{
	System.out.println("reenter filled not dispaly");
}
	}

}
