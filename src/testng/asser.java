package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class asser {
@Test
public void m1() 
{
	SoftAssert s=new  SoftAssert();
	Reporter.log("method_01 executation started",true);
	int a=10;
	int b=20;
	Reporter.log("verification _01 started",true);
	s.assertEquals(a,b);
	Reporter.log(" verification 01 completed",true);
	int c=10;
	Reporter.log(" verification 02 started",true);
	s.assertEquals(c,b);
	Reporter.log("verification 02 completed",true);
	Reporter.log("method_01 executation started",true);
	s.assertAll();
}
@Test
	public void m2()
{
	Reporter.log("method_02execution completed",true);
		
	}
}
