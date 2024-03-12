package webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithGetLocation {
	
	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://desktop-u3snjl3/login.do");
		//password textfield
		WebElement passwordTextField = driver.findElement(By.name("pwd"));
		//use getLocation() method
		Point location = passwordTextField.getLocation();
		System.out.println(location);
	}

}
