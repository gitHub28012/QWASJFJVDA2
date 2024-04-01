package popup;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingConfirmationPopup {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/ui/alert?sublist=0");
		
		//click on confirm
		driver.findElement(By.xpath("//a[text()='Confirm']")).click();
		
		//click on confirmation popup
		driver.findElement(By.id("buttonAlert5")).click();
		
		//switch the control
		Alert alt = driver.switchTo().alert();
		
		//use getText()
		String text = alt.getText();
		System.out.println(text);
		
		
		Thread.sleep(3000);		
		//use dismiss()
		alt.dismiss();
	}

}
