package POMTESTCLASSWITHEXCELWITHTESTng;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import POMclasswithexcelandTestNg.LoginPage;
import POMclasswithexcelandTestNg.SigninPage;

public class Testcreateaccount {
	public static void main(String[] args) {
		
	
	WebDriver driver=new FirefoxDriver();
    driver.get("https://www.facebook.com");
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    
	LoginPage lp=new LoginPage(driver);
	lp.createnewAccount();
	
	SigninPage sp=new SigninPage(driver);
	sp.setCredentials("dipali", "kolte", "9921799287","Aniket92@");
	sp.clickonSignup();
	
	driver.close();

}
}