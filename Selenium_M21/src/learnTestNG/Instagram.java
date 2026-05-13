package learnTestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;


public class Instagram {
	
	@Test(priority = 1, dependsOnMethods = "signUp")
	public void login() {
		Reporter.log("Login",true);
	}
	
	@Test(timeOut = 5000)
	public void signUp() {	
	//	Assert.fail();
		Reporter.log("SignUp",true);
	}
	
	@Test(priority = 2,invocationCount = 3,dependsOnMethods = {"signUp","login"},
			enabled = true)
	public void message() {
		Reporter.log("Message a friend",true);
	}
	
	
	

}
