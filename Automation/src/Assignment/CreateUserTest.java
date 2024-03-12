package Assignment;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateUserTest {
	
	public static void main(String[] args) throws InterruptedException {
		
		//random class
		Random r = new Random();
		int no = r.nextInt(10000);
		
		//to launch the browser
		WebDriver driver = new ChromeDriver();
		
		//to maximize  
		driver.manage().window().maximize();
		
		//to launch the application
		driver.get("http://desktop-u3snjl3/login.do");
		
		//identify the username text field and pass the username
		driver.findElement(By.name("username")).sendKeys("admin");
		
		//identify the password text field and pass the password
		driver.findElement(By.name("pwd")).sendKeys("manager");
		
		//click on login button
		driver.findElement(By.id("loginButton")).click();
		
		//click on user link
		driver.findElement(By.xpath("//a[@class='content users']")).click();
		
		//click on create new user button
		driver.findElement(By.xpath("//input[@value='Create New User']")).click();
		Thread.sleep(3000);
		//pass the username'
		driver.findElement(By.name("username")).sendKeys("John"+no);
		Thread.sleep(3000);
		//pass the password
		String password = "John@123";
		driver.findElement(By.name("passwordText")).sendKeys(password+no);
		Thread.sleep(3000);
		//confirm password
		driver.findElement(By.name("passwordTextRetype")).sendKeys(password+no);
		Thread.sleep(3000);
		//pass the first name
		driver.findElement(By.name("firstName")).sendKeys("john"+no);
		Thread.sleep(3000);
		//pass the last name
		driver.findElement(By.name("lastName")).sendKeys("Dange"+no);
		Thread.sleep(3000);
		//click on create user
		driver.findElement(By.xpath("//input[contains(@value,'Create User')]")).click();
		Thread.sleep(3000);
		//click on logout
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		
		//close the browser
		driver.quit();
		
		
		
		
		
		
	}

}
