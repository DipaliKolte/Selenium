package listbox;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class program3 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		Thread.sleep(3000);
		driver.get("file:///C:/Users/ABC/Desktop/listbox1.html");
		Thread.sleep(6000);
		WebElement ref1 = driver.findElement(By.id("course"));
		Select s=new Select(ref1);
		boolean output=s.isMultiple();
		if(output)
		{
			System.out.println("it is a multiple selectable listbox");
		}
		else
		{
			System.out.println("it is not multiple selectable listbox");
		}
		//List<WebElement> ref = s.getOptions();
		//System.out.println("total count is"+ref.size());
List<WebElement> count = driver.findElements(By.tagName("option"));
System.out.println("no of subjects are"+count.size());
		

for(int i=0;i<count.size();i++)
{

String str=count.get(i).getText();	
System.out.println("all subjects are "+str);
System.out.println("#####################");
}
List<WebElement> ref = driver.findElements(By.xpath(".//select.//option"));
for(int i=0;i<ref.size();i++)
{
	
	String str=ref.get(i).getAttribute("value");
	s.selectByValue(str);
	
}
for(int i=0;i<count.size();i=i+2)
{
	s.selectByIndex(i);
	
}
for(int i=0;i<count.size();i++)
{
	String txt=count.get(i).getText();
	if(txt.contains("Testing"))
	{
		s.selectByIndex(i);
		
	}
	
}

	}

}
