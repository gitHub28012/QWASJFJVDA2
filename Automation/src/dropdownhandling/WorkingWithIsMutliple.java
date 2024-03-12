package dropdownhandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WorkingWithIsMutliple {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/");
		// click on UI testing concept
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		// click on drop down
		driver.findElement(By.xpath("//section[text()='Dropdown']")).click();
		// click on multi-select
		driver.findElement(By.xpath("//a[text()='Multi Select']")).click();
		// identify the multi-select drop down
		WebElement multiselectDropdown = driver.findElement(By.id("select-multiple-native"));
		// create the object of select class
		Select s = new Select(multiselectDropdown);
		//use isMultiple() method
		System.out.println(s.isMultiple());
		
	}

}
