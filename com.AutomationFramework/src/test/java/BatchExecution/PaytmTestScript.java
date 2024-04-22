package BatchExecution;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class PaytmTestScript {

	@Test
	public void testScript3()throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://paytm.com/");
		//click on flight tickets
		driver.findElement(By.xpath("//img[@src='https://assetscdn1.paytm.com/images/catalog/view_item/733296/1626259884425.png']")).click();
		//enter Pune in  from text field
		driver.findElement(By.id("from")).click();
		driver.findElement(By.xpath("//img[@class='_3i2Wp']")).click();
		driver.findElement(By.className("_1X2Sn")).sendKeys("PNQ");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Pune, Maharashtra, India']")).click();	
		
	
		//enter del in to text field
		driver.findElement(By.id("to")).click();
		driver.findElement(By.xpath("//img[@class='_3i2Wp']")).click();
		driver.findElement(By.className("_1X2Sn")).sendKeys("del");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Delhi, India']")).click();
		
		//click on departure date
		driver.findElement(By.id("departureDate")).click();
		driver.findElement(By.xpath("(//div[text()='3'])[2]")).click();
		//click on searchFlight
		driver.findElement(By.id("flightSearch")).click();
		
		Thread.sleep(10000);
		
		//fetch the price of first flight
		WebElement flightPrice = driver.findElement(By.xpath("(//span[text()='View Fare']/ancestor::div[@class='_5Cbbf']/descendant::div[@class='_2MkSl'])[1]"));
		System.out.println(flightPrice.getText());
		
	//WebElement flightDetails = driver.findElement(By.className("_1gMv6"));
		//System.out.println(flightDetails.getText());
		
		List<WebElement> flight = driver.findElements(By.className("_1gMv6"));
		
		for(int i=0;i<flight.size();i++)
		{
			System.out.println(flight.get(i).getText());
			System.out.println("=========================================");
		}
		
		
		
		
	}

}
