package Integration_testScript;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class testscript6 {
	@Test
	public void m1()
	{
		Reporter.log("integration testing testscript-06 valid testing",true);
	}
	@Test
	public void m2()
	{
		Reporter.log("integration testing testscript-06 invalid testing",true);
	}
	@Test
	public void m3()
	{
		Reporter.log("integration testing testscript-06 adhoc testing",true);
	}
}

