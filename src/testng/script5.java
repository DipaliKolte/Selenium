package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class script5 {

	@Test(invocationCount = 10)
	public void sendSMS()
	{
		Reporter.log("SMS SEND",true);
	}
}
