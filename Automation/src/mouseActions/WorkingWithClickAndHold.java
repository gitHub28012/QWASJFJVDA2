package mouseActions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WorkingWithClickAndHold {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/ui/clickHold?sublist=0");
		
		//create the object of Actions class
		Actions act = new Actions(driver);
		//use clickAndHold()
		act.clickAndHold(driver.findElement(By.id("circle"))).perform();
		Thread.sleep(3000);
		//use release 
		act.release().perform();
	}

}
