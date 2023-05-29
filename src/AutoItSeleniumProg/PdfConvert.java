package AutoItSeleniumProg;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PdfConvert {
	public static void main(String[] args) throws IOException {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.freepdfconvert.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath(".//a[@class='btn-wrapper upload-btn']")).click();
		Runtime.getRuntime().exec("../selenium/src/AutoIt_Prog/Script_01.exe");
	}
}
