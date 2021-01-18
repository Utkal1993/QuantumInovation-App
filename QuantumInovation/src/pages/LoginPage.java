package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class LoginPage extends TestBase{
	
	//Page Factory
	@FindBy(xpath="//a[text()='Sign in']")
	WebElement SignInLink;
	
	@FindBy(name="name")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(name="commit")
	WebElement loginBtn;
	
	@FindBy(xpath="//button[contains(text(),'Sign Up')]")
	WebElement signUpBtn;
	
	
	
	//Initializing the Page Objects:
	public LoginPage(){
		PageFactory.initElements(driver, this);
	}
	
	//Actions:
	public String validateLoginPageTitle(){
		return driver.getTitle();
	}
	
	
	public void login(String un, String pwd){
		username.click();
		username.sendKeys(un);
		password.click();
		password.sendKeys(pwd);
		loginBtn.click();
		    	
	}
	
}
