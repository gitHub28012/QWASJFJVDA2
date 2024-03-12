package webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithClearMethod {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://desktop-u3snjl3/login.do");
		WebElement usernameTextField = driver.findElement(By.name("username"));
		// i will pass admin inside the username text field
		usernameTextField.sendKeys("admin");
		Thread.sleep(2000);
		// clear the value
		usernameTextField.clear();
		Thread.sleep(2000);
		// i will pass admin123
		usernameTextField.sendKeys("admin123");
		
		

	}

}
