package toTakeScreenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class way3 {
	
	public static void main(String[] args) throws IOException {
		//upcasting
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.apple.com/");
		//downcasting
		RemoteWebDriver r = (RemoteWebDriver) driver;
		File src = r.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshot/demo.png");
		Files.copy(src, dest);
		
		
		
		
	}

}
