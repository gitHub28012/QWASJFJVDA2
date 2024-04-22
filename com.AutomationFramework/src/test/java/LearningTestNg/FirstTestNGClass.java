package LearningTestNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class FirstTestNGClass {

	@Test(invocationCount = 10)
	public void registerTestScript()
	{
		Reporter.log("Register successfully",true);
	}
	
	@Test(enabled = false)
	public void loginTestScript()
	{
		System.out.println("Login Successfully");
	}
	
	@Test(priority = -3)
	public void addToCartTestScript()
	{
		System.out.println("Add to cart executed successfully");
	}
	
	@Test(priority = -4)
	public void logoutTestScript()
	{
		System.out.println("Logout successfully");
	}
	

}
