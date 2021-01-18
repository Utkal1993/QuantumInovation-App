package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import base.TestBase;

public class RegistrationPage extends TestBase{
	
	@FindBy(xpath = "//input[@id= 'profile_first_name']") WebElement firstNameTextBox;
	@FindBy(xpath = "//input[@id= 'profile_last_name']") WebElement lasttNameTextBox;
	@FindBy(xpath = "//select[@id= 'profile_country']") WebElement countryDrpodown;
	@FindBy(xpath = "//input[@id= 'profile_address']") WebElement addressTextBox;
	@FindBy(xpath = "//input[@id= 'profile_contact_no']") WebElement contactTextBox;
	@FindBy(xpath = "//input[@id= 'profile_dob']") WebElement dobTextBox;
	@FindBy(xpath = "//input[@id= 'profile_email']") WebElement emailTextBox;
	@FindBy(xpath = "//input[@id= 'user_name']") WebElement userNameTextBox;
	@FindBy(xpath = "//input[@id= 'password']") WebElement passwordTextBox;
	@FindBy(xpath = "//input[@id='identity[password_confirmation]']") WebElement confirmPasswordTextBox;
	@FindBy(xpath = "//input[@id= 'chk_agree']") WebElement iaggreeCheckBox;
	@FindBy(xpath = "//input[@id= 'profile_subscribe_to_newsletter']") WebElement suscribeChecktBox;
	
	@FindBy(name = "commit") WebElement createProfile;
	
	//Initializing the Page Objects:
		public RegistrationPage(){
			PageFactory.initElements(driver, this);
		}

		
		//Actions:
		public String validateLoginPageTitle(){
			return driver.getTitle();
		}
		
		
		public void Register(String fname, String lname,String country,String Contact,String email,String username,String PWD){
			
			firstNameTextBox.sendKeys(fname);
			lasttNameTextBox.sendKeys(lname);	
			Select drpSelect = new Select(countryDrpodown);
			drpSelect.selectByVisibleText(country);
			addressTextBox.sendKeys();
			contactTextBox.sendKeys(Contact);
			dobTextBox.sendKeys("12-12-1993");
			emailTextBox.sendKeys(email);
			//userNameTextBox.sendKeys(username);
			passwordTextBox.sendKeys(PWD);
			confirmPasswordTextBox.sendKeys(PWD);
			iaggreeCheckBox.click();
			createProfile.click();
		}
}
