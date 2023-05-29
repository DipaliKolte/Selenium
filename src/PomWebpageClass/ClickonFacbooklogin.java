package PomWebpageClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ClickonFacbooklogin {
private WebElement forgotpwdlink;
 
public ClickonFacbooklogin(WebDriver driver)
{
	forgotpwdlink=driver.findElement(By.linkText("Forgotten password?"));
}
public void clickonforgotpassword() {
	forgotpwdlink.click();
}
} 
