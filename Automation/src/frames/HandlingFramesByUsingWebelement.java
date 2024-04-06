package frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFramesByUsingWebelement {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.dream11.com/");
		
		WebElement frame1 = driver.findElement(By.xpath("//iframe[@class='send-sms-iframe']"));
		
		//switch the control into frame by using id or name attribute value
		driver.switchTo().frame(frame1);
		
		
		//pass mobile no here
		driver.findElement(By.id("regEmail")).sendKeys("9874561236");

	}
}
