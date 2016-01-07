package com.selenium.OrangeHRM.Listeners;


import java.util.List;
import java.util.Map;

import org.testng.IReporter;
import org.testng.ISuite;
import org.testng.ISuiteResult;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.xml.XmlSuite;


public class listenerTest implements IReporter{

	public void generateReport(List<XmlSuite> xmlSuites, List<ISuite> suites,
			String outputDirectory) {
		
		for(ISuite suite: suites)
		{
			System.out.println("The suite file is" + suite.getName());
			Map<String, ISuiteResult> suiteResults = suite.getResults();
			for(ISuiteResult sr: suiteResults.values())
			{
				  ITestContext tc = sr.getTestContext();
				  System.out.println("Passed tests for suite '" + suite.getName() +
				             "' is:" + tc.getPassedTests().size());
				  System.out.println("Failed tests for suite '"+ suite.getName()+ " is"+ tc.getFailedTests().size());
				
			}
			
		}
				
		
	}
	
	@AfterMethod
	public void statusResult()
	{
		ITestResult result1 = Reporter.getCurrentTestResult();
		if(result1.isSuccess())
		{
			System.out.println("This is for result tests "+ result1.getStatus());
		}
		
	}

	
	
}

		