package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateNewCustomerPage extends BaseClass {

	public CreateNewCustomerPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	@FindBy(xpath ="//input[@name='name']")
	private WebElement customeNameTextField;
	
	@FindBy(name = "createCustomerSubmit")
	private WebElement createCustomerButton;

	public WebElement getCustomeNameTextField() {
		return customeNameTextField;
	}

	public WebElement getCreateCustomerButton() {
		return createCustomerButton;
	}
	
	public void createCustomer(String customerName)
	{
		customeNameTextField.sendKeys(customerName);
		createCustomerButton.click();
	}
	
	
	

}
