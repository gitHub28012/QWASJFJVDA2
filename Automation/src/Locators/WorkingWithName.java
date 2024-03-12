package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithName {

	public static void main(String[] args) {
		// launch the browser
		WebDriver driver = new ChromeDriver();
		// maximize the window
		driver.manage().window().maximize();
		// to launch the application
		driver.get("https://www.flipkart.com/");
		//identify the search text field
		WebElement stf = driver.findElement(By.name("q"));
		stf.sendKeys("Laptop");
		
		//identify the search button and click on that particular button
		WebElement searchbutton = driver.findElement(By.className("_2iLD__"));
		searchbutton.click();
	}

}
