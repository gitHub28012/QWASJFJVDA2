package keyboardActions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginIntoActitime {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://desktop-u3snjl3/login.do");
		//identify user name text-field
		driver.findElement(By.name("username")).sendKeys("admin",Keys.TAB,"manager",Keys.ENTER);
		
	
		
	}

}
