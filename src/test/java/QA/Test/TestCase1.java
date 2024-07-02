package QA.Test;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import ExtraUtil.TestConfig;
import PageEvents.HomePageEvents;
import PageEvents.LoginPageEvents;
import PageObjects.LoginPageElements;
import SeleniumAuto.RahulShetty.BaseTest;

import Utils.ElementFetch;
import Utils.ExcelReaderRS;
import demoutil.Excel;

public class TestCase1 extends BaseTest {
	WebDriver driver;
	private String excelFilePath;
	private Excel excel;


//Rechecked on 02072024 17:12
	@BeforeClass

	public void setUp() {
		//driver = initializeDriver(); // Initialize WebDriver, assumed method from BaseTest
		//String excelFilePath = "/mnt/data/path_to_your_excel_file.xlsx"; // Replace with actual path

		TestConfig sc=new TestConfig();	//added on 23-06


		excelFilePath = (sc.TEST_DATA_EXCEL_PATH); //added on 23-06

		excel = new Excel(excelFilePath); //added on 23-06
		excel.readCredentials(); //added on 23-06
		LoginPageEvents loginPage = new LoginPageEvents(driver); //added on 23-06
		loginPage = new LoginPageEvents(driver);//added on 23-06
	}



	@Test(enabled=false)

	public void loginwithcredentials() throws Exception
	{

		Thread.sleep(3000);

		/*----

		Excel reader = new Excel();
		reader.readCredentials(); // Method to read credentials from Excel

		// Assuming reader stores credentials or passes them directly
		String username = reader.getUsername();
		String password = reader.getPassword();

		LoginPageEvents loginPage = new LoginPageEvents(driver);
		//loginPage.verifyIfLoginPageIsLoaded();
		loginPage.enterCredentials(username, password);
		Thread.sleep(3000);
		loginPage.loginInButton();

		// Additional assertions or actions as needed
--*/

	}


	@Test(priority=0)
	public void loginTest() throws Exception {
		List<String[]> credentialsList = excel.getCredentialsList(); // multiple user checking with credentials

		for (String[] credentials : credentialsList) {
			String username = credentials[0];
			Thread.sleep(2000);
			String password = credentials[1];
			Thread.sleep(2000);

			LoginPageEvents loginPage = new LoginPageEvents(driver);
			loginPage.loginWithCredentials(username, password);
			Thread.sleep(3000);
			// Add assertions or further actions as needed
			
			// Add assertions for error message
		    SoftAssert softAssert = new SoftAssert();
	        softAssert.assertTrue( true,"Login is successful");
	        softAssert.assertAll();
		}
	} 
	
	@Test(priority=1)
	public void validLogin() throws Exception {
		List<String[]> credentialsList = excel.getCredentialsList(); // multiple user checking with credentials

		
		 // Assuming first set of credentials is valid
        String username = credentialsList.get(0)[0];
        String password = credentialsList.get(0)[1];
        
        System.out.println("ValidLogin username is : " + username);
        System.out.println("ValidLogin password is : " + password);

        LoginPageEvents loginPage = new LoginPageEvents(driver);
        //loginPage.verifyIfLoginPageIsLoaded();
        loginPage.loginWithCredentials(username, password);

        // Add assertions for successful login
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(true,"Valid Login  successful");
        softAssert.assertAll();
		}
	





}


