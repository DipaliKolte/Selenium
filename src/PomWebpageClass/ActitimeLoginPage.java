package PomWebpageClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ActitimeLoginPage {
	private WebElement username;
	private WebElement password;
	private WebElement keppedmelogincheackbox;
	private WebElement loginbutton;
	
	public ActitimeLoginPage(WebDriver driver)
	{
		username=driver.findElement(By.id("username"));
		password=driver.findElement(By.name("pwd"));
		keppedmelogincheackbox	 = driver.findElement(By.id("keeploggedIncheackBox"));
		loginbutton=driver.findElement(By.id("loginbutton"));
	}
		public void setloginCredentials(String un,String pwd)

		{
			username.sendKeys(un);
			password.sendKeys(pwd);
		}
		public void selectKeepLoggedIncheackBox()
		{
			keppedmelogincheackbox.click();
		}
		public void clickonLoginButton() 
		{
			loginbutton.click();
		}
	}


