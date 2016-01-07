package com.selenium.OrangeHRM.Login;

import org.testng.TestNG;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.selenium.OrangeHRM.keywords.loginPage;

public class loginPageTest {

	//This method set the login cases
	
	@Test
	public void testLogger()
	{
		loginPage setters = new loginPage();
		setters.setDebugLog("Sandhya");
		setters.setErrorLog("Nischu");
		setters.setInfoLog("Nani");
		setters.setWarnLog("Chinna");
		
		
	}
	
	
	public void annotationTransformer()
	{
	TestNG tg = new TestNG();
	tg.setAnnotationTransformer(new transformer());
	tg.setTestClasses(new Class[] {loginPageTest.class});
	}
	
}
