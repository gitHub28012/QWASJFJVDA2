package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DemoWebShopTestScript {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demowebshop.tricentis.com/");
		//login into demowebshop
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Log")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("Email")).sendKeys("aman852@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("Password")).sendKeys("Aman@12345");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		Thread.sleep(2000);
		
		// click on books link
		driver.findElement(By.xpath("//ul[@class='top-menu']/descendant::a[contains(text(),'Books')]")).click();
		Thread.sleep(2000);
		// click on add to cart
		driver.findElement(By.xpath(
				"//a[text()='Health Book']/ancestor::div[@class='details']/descendant::input[@value='Add to cart']"))
				.click();
		Thread.sleep(2000);
		
		//print the msg successfully added into the cart
		String addToCartMsg = driver.findElement(By.xpath("//p[@class='content']")).getText();
		System.out.println(addToCartMsg);
		Thread.sleep(2000);
		//click on shopping cart
		driver.findElement(By.xpath("//div[@id='bar-notification']/descendant::a[@href='/cart']")).click();
		Thread.sleep(2000);
		//click on checkbox
		driver.findElement(By.name("termsofservice")).click();
		Thread.sleep(2000);
		//click on checkout
		driver.findElement(By.id("checkout")).click();
		Thread.sleep(2000);
		//click on continue
		driver.findElement(By.xpath("//div[@id='billing-buttons-container']/input")).click();
		Thread.sleep(2000);
		//click on continue
		driver.findElement(By.xpath("//div[@id='shipping-buttons-container']/input")).click();
		Thread.sleep(2000);
		//click on continue
		driver.findElement(By.xpath("//div[@id='shipping-method-buttons-container']/input")).click();
		Thread.sleep(2000);
		//click on continue
		driver.findElement(By.xpath("//div[@id='payment-method-buttons-container']/input")).click();
		Thread.sleep(2000);
		//click on continue
		driver.findElement(By.xpath("//div[@id='payment-info-buttons-container']/input")).click();
		
		
		
		
		
		
		
		

	}

}
