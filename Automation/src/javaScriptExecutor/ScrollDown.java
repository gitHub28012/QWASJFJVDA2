package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDown {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.zomato.com/");
		//explicit type casting
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//use executeScript() method
		for(int i=0;i<=2;i++)
		{
		js.executeScript("window.scrollBy(0,1000);");
		Thread.sleep(2000);
		}
		js.executeScript("window.scrollBy(0,-1000);");
	}

}
