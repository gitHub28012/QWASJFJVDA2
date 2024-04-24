package TestScript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.UsernameAndPassword;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import POM.LoginPage;
import genericLib.BaseTest;
import genericLib.CustomeListener;
import genericLib.Flib;

@Listeners(CustomeListener.class)
public class ValidLoginTest extends BaseTest {

	@Test(description = "verify the user is able to login or not", groups = "ST")
	public void login() throws EncryptedDocumentException, IOException {
		Flib lib = new Flib();
		String username = lib.getDataFromExcelFile(EXCEL_PATH, SHEETNAME, 1, 0);
		String password = lib.getDataFromExcelFile(EXCEL_PATH, SHEETNAME, 1, 1);
		LoginPage lp = new LoginPage(driver);
		lp.validLogin(username, password);

	}

}
