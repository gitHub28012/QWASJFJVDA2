package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OpenTasksPage  extends BaseClass{

	public OpenTasksPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath ="//a[text()='Projects & Customers']")
	private WebElement projectAndCustomerLink;

	public WebElement getProjectAndCustomerLink() {
		return projectAndCustomerLink;
	}
	
	public void clickOnProjectAndCustomer()
	{
		projectAndCustomerLink.click();
	}
	
	
	

}
