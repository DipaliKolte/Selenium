import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class cricinfo {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new FirefoxDriver();
		Thread.sleep(7000);
		driver.get("https://www.espncricinfo.com/");
		Thread.sleep(7000);
		driver.findElement(By.xpath("(.//div[@class='ds-w-[288px] card scorecard'])[last()]")).click();
		Thread.sleep(7000);
		

	}

}
