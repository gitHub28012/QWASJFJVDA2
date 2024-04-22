package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import genericLib.WorkLib;

public class CreateNewProjectPage extends BaseClass {

	public CreateNewProjectPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	@FindBy(name = "customerId")
	private WebElement customerDropdown;
	
	@FindBy(xpath = "//input[@name='name']")
	private WebElement projectNameTextField;
	
	@FindBy(name = "createProjectSubmit")
	private WebElement createProjectButton;

	public WebElement getCustomerDropdown() {
		return customerDropdown;
	}

	public WebElement getProjectNameTextField() {
		return projectNameTextField;
	}

	public WebElement getCreateProjectButton() {
		return createProjectButton;
	}
	
	public void createCustomerAndProject(WebDriver driver,String customerName,String projectName)
	{
		CreateNewCustomerPage cncp = new CreateNewCustomerPage(driver);
		cncp.createCustomer(customerName);
		ActiveProjectCustomerPage apcp = new ActiveProjectCustomerPage(driver);
		apcp.clickOnCreateNewProject();
		WorkLib wlib = new WorkLib();
		wlib.selectByVisibleText(customerDropdown, customerName);
		projectNameTextField.sendKeys(projectName);
		createProjectButton.click();
		
	}
	
	
	

}
