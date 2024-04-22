package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ActiveProjectCustomerPage extends BaseClass {

	public ActiveProjectCustomerPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath ="//input[@value='Create New Customer']")
	private WebElement createNewCustomerButton;
	
	@FindBy(xpath = "//input[@value='Create New Project']")
	private WebElement createNewProjectButton;
	
	
	@FindBy(linkText = "All")
	private WebElement allLink;
	
	@FindBy(xpath = "//input[@value='Delete Selected']")
	private WebElement deleteButton;
	
	@FindBy(xpath = "//input[@value='Delete This Customer']")
	private WebElement deleteButtonInPopup;
	
	

	public WebElement getAllLink() {
		return allLink;
	}

	public WebElement getDeleteButton() {
		return deleteButton;
	}

	public WebElement getDeleteButtonInPopup() {
		return deleteButtonInPopup;
	}

	public WebElement getCreateNewCustomerButton() {
		return createNewCustomerButton;
	}

	public WebElement getCreateNewProjectButton() {
		return createNewProjectButton;
	}
	
	
	public void clickOnCreateNewCustomerButton()
	{
		createNewCustomerButton.click();
	}
	
	public void clickOnCreateNewProject()
	{
		createNewProjectButton.click();
	}
	
	
	
	public void deleteAllProjectAndCustomer()
	{
		allLink.click();
		deleteButton.click();
		deleteButtonInPopup.click();
	}
	
	
	
	

}
