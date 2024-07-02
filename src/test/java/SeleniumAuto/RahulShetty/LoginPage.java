package SeleniumAuto.RahulShetty;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginPage extends BaseConnectionRS {
	
	
	@Test(priority=0)
	public void basicUrlRun() throws InterruptedException {
		BaseConnectionRS aa = new BaseConnectionRS();
		aa.connection();
		
		
		driver1.findElement(By.xpath("//input[@id='inputUsername']")).sendKeys("Vighna vinayaga");
		
		//inputPassword
		driver1.manage().window().maximize();
		
		Thread.sleep(2000);
		driver1.close();

}
	
	@Test(priority=1)
	public void samplerun() {
		
		//driver1.findElement(By.id("//input[@name='inputPassword']")).sendKeys("Vighna vinayaga");
		
	}
}
