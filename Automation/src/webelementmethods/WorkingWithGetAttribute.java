package webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithGetAttribute {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://desktop-u3snjl3/login.do");
		// password textfield
		WebElement passwordTextField = driver.findElement(By.name("pwd"));
		String classAttributeValue = passwordTextField.getAttribute("class");
		System.out.println(classAttributeValue);
		
	}
}
