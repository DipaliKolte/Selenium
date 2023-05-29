package PomWebpageClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FacebookRecoverypage {
	private WebElement continuebutton;
	
	public FacebookRecoverypage(WebDriver driver)
	{
		continuebutton=driver.findElement(By.name("reset-action"));
	}
	public void clickoncontinue() {
		continuebutton.click();
	}

}
