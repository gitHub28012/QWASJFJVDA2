package genericLib;

import java.util.Random;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class WorkLib {
	
	public int getRandomNum()
	{
		Random r = new Random();
		int no = r.nextInt(1000);
		return no;
	}
	
	
	public void selectByVisibleText(WebElement dropdown,String visibleText)
	{
		Select s = new Select(dropdown);
		s.selectByVisibleText(visibleText);
		
	}

}
