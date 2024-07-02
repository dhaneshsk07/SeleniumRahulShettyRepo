package PageEvents;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import PageObjects.HomePageElements;
import PageObjects.LoginPageElements;
import QA.Test.TestCase1;
import SeleniumAuto.RahulShetty.BaseTest;

import Utils.ElementFetch;
import Utils.ExcelReaderRS;


public class LoginPageEvents extends BaseTest{
	
	WebDriver driver; //edited on 23-06

	
	private ElementFetch ele;
	private ExcelReaderRS reader;
	

    // Constructor to initialize the fields

    
    public LoginPageEvents(WebDriver driver) {
		// TODO Auto-generated constructor stub
    	
    	this.driver=driver;
    	// Initialize ElementFetch with driver
	}

	
	 


	//Method1
	public void verifyIfLoginPageIsLoaded() {
		
		
		Assert.assertTrue(ele.getWebElements("XPATH", LoginPageElements.loginButton).size()>0,"Element not found");		
	}
	
	
	//Method 2
	public void loginInButton() {
		ele.getWebElement("XPATH", LoginPageElements.loginButton).click();
	}
	
	//Method 3
	public void enterCredentials(String username, String password) throws Exception {
		
		reader =new ExcelReaderRS();

		 ele =new ElementFetch(); 
		 
		ele.getWebElement("XPATH", LoginPageElements.emailText).sendKeys(username);
		ele.getWebElement("XPATH", LoginPageElements.pwdText).sendKeys(password);
	}
	
	
	public void loginWithCredentials(String username, String password) throws Exception {
        enterCredentials(username, password);
        loginInButton();
    }
	
	

	
	

}
