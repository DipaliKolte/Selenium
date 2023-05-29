package POMTESTCLASSWITHEXCELWITHTESTng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import POMclasswithexcelandTestNg.LoginPage;

public class TestLoginpage {
	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com");
		
		LoginPage lp1=new LoginPage(driver);
	
		lp1.setCredentials("admin", "admin123");
		lp1.clickOnLogin();
		driver.close();
		}

}
