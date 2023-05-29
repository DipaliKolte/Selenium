package Genericexcelwithselenium;

import java.io.FileInputStream;
import java.io.Reader;
import java.util.Properties;

public class proprtyfile implements Utitlity {
	
	public static String getData(String key)
	{
		Properties p=new Properties();
		try
		{
			p.load(new FileInputStream("../selenium/resoureses/file1.properties"));
		}
		catch(Exception e)
		{}
		return p.getProperty(key);
		}



	
}
