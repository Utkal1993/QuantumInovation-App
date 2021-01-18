package testcase;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.TestBase;
import pages.LoginPage;
import pages.homePage;

public class LoginPageTest extends TestBase{
	LoginPage loginPage;
	homePage home;
	
	public LoginPageTest(){
		super();
	}
	
	@BeforeMethod
	public void setUp(){
		initialization();
		home= new homePage();
		loginPage = home.clickOnLoginLink();	
	}
	
	/*@Test(priority=1)
	public void loginPageTitleTest(){
		String title = loginPage.validateLoginPageTitle();
		System.out.println(title);
		Assert.assertEquals(title, "mapSYNQ user profile");
	}*/
	
	@Test(priority=2)
	public void loginTest(){
		loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		Assert.assertEquals(driver.findElement(By.id("notice")).getText(), "Invalid user/password combination");
	}
	
	
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	
	
	
	

}
