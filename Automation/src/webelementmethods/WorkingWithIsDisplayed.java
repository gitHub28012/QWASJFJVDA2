package webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithIsDisplayed {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://desktop-u3snjl3/login.do");
		WebElement text = driver.findElement(By.xpath("//td[text()='Please identify yourself']"));
		System.out.println(text.isDisplayed());
	}

}
