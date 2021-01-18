package testcase;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.TestBase;
import pages.LoginPage;
import pages.RegistrationPage;
import pages.homePage;
import util.TestUtil;

public class RegistrationTest extends TestBase{
	
	RegistrationPage registrationPage;
	homePage home;
	String sheetName = "Register";
	public RegistrationTest(){
		super();
	}
	
	@BeforeMethod
	public void setUp(){
		initialization();
		home= new homePage();
		registrationPage = home.clickOnRegisterLink();	
	}
	
	
	@DataProvider
	public Object[][] RegisterData(){
		Object data[][] = TestUtil.getTestData(sheetName);
		return data;
	}
	@Test(priority=4,dataProvider="RegisterData")
	public void RegisterTest(String fname, String lname,String country,String Contact,String email,String username,String PWD){
		System.out.println("In register method");
		registrationPage.Register(fname, lname, country, Contact, email, username, PWD);
		Assert.assertEquals(driver.findElement(By.xpath("//*[contains(text(),'Incorrect word verification! please try again...')]")).getText(), "Incorrect word verification! please try again...");
	}
	
	
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}

}
