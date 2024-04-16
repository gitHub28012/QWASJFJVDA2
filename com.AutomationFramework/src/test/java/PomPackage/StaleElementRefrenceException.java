package PomPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElementRefrenceException {
	
	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://desktop-u3snjl3/login.do");
		WebElement username = driver.findElement(By.name("username"));
		//refresh the browser
		driver.navigate().refresh();
		//enter the value inside textfield
		username.sendKeys("admin");
		
	}

}
