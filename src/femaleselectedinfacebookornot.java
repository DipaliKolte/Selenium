import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class femaleselectedinfacebookornot {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new FirefoxDriver();
	Thread.sleep(2000);
	driver.get("http://www.facebook.com/");
	Thread.sleep(5000);
	driver.findElement(By.xpath("(.//a[normalize-space()='Create new account'])[1]")).click();
	WebElement female=driver.findElement(By.xpath(".//input[@value='1']"));
	female.click();
	Thread.sleep(8000);
	boolean output1=female.isSelected();
	if(output1)
	{
		System.out.println("female option redio button selected");
		
	}
	else
	{
		System.out.println("female option redio button is not selected");
	}
	WebElement male=driver.findElement(By.xpath(".//input[@value='2']"));
	male.click();
	Thread.sleep(8000);
	boolean output2=female.isSelected();
	if(output2)
	{
		System.out.println("female option not deselected");
	}
	else
	{
		System.out.println("female redio button deselected");
	}
	
	}
	
}