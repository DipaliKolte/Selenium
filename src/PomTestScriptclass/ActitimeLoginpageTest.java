package PomTestScriptclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import PomWebpageClass.ActitimeLoginPage;

public class ActitimeLoginpageTest {
public static void main(String[] args) {
	WebDriver driver=new FirefoxDriver();
	driver.get("https://demo.actitime.com/login.do");
	
	ActitimeLoginPage rv=new ActitimeLoginPage(driver);
	rv.setloginCredentials("admin", "manager");
	rv.selectKeepLoggedIncheackBox();
	rv.clickonLoginButton();
	
}
}
