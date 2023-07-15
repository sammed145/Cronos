package listeners;

import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;
import utilities.Setup;

public class Listeners implements ITestListener  
{
	public static WebDriver driver;
	Setup s=new Setup(driver);
	
	
	public void onTestStart(ITestResult result)
	{
//		System.out.println("Cronos "+result.getTestName()+" test begins.....");
		System.out.println("Cronos "+result.getMethod().getMethodName()+" test STARTED.....");
	}

	public void onTestSuccess(ITestResult result) 
	{
//		System.out.println("Cronos "+result.getTestName()+" PASS.....");
		System.out.println(result.getMethod().getMethodName()+" PASSED");
		s.screenshot(result.getMethod().getMethodName());
	}
	

	public void onTestFailure(ITestResult result) 
	{
//		System.out.println("Cronos "+result.getTestName()+" test FAILED.....");
		System.out.println(result.getMethod().getMethodName()+" FAILED");
		s.screenshot(result.getTestName());
	}

	public void onTestSkipped(ITestResult result) 
	{
//		System.out.println("Cronos "+result.getTestName()+" test SKIPPED.....");
		System.out.println(result.getMethod().getMethodName()+" test SKIPPED.....");
	}
	
}
