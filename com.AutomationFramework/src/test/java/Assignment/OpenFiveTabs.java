package Assignment;

import java.awt.Robot;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import DataDrivenFramework.FLib;

public class OpenFiveTabs {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
		for (int i = 1; i <= 5; i++) {
			FLib lib = new FLib();
			String url = lib.getDataFromExcelFile("./src/test/resources/url.xlsx", "WebApp", i, 0);
			System.out.println(url);
			driver.switchTo().newWindow(WindowType.TAB);
			driver.get(url);

		}

	}

}
