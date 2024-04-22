package LearningTestNg;

import org.testng.annotations.Test;

public class WorkingWithDependsOnAttribute {
	
	
	@Test(description = "verify the user is able to register or not")
	public void register()
	{
		System.out.println("register successfully");
	}
	
	
	@Test(dependsOnMethods = "register", description = "verify the user is able to login or not")
	public void login()
	{
		System.out.println("login successfully");
	}
	


	
	

}

