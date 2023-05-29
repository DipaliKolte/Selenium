package Integration_testScript;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class testscript5 {

	@Test
	public void m1()
	{
		Reporter.log("integration testing testscript-05 valid testing",true);
	}
	@Test
	public void m2()
	{
		Reporter.log("integration testing testscript-05 invalid testing",true);
	}
	@Test
	public void m3()
	{
		Reporter.log("integration testing testscript-05 adhoc testing",true);
	}
}

