package genericLib;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest implements IAutoConstant {
	
	public WebDriver driver;

	
	@BeforeClass
	public void launchBrowser() throws IOException
	{
		Flib lib = new Flib();
		String browser = lib.getDataFromPropertyFile(PROP_PATH, "browser");
		String url = lib.getDataFromPropertyFile(PROP_PATH, "url");
		Reporter.log("========Launching "+browser+" browser===============",true);
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
			driver= new EdgeDriver();
		}
		else
		{
			Reporter.log("Invalid browser",true);
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMESECONDS));
		driver.get(url);
		
	}
	
	
	@AfterClass
	public void closeBrowser()
	{
		driver.quit();
	}
	
	
	

}
