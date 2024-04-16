package PomPackage;

import java.io.IOException;

public class ValidLogin extends BaseTest {
	

	
	public static void main(String[] args) throws IOException {
		
	BaseTest test = new BaseTest();
	test.setUp();
	LoginPage lp = new LoginPage(driver);
	FLib lib = new FLib();
	lp.validLogin(lib.getDataFromProperty(PROP_PATH, "username"), lib.getDataFromProperty(PROP_PATH, "password"));
	test.tearDown();
	
	
	
		
		
		
	}

}
