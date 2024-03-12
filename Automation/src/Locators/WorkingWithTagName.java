package Locators;

import javax.lang.model.element.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.grid.Main;

public class WorkingWithTagName {
	
	public static void main(String[] args) {
		
		//launch the browser
		WebDriver driver = new ChromeDriver();
		
		//maximize the window
		driver.manage().window().maximize();
		
		//to launch the application
		driver.get("https://demowebshop.tricentis.com/");
		
		//identify the name text field and pass the name
		WebElement element = driver.findElement(By.tagName("input"));
		
		element.sendKeys("books");
		
	}

}
