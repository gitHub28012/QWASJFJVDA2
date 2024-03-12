package webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithSubmit {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		WebElement searchTextField = driver.findElement(By.name("q"));
		//search some product
		searchTextField.sendKeys("laptop");
		//use submit method
		searchTextField.submit();
		
		/**
		 * Note : if type="submit" attribute is 
		 * present inside your web element source code 
		 * then only your submit
		 * method will work.
		 */
		
		
		
	}

}
