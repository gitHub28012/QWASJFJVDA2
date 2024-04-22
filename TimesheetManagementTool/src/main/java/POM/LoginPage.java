package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BaseClass {

	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	// identify username textfield
	@FindBy(name = "username")
	private WebElement usernameTextField;

	// identify password textfield
	@FindBy(name = "pwd")
	private WebElement passwordTextField;

	// keep me logged in checkbox
	@FindBy(id = "keepLoggedInCheckBox")
	private WebElement keepMeLoggedInCheckbox;

	// identify the login button
	@FindBy(id = "loginButton")
	private WebElement loginButton;
	

	public WebElement getUsernameTextField() {
		return usernameTextField;
	}

	public WebElement getPasswordTextField() {
		return passwordTextField;
	}

	public WebElement getKeepMeLoggedInCheckbox() {
		return keepMeLoggedInCheckbox;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}

	public void validLogin(String username,String password) {
		usernameTextField.sendKeys(username);
		passwordTextField.sendKeys(password);
		keepMeLoggedInCheckbox.click();
		loginButton.click();
	}
	
	public void invalidLogin(String username,String password)
	{
		usernameTextField.sendKeys(username);
		passwordTextField.sendKeys(password);
		keepMeLoggedInCheckbox.click();
		loginButton.click();
		usernameTextField.clear();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
