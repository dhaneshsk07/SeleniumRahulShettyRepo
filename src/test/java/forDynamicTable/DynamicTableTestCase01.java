package forDynamicTable;

import java.io.IOException;


import org.openqa.selenium.WebDriver;

import org.testng.annotations.Test;



import SeleniumAuto.RahulShetty.BaseTest;


import demoutil.Excel;

public class DynamicTableTestCase01 extends BaseTest {
	WebDriver driver;
	private String excelFilePath;
	private Excel excel;







	@Test(enabled=true)

	public void sumOfCpuUsage() throws Exception

	{

		DynamicTableTC01 dt=new DynamicTableTC01();
		dt.compareChromeValue();
		dt.compareCpuCololumnValuesWithTotalValue();
		

	}

}
