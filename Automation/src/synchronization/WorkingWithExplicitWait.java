package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WorkingWithExplicitWait {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.shoppersstack.com/");
		
		//click on samsung phone
		driver.findElement(By.xpath("//span[text()='SAMSUNG Galaxy Z Flip4 ']")).click();
		
		//pass pincode inside the check delivery text box
		driver.findElement(By.id("Check Delivery")).sendKeys("123456");
		
		//identify the check button
		WebElement checkButton = driver.findElement(By.id("Check"));
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(checkButton));
		
		//click on check button
		checkButton.click();
		
		
		
	}

}
