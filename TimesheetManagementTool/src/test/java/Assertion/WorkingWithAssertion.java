package Assertion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class WorkingWithAssertion {

	@Test
	public void login() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://qspwakad/login.do");
		
		//use hard assert
		//Assert.assertEquals(driver.getTitle(), "actiTIME - Logi");
		
		//use SoftAssert
		SoftAssert soft = new SoftAssert();
		soft.assertEquals(driver.getTitle(), "actiTIME - Logi");
		
		
		
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		driver.quit();
		soft.assertAll();
	}

}
