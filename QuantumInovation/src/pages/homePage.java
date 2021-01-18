package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class homePage extends TestBase{
	
	@FindBy(xpath="//a[text()='Sign in']")
	WebElement SignInLink;
	
	@FindBy(xpath="//a[text()='Register ']")
	WebElement Register;
	
	public homePage() {
		PageFactory.initElements(driver, this);
	}
	
	public String verifyHomePageTitle(){
		return driver.getTitle();
	}
	
	
	public LoginPage clickOnLoginLink(){
		SignInLink.click();
		return new LoginPage();
	}
	
	public RegistrationPage clickOnRegisterLink(){
		Register.click();
		return new RegistrationPage();
	}

}
