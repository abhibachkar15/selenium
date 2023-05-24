package TestNG4;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyListerner  implements ITestListener
{
	public void onTestStart(ITestResult result)
	{
	    System.out.println("test started...");
	  }

	public void onTestSuccess(ITestResult result) 
	{
	    System.out.println("test success...");
	  }
	
	public void onTestFailure(ITestResult result)
	{
		 System.out.println("test failure...");
	  }
	
	public void onTestSkipped(ITestResult result)
	{
		 System.out.println("on test skipped...");
	  }
	
	public void onTestFinish(ITestContext context)
	{
		 System.out.println("on test finish...");
	  }
}
