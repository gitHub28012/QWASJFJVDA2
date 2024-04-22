package LearningTestNg;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ConfigurationAnnotation {
	
	@AfterTest
	public void afterTest() {
		Reporter.log("to close the database", true);
	}

	@BeforeSuite
	public void beforeSuite() {
		Reporter.log("to connect the server", true);
	}

	@BeforeTest
	public void beforeTest() {
		Reporter.log("to connect the database", true);
	}

	@BeforeClass
	public void beforeClass() {
		Reporter.log("to launch the browser", true);
	}

	

	@Test
	public void testScript1() {
		Reporter.log("Test script 1 executed successfully", true);
	}
	
	@Test
	public void testScript2() {
		Reporter.log("Test script 2 executed successfully", true);
	}

	@AfterMethod
	public void afterMethod() {
		Reporter.log("to perform logout", true);
	}

	@AfterClass
	public void afterClass() {
		Reporter.log("to close the browser", true);
	}

	

	@AfterSuite
	public void afterSuite() {
		Reporter.log("to close the server", true);
	}
	
	@BeforeMethod
	public void beforeMethod() {
		Reporter.log("to perform login", true);
	}

}
