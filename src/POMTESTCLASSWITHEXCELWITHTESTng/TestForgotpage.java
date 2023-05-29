package POMTESTCLASSWITHEXCELWITHTESTng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import POMclasswithexcelandTestNg.ForgotpasswordLink;
import POMclasswithexcelandTestNg.LoginPage;

public class TestForgotpage {
public static void main(String[] args) {
	WebDriver driver=new FirefoxDriver();
	driver.get("http://www.facebook.com");
	LoginPage lp2=new LoginPage(driver);
	lp2.forgotPasswod();
	
	ForgotpasswordLink fg=new ForgotpasswordLink(driver);
	
	fg.enterEmail("dipalikolte@gmail.com");
	fg.clickSearch();	
}
}
