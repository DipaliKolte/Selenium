package PomWebpageClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FacebookforgotPaswordPage {

	private WebElement emailfield;
	private WebElement searchfield;
	
	public FacebookforgotPaswordPage(WebDriver driver) 
	{
		emailfield=driver.findElement(By.id("identify_email"));
		searchfield=driver.findElement(By.id("did_submit"));
		
	}
	public void setEmail(String mail)
	{
		emailfield.sendKeys(mail);
	}
	public void clickonsearchbutton()
	{
		searchfield.click();
	}
}
