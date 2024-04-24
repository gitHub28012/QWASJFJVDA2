package TestScript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import POM.ActiveProjectCustomerPage;
import POM.HomePage;
import POM.LoginPage;
import POM.OpenTasksPage;
import genericLib.BaseTest;
import genericLib.Flib;

public class DeleteAllProjectAndCustomers extends BaseTest {

	@Test(groups = {"RT","ST"})
	public void deleteAll() throws EncryptedDocumentException, IOException {
		// login
		Flib lib = new Flib();
		String username = lib.getDataFromExcelFile(EXCEL_PATH, SHEETNAME, 1, 0);
		String password = lib.getDataFromExcelFile(EXCEL_PATH, SHEETNAME, 1, 1);
		LoginPage lp = new LoginPage(driver);
		lp.validLogin(username, password);
		//click on task
		HomePage hp = new HomePage(driver);
		hp.clickOnTasksLink();
		OpenTasksPage otp= new OpenTasksPage(driver);
		otp.clickOnProjectAndCustomer();
		ActiveProjectCustomerPage apcp = new ActiveProjectCustomerPage(driver);
		apcp.deleteAllProjectAndCustomer();
		hp.clickOnLogout();
		
	}

}
