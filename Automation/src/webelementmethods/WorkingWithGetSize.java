package webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithGetSize {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://desktop-u3snjl3/login.do");
		WebElement usernameTextField = driver.findElement(By.name("username"));
		//use getSize() method
		Dimension dimension = usernameTextField.getSize();
		System.out.println(dimension);
		
		
	}

}
