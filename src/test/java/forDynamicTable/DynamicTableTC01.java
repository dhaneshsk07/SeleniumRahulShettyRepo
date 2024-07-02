package forDynamicTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import SeleniumAuto.RahulShetty.BaseTest;
import sun.awt.SunHints.Value;

public class DynamicTableTC01 extends BaseTest {
	
	//WebDriver driver;
	//List <WebElement> values=driver.findElements(By.cssSelector(".table-responsive td:nth-child(2)"));
	List <WebElement> memoryValues=driver.findElements(By.cssSelector(".table-responsive td:nth-child(4)"));
	
	//Chrome colum and chrome 2 column 2 value -2nd Method
	
	WebElement chromeValue=driver.findElement(By.cssSelector(".table-responsive tr:nth-child(2) td:nth-child(2)"));
	WebElement totalValue=driver.findElement(By.xpath("//p[@id='chrome-cpu']"));
	
	
	
	/* --Dynamic TABLE
	Name	CPU	Disk	Memory	Network
	Firefox	0.5%	0.6 MB/s	9.4 MB	6.8 Mbps
	Chrome	0.7%	0.2 MB/s	48 MB	4.1 Mbps
	System	1%	0.6 MB/s	70.6 MB	0.4 Mbps
	Internet Explorer	4.6%	0.4 MB/s	14.7 MB	0.8 Mbps 
	
	Total CPU: 6.8% */
	
	public void compareCpuCololumnValuesWithTotalValue() {
	
		float sum=0;
		String aa;
		String totVal;
		
		
		totVal=totalValue.getText().toString().split(":")[1].trim();
		//Assert.assertEquals(sum,totalValue);
		System.out.println("The method1 TotalVal is :" + totVal);
		
		for(int i=0;i<memoryValues.size();i++) {
			
			//sum =Integer.parseInt(memoryValues.get(i).getText().split("")[1]);
			//sum =sum + (Float.parseFloat(memoryValues.get(i).getText().split("")[1]));
			
			//aa=memoryValues.get(i).getText().toString();
		//System.out.println("The Sum is :" + sum);
			
		}
		
	
		
	}
	
	/* --Dynamic TABLE
	Name	CPU	Disk	Memory	Network
	Firefox	0.5%	0.6 MB/s	9.4 MB	6.8 Mbps
	Chrome	0.7%	0.2 MB/s	48 MB	4.1 Mbps
	System	1%	0.6 MB/s	70.6 MB	0.4 Mbps
	Internet Explorer	4.6%	0.4 MB/s	14.7 MB	0.8 Mbps 
	
	Total CPU: 0.7% */ //-- result--//
	
	//Aim : To Take chrome value  and equate with the result 
	
	public void compareChromeValue() {
		float sum1=0;
		String selectedChromeVal;
		String totChromeVal;
		
		
		selectedChromeVal=(chromeValue.getText().toString().split("")[0].trim());
		System.out.println("The Method2 selectedChromeVal is :" + selectedChromeVal);
		totChromeVal=totalValue.getText().toString().split(":")[1].trim();
		
		System.out.println("The Method2 totChromeVal is :" + totChromeVal);
		Assert.assertEquals(selectedChromeVal,totChromeVal);
	
			
		}
		
		

}
