package testCases;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

import testbase.BaseparentClass;

public class Listeners extends BaseparentClass implements ITestListener{

	@Override
	public void onTestFailure(ITestResult result) {
	
		
		String testMethodName = result.getMethod().getMethodName();
		
		try {
		
		getScreenshotPath(testMethodName);
		
		}catch(IOException e)
		{
			e.printStackTrace();
		}
	
	
	}

	
	
	
}
