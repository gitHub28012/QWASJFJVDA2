package DataDrivenFramework;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidLoginIntoActitime {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FLib lib  = new FLib();
		//fetching the url from property file
		String url = lib.getDataFromProperty("./src/test/resources/CommanData.properties", "Url");
		String username = lib.getDataFromExcelFile("./src/test/resources/ActitmeTestData.xlsx", "Sheet1", 1, 0);
		String password = lib.getDataFromExcelFile("./src/test/resources/ActitmeTestData.xlsx", "Sheet1", 1, 1);
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(url);
		//pass the username
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("pwd")).sendKeys(password);
		driver.findElement(By.id("loginButton")).click();
		
		
		
		
		
		

	}

}
