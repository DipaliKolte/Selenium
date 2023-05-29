package system_testScript;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class testscript7 {
	@Test
	public void m1()
	{
		Reporter.log("System testing testscript-07 valid testing",true);
	}
	@Test
	public void m2()
	{
		Reporter.log("system testing testscript-07 invalid testing",true);
	}
	@Test
	public void m3()
	{
		Reporter.log("system testing testscript-07 adhoc testing",true);
	}
}

