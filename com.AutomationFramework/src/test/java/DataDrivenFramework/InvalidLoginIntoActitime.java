package DataDrivenFramework;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvalidLoginIntoActitime {
	public static void main(String[] args) throws IOException {
		FLib lib = new FLib();
		String url = lib.getDataFromProperty("./src/test/resources/CommanData.properties", "Url");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(url);
		
		int rowCount = lib.getRowCount("./src/test/resources/ActitmeTestData.xlsx", "InvalidCred");
		
		for(int i=0;i<rowCount;i++)
		{

		String username = lib.getDataFromExcelFile("./src/test/resources/ActitmeTestData.xlsx", "InvalidCred", i, 0);
		String password = lib.getDataFromExcelFile("./src/test/resources/ActitmeTestData.xlsx", "InvalidCred", i, 1);
		// pass the username
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("pwd")).sendKeys(password);
		driver.findElement(By.id("loginButton")).click();
		
		}
	}

}
