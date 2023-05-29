package selenium;

import org.openqa.selenium.firefox.FirefoxDriver;

public class homework2 {
public static void main(String[] args) throws InterruptedException {
	FirefoxDriver rv=new FirefoxDriver();
	rv.get("http://www.google.com");
	rv.get("http://www.youtube.com");
	rv.get("http://www.amazon.com");
	rv.get("http://www.facebook.com");
	rv.get("http://www.myntra.com");
	String exppage="YouYube";
	while(true)
	{
		Thread.sleep(3000);
		String displayedpage=rv.getTitle();
		if(displayedpage.contains(exppage))
		{
			break;
		}
		else {
			rv.navigate().back();
		}
	}

}
}
