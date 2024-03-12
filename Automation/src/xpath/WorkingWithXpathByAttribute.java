package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithXpathByAttribute {

	// tagName[@Attribute Name = 'Attribute value]
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.google.com");

		driver.switchTo().activeElement().sendKeys("chandler bing", Keys.ENTER);

		// click on sofa icon
		driver.findElement(By.xpath("//canvas[@class='lNPNe']")).click();

	}

}
