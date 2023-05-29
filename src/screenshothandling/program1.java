package screenshothandling;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;



public class program1 {
public static void main(String[] args) throws InterruptedException, IOException {
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.amazon.in/");
	Thread.sleep(7000);
	
	//take screenshot of main window
TakesScreenshot s=(TakesScreenshot)driver;	
File src=s.getScreenshotAs(OutputType.FILE);
//define loc with file name and extenstion
String path="../selenium/screenshot/image_1.png";
File dest=new File(path);
//save file
FileUtils.copyFile(src,dest);

driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone14");
driver.findElement(By.id("nav-search-submit-button")).click();
Thread.sleep(7000);
WebElement tgt = driver.findElement(By.xpath("(.//div[@class='a-section'])[2]"));
File src2=tgt.getScreenshotAs(OutputType.FILE);
String path2="../selenium/screenshot/image_2.png";
File dest2=new File(path2);
FileUtils.copyFile(src2, dest2);
Thread.sleep(7000);
driver.findElement(By.xpath("(.//div[@class='a-section'])[2]")).click();
Thread.sleep(7000);
//window swith
String parent_refid=driver.getWindowHandle();
Set<String> ref=driver.getWindowHandles();
//
for(String refid:ref)
{
	if(!parent_refid.equals(ref))
	{
		driver.switchTo().window(refid);
	}
}
Thread.sleep(7000);
WebElement tgt2 = driver.findElement(By.xpath(""));
File src3=tgt2.getScreenshotAs(OutputType.FILE);
String path3="../selenium/screenshot/image_3.png";
File dest3=new File(path3);
FileUtils.copyFile(src3, dest3);
}
}
