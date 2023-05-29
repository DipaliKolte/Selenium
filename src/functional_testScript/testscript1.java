package functional_testScript;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class testscript1 {

	@Test
	public void m1()
	{
		Reporter.log("functional testing testscript-01 valid testing",true);
	}
	@Test
	public void m2()
	{
		Reporter.log("functional testing testscript-01 invalid testing",true);
	}
	@Test
	public void m3()
	{
		Reporter.log("functional testing testscript-01 adhoc testing",true);
	}
}


