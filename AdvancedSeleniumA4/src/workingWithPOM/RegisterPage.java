package workingWithPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	
	public RegisterPage(WebDriver driver)
	{
	
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(linkText = "Register")
	private WebElement registerLink;
	
	@FindBy(id = "gender-male")
	private WebElement maleRadioButton;
	
	
	@FindBy(id = "gender-female")
	private WebElement femaleRadioButton;
	
	@FindBy(id = "FirstName")
	private WebElement firstNameTextBox;
	
	@FindBy(id = "LastName")
	private WebElement lastNameTextBox;
	
	@FindBy(id = "Email")
	private WebElement emailTextBox;

	
	@FindBy(id = "Password")
	private WebElement passwordTextBox;
	
	@FindBy(id = "ConfirmPassword")
	private WebElement confirmPasswordTextBox;
	
	
	@FindBy(id = "register-button")
	private WebElement registerButton;
	
	
	
	

	public WebElement getRegisterLink() {
		return registerLink;
	}

	public WebElement getMaleRadioButton() {
		return maleRadioButton;
	}

	public WebElement getFemaleRadioButton() {
		return femaleRadioButton;
	}

	public WebElement getFirstNameTextBox() {
		return firstNameTextBox;
	}

	public WebElement getLastNameTextBox() {
		return lastNameTextBox;
	}

	public WebElement getEmailTextBox() {
		return emailTextBox;
	}

	public WebElement getPasswordTextBox() {
		return passwordTextBox;
	}

	public WebElement getConfirmPasswordTextBox() {
		return confirmPasswordTextBox;
	}

	public WebElement getRegisterButton() {
		return registerButton;
	}
	
	
	
	
	
}
