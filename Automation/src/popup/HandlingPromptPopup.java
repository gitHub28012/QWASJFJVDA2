package popup;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingPromptPopup {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/ui/alert?sublist=0");
		//click on prompt pop up
		driver.findElement(By.xpath("//a[text()='Prompt']")).click();
		//click on prompt button
		driver.findElement(By.id("buttonAlert1")).click();
		//switch the control
		Alert alt = driver.switchTo().alert();
		Thread.sleep(3000);
		//pass the value inside prompt popup
		alt.sendKeys("yes");
		Thread.sleep(3000);
		//click on ok
		alt.accept();
		
		

	}

}
