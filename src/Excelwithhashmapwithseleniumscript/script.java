package Excelwithhashmapwithseleniumscript;



import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import GenericExcelwithHashmapwithSelenium.Hashmap;

public class script  {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.facebook.com");
Thread.sleep(8000);		
		
Hashmap.addDataIntoMap("Signup page");

driver.findElement(By.linkText("create new account")).click();

Thread.sleep(8000);

driver.findElement(By.name("firstname")).sendKeys(Hashmap.getDatafromHashMap("firstname"));

driver.findElement(By.name("lastname")).sendKeys(Hashmap.getDatafromHashMap("lastname"));

driver.findElement(By.name("reg_email")).sendKeys(Hashmap.getDatafromHashMap("Email-ID"));

driver.findElement(By.name("reg-password-")).sendKeys(Hashmap.getDatafromHashMap("password"));


	}

}

