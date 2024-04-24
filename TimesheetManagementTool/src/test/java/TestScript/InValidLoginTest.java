package TestScript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import POM.LoginPage;
import genericLib.BaseTest;
import genericLib.Flib;

public class InValidLoginTest extends BaseTest {

	@Test(description = "verify the user is able to login with different credentias or not", groups = "FT")
	public void inValidLogin() throws EncryptedDocumentException, IOException {
		Flib lib = new Flib();
		int rowCount = lib.getRowCount(EXCEL_PATH, INVALIDSHEETNAME);

		for (int i = 1; i < rowCount; i++) {

			String username = lib.getDataFromExcelFile(EXCEL_PATH, INVALIDSHEETNAME, i, 0);
			String password = lib.getDataFromExcelFile(EXCEL_PATH, INVALIDSHEETNAME, i, 1);
			LoginPage lp = new LoginPage(driver);
			lp.invalidLogin(username, password);
		}
	}

}
