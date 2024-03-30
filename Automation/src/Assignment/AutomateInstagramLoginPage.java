package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateInstagramLoginPage {

	public static void main(String[] args) throws InterruptedException {

		// launch the browser
		WebDriver driver = new ChromeDriver();
		// maximize the window
		driver.manage().window().maximize();
		// to launch the application
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		//username textfield
		driver.findElement(By.name("username")).sendKeys("1234567897");
		
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("Aman@123");
		
		Thread.sleep(2000);
		driver.findElement(By.className("_acap")).click();
		
		Thread.sleep(3000);
		driver.quit();
		
		
		
		
	}

}
