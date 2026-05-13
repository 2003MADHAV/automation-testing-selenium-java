package learnTestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo {
	
	@Test
	public void demoC() { // Test Class
	//	Reporter.log("By World");   		// It Will Print only in the report 
		Reporter.log("By World",false);
	}
	
	
	@Test
	public void demoA() { // Test Class
		Reporter.log("By World",true);			// It Will Print both in console and report
	}

	@Test
	public void demoB() { // Test Class
	System.out.println("Hello World");   // It Will Print only in the console 
	}
	
}
