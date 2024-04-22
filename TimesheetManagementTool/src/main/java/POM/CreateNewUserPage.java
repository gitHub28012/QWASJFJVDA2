package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateNewUserPage  extends BaseClass{

	public CreateNewUserPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	
	@FindBy(xpath ="//input[@name='username']")
	private WebElement usnTextField;
	
	@FindBy(name = "passwordText")
	private WebElement pwdTextField;
	
	@FindBy(name = "passwordTextRetype")
	private WebElement confirmPwdTextField;
	
	
	@FindBy(name = "firstName")
	private WebElement firstNameTextField;
	
	@FindBy(name = "lastName")
	private WebElement lastNameTextField;
	
	@FindBy(xpath = "//input[contains(@value,'Create User')]")
	private WebElement createUserButton;

	public WebElement getUsnTextField() {
		return usnTextField;
	}

	public WebElement getPwdTextField() {
		return pwdTextField;
	}

	public WebElement getConfirmPwdTextField() {
		return confirmPwdTextField;
	}

	public WebElement getFirstNameTextField() {
		return firstNameTextField;
	}

	public WebElement getLastNameTextField() {
		return lastNameTextField;
	}

	public WebElement getCreateUserButton() {
		return createUserButton;
	}
	
	
	public void createUser(String username,String password,String firstName,String lastName)
	{
		usnTextField.sendKeys(username);
		pwdTextField.sendKeys(password);
		confirmPwdTextField.sendKeys(password);
		firstNameTextField.sendKeys(firstName);
		lastNameTextField.sendKeys(lastName);
		createUserButton.click();
	}
	
	
	
	
	
	
	
}
