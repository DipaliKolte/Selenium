package Hashmapwithselenium;

import org.apache.commons.collections4.map.HashedMap;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Script4 {
public static String testData(String key)
{
	HashedMap<String, String> rv=new HashedMap<String,String>();
	rv.put("EmailId", "admin@gmail.com");
	rv.put("Password","admin123");
	return rv.get(key);
}
public static void main(String[] args) {
	WebDriver driver=new FirefoxDriver();
	driver.get("http://www.facebook.com");
	
	String email=testData("EmailId");
	driver.findElement(By.id("email")).sendKeys(email);
	
	String pwd=testData("Password");
	driver.findElement(By.id("pass")).sendKeys(pwd);
	
}
}
