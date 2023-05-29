package PROPERTYFILE;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class facebook2 {
	public static void main(String[] args) throws IOException {
		//copy file from rom to ram
		String filepath="../selenium/actitime.properties";
		FileInputStream f =new FileInputStream(filepath);
		
		//open properties file
		Properties p=new Properties();
		p.load(f);
		//selenium codes
		WebDriver driver=new FirefoxDriver();
		driver.get(p.getProperty("appurl"));
		
		driver.findElement(By.id("email")).sendKeys(p.getProperty("username"));
		driver.findElement(By.name("pass")).sendKeys(p.getProperty("password"));
		driver.findElement(By.id("loginbutton")).click();
	
		
}
}