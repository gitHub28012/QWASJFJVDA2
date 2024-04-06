package frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFramesByUsingIndex {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.dream11.com/");
		
		//switch the control into frame by using index
		driver.switchTo().frame(0);
		
		
		//pass mobile no here
		driver.findElement(By.id("regEmail")).sendKeys("9874561236");
		
		

	}
}
