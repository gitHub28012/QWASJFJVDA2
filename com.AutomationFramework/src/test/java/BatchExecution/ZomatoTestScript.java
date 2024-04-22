package BatchExecution;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ZomatoTestScript {

	@Test
	public void testScript4() throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.zomato.com/");
		
		driver.findElement(By.xpath("//p[text()='Blinkit']")).click();
		driver.findElement(By.xpath("//button[text()='Detect my location']")).click();
	
		

		
		
		

	}

}
