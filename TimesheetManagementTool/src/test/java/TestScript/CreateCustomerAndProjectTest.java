package TestScript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import POM.ActiveProjectCustomerPage;
import POM.CreateNewProjectPage;
import POM.HomePage;
import POM.LoginPage;
import POM.OpenTasksPage;
import genericLib.BaseTest;
import genericLib.Flib;
import genericLib.WorkLib;

public class CreateCustomerAndProjectTest extends BaseTest {

	@Test(groups = {"IT","RT"})
	public void createProjectAndCustomer() throws EncryptedDocumentException, IOException {
		// login
		Flib lib = new Flib();
		String username = lib.getDataFromExcelFile(EXCEL_PATH, SHEETNAME, 1, 0);
		String password = lib.getDataFromExcelFile(EXCEL_PATH, SHEETNAME, 1, 1);
		LoginPage lp = new LoginPage(driver);
		lp.validLogin(username, password);
		// click on task
		HomePage hp = new HomePage(driver);
		hp.clickOnTasksLink();
		OpenTasksPage otp = new OpenTasksPage(driver);
		otp.clickOnProjectAndCustomer();
		ActiveProjectCustomerPage apcp = new ActiveProjectCustomerPage(driver);
		apcp.clickOnCreateNewCustomerButton();
		WorkLib wlib = new WorkLib();
		String customerName = lib.getDataFromExcelFile(EXCEL_PATH, CUSTPROJSHEET, 1, 0) + wlib.getRandomNum();
		String projectName = lib.getDataFromExcelFile(EXCEL_PATH, CUSTPROJSHEET, 1, 1) + wlib.getRandomNum();
		CreateNewProjectPage cnpp = new CreateNewProjectPage(driver);
		cnpp.createCustomerAndProject(driver, customerName, projectName);
		hp.clickOnLogout();

	}

}
