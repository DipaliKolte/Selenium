package PROPERTYFILE;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class facbook {
	public static void main(String[] args) throws IOException {
		//copy file from rom to ram
		String filepath="../selenium/actitime.properties";
		FileInputStream f =new FileInputStream(filepath);
		
		//open properties file
		Properties p=new Properties();
		p.load(f);
		//read data
		String url=p.getProperty("password");
		System.out.println(url);
		
		
	}

}

