package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;



public class script2 {
	
	@Test(priority = 1)
	void creatAccount()
	{
		Reporter.log("create account method excuted",true);
	}
	@Test(priority = 2)
	void editAccount()
	{
		Reporter.log("edit account method excuted",true);
	}
	@Test(priority = 3)
	void deleteAccount()
	{
		Reporter.log("delete account method excuted",true);
	}
	@Test(priority = 4)
	void cheackAccount()
	{
		Reporter.log("cheack account method excuted",true);
	}

}
