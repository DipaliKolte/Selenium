package multiplebrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenBrowser {
static WebDriver driver ;
public static void selectBrowser(String browsername) 
{
	
	if(browsername.equals("Firefox"))
	{
		driver=new FirefoxDriver();
	
	}
	else if(browsername.equals("chrome"))
	{
		driver=new ChromeDriver();
	}
	else
	{
		driver=new EdgeDriver();
	}
			
			
}
}