package DataDrivenFramework;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ValidLoginIntoActitime {
	
	static WebDriver driver;
	
	
	public static void main(String[] args) throws IOException {
		
		FetchingDataFromPropertyFile file = new FetchingDataFromPropertyFile();
		String url = file.getDataFromPropertyFile("Url");
		String browser = file.getDataFromPropertyFile("browser");
		if(browser.equals("chrome"))
		{
			driver = new ChromeDriver();
		}
		else if(browser.equals("firefox"))
		{
			driver = new FirefoxDriver();
		}
		else if(browser.equals("edge"))
		{
			driver = new EdgeDriver();
		}
		else
		{
			System.out.println("Invalid browser");
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(url);
		
		
		
		
	}

}
