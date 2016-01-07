package com.selenium.OrangeHRM.Listeners;

import org.apache.log4j.Logger;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ITestResultListeners implements ISuiteListener, ITestListener {

	static Logger log = Logger.getLogger(ITestResultListeners.class);
	public void onStart(ISuite suite) {
		log.debug("The suite file has started executing");
	}

	public void onFinish(ISuite suite) {
       log.debug("The Suite file has completed executing");
		
	}

	public void onTestStart(ITestResult result) {
		log.debug("The test case started execution: "+ result.getName());
		
	}

	public void onTestSuccess(ITestResult result) {
		log.debug("The test case ran successfully: "+ result.getName());
		
	}

	public void onTestFailure(ITestResult result) {
		log.debug("The test case failed execution: "+ result.getName());

	}

	public void onTestSkipped(ITestResult result) {
		log.debug("The test case got skipped execution: "+ result.getName());		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}
	
}
