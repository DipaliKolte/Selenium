package GenericExcelwithHashmapwithSelenium;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;

public class Propertyfile implements Utility {
	

	public static String getData(String key)
	{
		Properties p=new Properties();
		try
		{
			p.load(new FileInputStream(propertyfilepath));
		}
		catch(Exception e)
		{}
		return p.getProperty(key);
}
}