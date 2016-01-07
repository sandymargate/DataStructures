package com.selenium.OrangeHRM.Login;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

public class transformer implements IAnnotationTransformer {

	public void transform(ITestAnnotation annotation, Class testClass,
			Constructor testConstructor, Method testMethod) {
		
		if("testLogger".equals(testMethod.getName()))
			annotation.setInvocationCount(5);

	}

}
