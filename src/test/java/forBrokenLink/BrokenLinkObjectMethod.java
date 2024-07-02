package forBrokenLink;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import SeleniumAuto.RahulShetty.BaseTest;
import sun.awt.SunHints.Value;

public class BrokenLinkObjectMethod extends BaseTest {

	// single lin - soapui
	WebElement soapuiLink=driver.findElement(By.xpath("//a[@href='https://www.soapui.org/']"));


	public void scrollElement() {

		//--------SCROLL ELEMENT----
		WebElement scrollelement=driver.findElement(By.cssSelector("a[href*='soapui']"));

		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", scrollelement);

	}


	public void soapUiClick() throws MalformedURLException, IOException {
		//soapuiLink.click();
		

		String url=driver.findElement(By.cssSelector("a[href*='soapui']")).getAttribute("href");
		HttpURLConnection  conn=(HttpURLConnection) new URL(url).openConnection();
		conn.setRequestMethod("HEAD");
		conn.connect();
		int resCode=conn.getResponseCode();
		System.out.println("Response Code : " + resCode);


		//Just for test mytesting
		if(resCode<400) {
			System.out.println("With Response code" + resCode);
			Assert.assertTrue(true); 
		}  

	}

	//throws IOException

	public void listAllLinksBroken() throws Exception, IOException  {
		
		
		scrollElement();
		
		//-----List all link in li class ----
		
		List<WebElement> links= driver.findElements(By.cssSelector("li[class='gf-li'] a"));
		SoftAssert sa=new SoftAssert();
		for(WebElement link : links) {

			String urlAll=link.getAttribute("href");
			//driver.findElement(By.cssSelector("a[href*='soapui']")).getAttribute("href");
			HttpURLConnection  conn=(HttpURLConnection) new URL(urlAll).openConnection();
			conn.setRequestMethod("HEAD");
			conn.connect();
			int resCode=conn.getResponseCode();
			System.out.println("Link is  : " + link.getText().toString() + " and Response Code : " + resCode);


			sa.assertTrue(resCode<400,"Failed Link is  : " + link.getText() + " " + " and  Response code : " + resCode);



			//used instead of hard assert --here the link stop at 5th position due to hard assertion

			//	if(resCode>400) {
			//	System.out.println("Failed Link is  : " + link.getText().toString() + " " + "and  Response code : " + resCode);
			//	sa.assertTrue(false); 
			//	}  

			//use instead of if loop - softassert Assert.assertTrue(False)

		}

	}



}
