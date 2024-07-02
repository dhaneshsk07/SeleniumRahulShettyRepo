package ReferenceUtil;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


//--------------------P-A-G-E-----F-A-C-T-O-R-Y--------------------//
public class PageFactoryReference {
	
	WebDriver driver;
	
public PageFactoryReference(WebDriver driver) {
	
	this.driver=driver;
	PageFactory.initElements(driver, this);
	
}

@FindBy(id="username")  //same as --> driver.findElement(By.id("username"));
WebElement usrname;

@FindBy(id="password") 
WebElement pwd;

@FindBy(id="login")  
WebElement loginBtn;
public void loginFunction(String username,String password) {
	
	usrname.sendKeys(username);
	pwd.sendKeys(password);
	loginBtn.submit();
	
	
	
}


}
//----------------------------------------------below check-------------------//
// in test class or function class calling class2
//public class Methodclass{
//public void test() {
//PageFactoryReference pgr=new PageFactoryReference(driver);
//pgr.loginFunction("dhanesh","222");
//}
//}

//-------------------------------------End------------------------//