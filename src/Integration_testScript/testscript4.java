package Integration_testScript;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class testscript4 {
	@Test
	public void m1()
	{
		Reporter.log("Integration testing testscript-04 valid testing",true);
	}
	@Test
	public void m2()
	{
		Reporter.log("integration testing testscript-04 invalid testing",true);
	}
	@Test
	public void m3()
	{
		Reporter.log("integration testing testscript-04 adhoc testing",true);
	}

}
