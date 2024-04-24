package TestScript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import POM.CreateNewUserPage;
import POM.HomePage;
import POM.LoginPage;
import POM.UserListPage;
import genericLib.BaseTest;
import genericLib.CustomeListener;
import genericLib.Flib;
import genericLib.WorkLib;

@Listeners(CustomeListener.class)
public class CreateUserTest extends BaseTest {
	
	@Test(groups = "RT")
	public void createUser() throws EncryptedDocumentException, IOException
	{
		//login
		Flib lib = new Flib();
		String username = lib.getDataFromExcelFile(EXCEL_PATH, SHEETNAME, 1, 0);
		String password = lib.getDataFromExcelFile(EXCEL_PATH, SHEETNAME, 1, 1);
		LoginPage lp = new LoginPage(driver);
		lp.validLogin(username, password);
		//fetch the user data
		WorkLib wlib = new WorkLib();
		String usn=lib.getDataFromExcelFile(EXCEL_PATH, USERSHEETNAME, 1, 0)+wlib.getRandomNum();
		String pwd = lib.getDataFromExcelFile(EXCEL_PATH, USERSHEETNAME, 1, 1)+wlib.getRandomNum();
		String fn = lib.getDataFromExcelFile(EXCEL_PATH, USERSHEETNAME, 1, 2)+wlib.getRandomNum();
		String ln = lib.getDataFromExcelFile(EXCEL_PATH, USERSHEETNAME, 1, 3)+wlib.getRandomNum();
		//create user
		HomePage hp = new HomePage(driver);
		hp.clickOnUsersLink();
		UserListPage ulp = new UserListPage(driver);
		ulp.clickOnCreateNewButton();
		CreateNewUserPage cnup = new CreateNewUserPage(driver);
		cnup.createUser(usn, pwd, fn, ln);
		hp.clickOnLogout();
		
		
	}

}
