package SeleniumAuto.RahulShetty;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeMethod;


import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseConnectionRS {
	
	public static WebDriver driver1;

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
		
		
		public void connection() throws InterruptedException {
			WebDriverManager.edgedriver().setup();

			driver1 = new EdgeDriver();
			
			//driver1.get("https://www.saucedemo.com"); 
			
			driver1.get("https://rahulshettyacademy.com/locatorspractice");
			driver1.manage().window().maximize();
			Thread.sleep(5000);  
			 
			

			} 

		}
		

	//}

