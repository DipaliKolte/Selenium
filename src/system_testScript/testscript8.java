package system_testScript;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class testscript8 {
	@Test
	public void m1()
	{
		Reporter.log("system testing testscript-08 valid testing",true);
	}
	@Test
	public void m2()
	{
		Reporter.log("system testing testscript-08 invalid testing",true);
	}
	@Test
	public void m3()
	{
		Reporter.log("system testing testscript-08 adhoc testing",true);
	}
}

