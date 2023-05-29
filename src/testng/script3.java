package testng;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class script3 {
@Test
public void signup()
{
	Reporter.log("signup method excuted",true);
	Assert.fail();
}
@Test(dependsOnMethods = "signup")
public void login()
{
	Reporter.log("login method excuted",true);
}
}
