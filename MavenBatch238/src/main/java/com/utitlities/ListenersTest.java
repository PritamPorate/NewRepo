package com.utitlities;

import org.apache.log4j.Logger;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenersTest implements ITestListener{
 public static Logger Log = Logger.getLogger(ListenersTest.class);

public void onTestStart(ITestResult result) {
	Log.info("Execution startd of "+result.getName()+"test.........");
}

public void onTestSuccess(ITestResult result) {
	Log.info("Execution successfully of "+result.getName()+"test.........");

}

public void onTestFailure(ITestResult result) {
	Log.info("Execution fail of "+result.getName()+"test.........");

}

public void onTestSkipped(ITestResult result) {
	Log.info("testcase skipped of "+result.getName()+"test.........");

}

public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

}

public void onStart(ITestContext context) {
	Log.info("Execution startd of "+context.getName()+"test.........");

}

public void onFinish(ITestContext context) {
	Log.info("Execution startd of "+context.getName()+"test.........");

}
	
 
}
