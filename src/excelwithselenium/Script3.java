package excelwithselenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Genericexcelwithselenium.excel;
import Genericexcelwithselenium.proprtyfile;

public class Script3 {
public static void main(String[] args) {
	WebDriver driver=new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get(proprtyfile.getData("appurl"));
	driver.findElement(By.xpath(".//a[contains(.,'Forgotten password?')]"));
	
	String un=excel.getData("Loginpage", 1, 0);
	
	driver.findElement(By.id("identify_email"));
	
	driver.findElement(By.id("forgot password button")).click();
	driver.close();	

}
}
