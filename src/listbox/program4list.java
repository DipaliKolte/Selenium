package listbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.support.ui.Select;

public class program4list {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new FirefoxDriver();
	driver.get("file:///C:/Users/ABC/Desktop/listbox2.html");
	Thread.sleep(7000);
	WebElement ref = driver.findElement(By.id("course"));
	Select s=new Select(ref);
	//print all option
	List<WebElement> count = s.getOptions();
	System.out.println("all options count are"+count.size());
//print alternayte
	for( int i=0;i<count.size();i=i+2)
	{
		s.selectByIndex(i);
	}
	//total option selected
	List<WebElement> ref2 = s.getAllSelectedOptions();
		System.out.println("only selected optin"+ref2.size());
		//print only selcted
		for(int i=0;i<ref2.size();i++)

		{
			String str = ref2.get(i).getText();
			System.out.println("all selected options are"+str);
		}
		List<WebElement> ref3 = s.getAllSelectedOptions();
		System.out.println("only selected options are"+ref3.size());
		//deselect one option
		s.deselectByIndex(0);
		s.deselectAll();
		}
}
