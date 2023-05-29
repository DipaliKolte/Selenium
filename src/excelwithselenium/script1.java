package excelwithselenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Genericexcelwithselenium.excel;
import Genericexcelwithselenium.proprtyfile;

public class script1 {
public static void main(String[] args) 
{
	WebDriver driver=new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get(proprtyfile.getData("appurl"));
	
	String un=excel.getData("Loginpage", 1, 0);
	driver.findElement(By.id("username")).sendKeys(un);
	
	String pwd=excel.getData("Loginpage", 1, 1);
	driver.findElement(By.name("pwd")).sendKeys(pwd);

	driver.findElement(By.id("LoginButton")).click();
	
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
	
	wait.until(ExpectedConditions.titleContains("Time-Track"));
	wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Logout")));
	driver.findElement(By.id("logoutLink")).click();
	driver.close();
	
	
}

}
