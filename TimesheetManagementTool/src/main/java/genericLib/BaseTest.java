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
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class BaseTest implements IAutoConstant {
	
	public WebDriver driver;
	public static WebDriver sdriver;

	@Parameters("browser")
	@BeforeClass(alwaysRun = true)
	public void launchBrowser(@Optional("chrome") String browser) throws IOException
	{
		Flib lib = new Flib();
		//String browser = lib.getDataFromPropertyFile(PROP_PATH, "browser");
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
		sdriver=driver;
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMESECONDS));
		driver.get(url);
		
	}
	
	
	@AfterClass(alwaysRun = true)
	public void closeBrowser()
	{
		driver.quit();
	}
	
	
	

}
