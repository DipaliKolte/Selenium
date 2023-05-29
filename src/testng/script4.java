package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class script4 {

	@Test(groups="s1")
	public void m1() {
		Reporter.log("m1 method executed",true);
	}
	@Test(groups="s1")
	public void m2() {
		Reporter.log("m2 method executed",true);
	}
	@Test(groups="s1")
	public void m3() {
		Reporter.log("m3 method executed",true);
	}
	@Test(groups="s1")
	public void m4() {
		Reporter.log("m3 method executed",true);
	}
	@Test(dependsOnGroups = "s1")
	public void m5() {
		Reporter.log("m5 method executed",true);
	}
}
