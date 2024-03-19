package toTakeScreenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class Way2 {
	
	public static void main(String[] args) throws IOException {
		
		RemoteWebDriver driver = new ChromeDriver();
		File src = driver.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshot/photo.png");
		Files.copy(src, dest);
		
		
	}

}
