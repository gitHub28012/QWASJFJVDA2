package webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithGetRect {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://desktop-u3snjl3/login.do");
		//password textfield
		WebElement passwordTextField = driver.findElement(By.name("pwd"));
		//use getRect() method
		Rectangle rect = passwordTextField.getRect();
		
		int height = rect.getHeight();
		System.out.println(height);
		int width = rect.getWidth();
		System.out.println(width);
		int x = rect.getX();
		System.out.println(x);
		int y = rect.getY();
		System.out.println(y);
		
		
	}

}
