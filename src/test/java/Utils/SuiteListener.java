package Utils;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.IAnnotationTransformer;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.ITestAnnotation;

import SeleniumAuto.RahulShetty.BaseTest;

public class SuiteListener implements ITestListener,IAnnotationTransformer {
	
	public void onTestFailure(ITestResult result) { 
		
		String filename=System.getProperty("user.dir")+File.separator+"screenshots"+File.separator+result.getMethod().getMethodName();
		
		File f1=((TakesScreenshot)BaseTest.driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(f1,new File(filename+ ".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//After Creating Retry Utils package ==> Analyzer class
	
	
	public void transform(ITestAnnotation annotation,Class testClass, Constructor testConstructor, Method testMethod) {
		
		annotation.setRetryAnalyzer(RetryAnalyzer.class);
	}

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

}
