package POMclasswithexcelandTestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy(id="email")
	private  WebElement email;
	@FindBy(id="pass")
	private WebElement password;
	@FindBy(id="u_0_5_EO")
	private WebElement loginbutton;
	@FindBy(linkText ="Forgotten password?")
	private WebElement forgotpassword;
	@FindBy(id="u_0_0_nc")
	private WebElement createnewaccount;
	
	WebDriver driver;
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void setCredentials(String emid,String pwd)
	{
		email.sendKeys(emid);
		password.sendKeys(pwd);
		
	}
	public void clickOnLogin() 
	{
		loginbutton.click();
		
	}
	public void forgotPasswod()
	{
		forgotpassword.click();
	}
	public void createnewAccount() {
		createnewaccount.click();
	}

}
