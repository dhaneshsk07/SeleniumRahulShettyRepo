package Utils;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import SeleniumAuto.RahulShetty.BaseTest;

public class ElementFetch extends BaseTest {



	public WebElement getWebElement(String identifierType,String identifierValue) {

		switch(identifierType){

		case "XPATH" :
			return BaseTest.driver.findElement(By.xpath(identifierValue));	
			
		case "ID" :
			return BaseTest.driver.findElement(By.id(identifierValue));		
			
		case "NAME" :
			return BaseTest.driver.findElement(By.name(identifierValue));		
			
		case "CSS" :
			return BaseTest.driver.findElement(By.cssSelector(identifierValue));	
			
		case "TAGNAME" :
			return BaseTest.driver.findElement(By.tagName(identifierValue));		
			
		case "LINKED TEXT" :
			return BaseTest.driver.findElement(By.linkText(identifierValue));
			
			
			default: 
				
				return null;
		}
	}
	
	
	//For find_elements 
	
	public List<WebElement>getWebElements(String identifierType,String identifierValue) {

		switch(identifierType){

		case "XPATH" :
			return BaseTest.driver.findElements(By.xpath(identifierValue));	
			
		case "ID" :
			return BaseTest.driver.findElements(By.id(identifierValue));		
			
		case "NAME" :
			return BaseTest.driver.findElements(By.name(identifierValue));		
			
		case "CSS" :
			return BaseTest.driver.findElements(By.cssSelector(identifierValue));	
			
		case "TAGNAME" :
			return BaseTest.driver.findElements(By.tagName(identifierValue));		
			
		case "LINKED TEXT" :
			return BaseTest.driver.findElements(By.linkText(identifierValue));
			
			
			default: 
				
				return null;
		}
	}

}
