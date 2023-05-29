package PomTestScriptclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import PomWebpageClass.ClickonFacbooklogin;
import PomWebpageClass.FacebookRecoverypage;
import PomWebpageClass.FacebookforgotPaswordPage;

public class TestFacebookLogin {
public static void main(String[] args) {
	WebDriver driver=new FirefoxDriver();
	driver.get("http://www.facebook.com");
	ClickonFacbooklogin rv1=new ClickonFacbooklogin(driver);
	rv1.clickonforgotpassword();
	FacebookforgotPaswordPage rv2=new FacebookforgotPaswordPage(driver);    
	rv2.setEmail("admin123@gmail.com");
	rv2.clickonsearchbutton();
	FacebookRecoverypage rv3=new FacebookRecoverypage(driver);
	rv3.clickoncontinue();
	

}
}
