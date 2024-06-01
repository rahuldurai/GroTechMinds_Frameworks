package day2_19052024;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenersTest implements ITestListener {

	public void onTestStart(ITestResult result) {

		System.out.println("On Test Start: "+result.getName());
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("On Test Success: "+result.getName());
	}

	public void onTestFailure(ITestResult result) {

		System.out.println("On Test Failed: "+result.getName());
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("On Test Skipped: "+result.getName());
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

	}

	public void onTestFailedWithTimeout(ITestResult result) {
		onTestFailure(result);
	}

	public void onStart(ITestContext context) {
		System.out.println("On Execution Start");
	}

	public void onFinish(ITestContext context) {
		System.out.println("On Execution Finish");
	}

}
