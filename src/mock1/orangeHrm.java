package mock1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.Color;

public class orangeHrm {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(4000);
		WebElement trg_page=driver.findElement(By.name("username"));
		String exp_page="username";
		boolean output=trg_page.isDisplayed();
		if(output)
		{
			System.out.println("user name field is diplayed");
		}
		
			else
			{
				System.out.println("user name field is not dispalyed");
				
		}
		WebElement targ_pwd=driver .findElement(By.name("password"));
		boolean output1=targ_pwd.isDisplayed();
		if(output1)
		{
			System.out.println("password field is dipalyed");
		}
		else {
			System.out.println("password field is not displayed");
		}
		WebElement login=driver.findElement(By.className(".//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']"));
		String login_color=login.getCssValue("background-color");
		System.out.println("color of login button is"+login_color);
		String login_color1=Color.fromString(login_color).asHex();
		System.out.println("converted corolr code of login button is"+login_color1);
		Thread.sleep(4000);
		login.click();
		WebElement msg=driver.findElement(By.xpath("span[text()='Required']"));
		Thread.sleep(3000);
		String err_msg=msg.getText();
		Thread.sleep(3000);
		System.out.println("reeor mag is:"+err_msg);
				
	}
}
