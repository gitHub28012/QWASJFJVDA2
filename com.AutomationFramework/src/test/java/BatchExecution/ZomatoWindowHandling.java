package BatchExecution;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ZomatoWindowHandling {
	
	@Test
	public void testscript5() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.zomato.com");
		
		driver.findElement(By.xpath("//a[@href='https://in.linkedin.com/company/zomato']")).click();
		driver.findElement(By.xpath("//a[@href='https://www.instagram.com/zomato/']")).click();
		driver.findElement(By.xpath("//a[@href='https://twitter.com/zomato']")).click();
		driver.findElement(By.xpath("//a[@href='https://www.youtube.com/zomato']")).click();
		driver.findElement(By.xpath("//a[@href='https://www.facebook.com/zomato']")).click();
		
		
		Set<String> allWindowId = driver.getWindowHandles();
		
		for(String id:allWindowId)
		{
			driver.switchTo().window(id);
			if(driver.getTitle().equals("Zomato | LinkedIn"))
			{
					System.out.println(driver.getTitle());
			}
			else
			{
				driver.close();
			}
		}
		
		
		
		
		
		
		
		
	}

}
