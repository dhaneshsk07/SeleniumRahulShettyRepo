package forBrokenLink;

import java.io.IOException;


import org.openqa.selenium.WebDriver;

import org.testng.annotations.Test;



import SeleniumAuto.RahulShetty.BaseTest;


import demoutil.Excel;

public class BrockenLinkTestCases extends BaseTest {
	WebDriver driver;
	private String excelFilePath;
	private Excel excel;

	@Test(enabled=false)
	public void testSoapUILink() throws Exception

	{

		BrokenLinkObjectMethod bl= new BrokenLinkObjectMethod();
		bl.soapUiClick();
		
 
	} 
	@Test(enabled=true)

	public void testAllBrokenLinks() throws Exception

	{

		BrokenLinkObjectMethod bl= new BrokenLinkObjectMethod();
		bl.listAllLinksBroken();
		

	} 

}
