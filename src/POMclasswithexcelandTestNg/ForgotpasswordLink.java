package POMclasswithexcelandTestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgotpasswordLink {
	@FindBy(id="identify_email")
private WebElement emailaddress;
	
	@FindBy(id="did_submit")
	private WebElement search;

	WebDriver driver;
	public ForgotpasswordLink(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	public void enterEmail(String mail)

		{
		emailaddress.sendKeys(mail);
		}
	public void clickSearch()
	{
		search.click();
	}
}
