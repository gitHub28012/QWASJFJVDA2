package PomPackage;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * @author Aman Singh
 */

public class BaseTest implements IAutoConstant {

	static WebDriver driver;

	//launching the browser
	public void setUp() throws IOException {
		FLib lib = new FLib();
		String url = lib.getDataFromProperty(PROP_PATH, "Url");
		String browser = lib.getDataFromProperty(PROP_PATH, "browser");
		if (browser.equals("chrome")) {
			driver = new ChromeDriver();
		} else if (browser.equals("firefox")) {
			driver = new FirefoxDriver();
		} else if (browser.equals("edge")) {
			driver = new EdgeDriver();
		} else {
			System.out.println("Invalid browser");
		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMESECONDS));
		driver.get(url);
	}
	
	//close the browse
	public void tearDown()
	{
		driver.quit();
	}

}
