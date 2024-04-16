package PomPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	//identify the username text field
	@FindAll({@FindBy(name="userna"),@FindBy(xpath="//input[@name='username']")})
	private WebElement usernameTextField;
	
	//identify the password textfield
	@FindBy(name = "pwd")
	private WebElement passwordTextField;
	
	//identify the checkbox
	@FindBy(id = "keepLoggedInCheckBox")
	private WebElement keepMeLoggedInCheckbox;
	
	//identify the login button
	@FindBy(id = "loginButton")
	private WebElement loginButton;
	
	
	public WebElement getUsernameTextField()
	{
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




	public void validLogin(String username,String password)
	{
		usernameTextField.sendKeys(username);
		passwordTextField.sendKeys(password);
		keepMeLoggedInCheckbox.click();
		loginButton.click();
	}
	
	
	

}
