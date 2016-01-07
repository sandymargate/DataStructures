package com.selenium.OrangeHRM.Login;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.mozilla.javascript.JavaScriptException;
import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.SkipException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.gargoylesoftware.htmlunit.ElementNotFoundException;
import com.google.common.base.Charsets;
import com.google.common.io.Files;
import com.selenium.OrangeHRM.Listeners.listenerTest;

@Listeners(listenerTest.class)
public class autoITTest extends listenerTest {
	
	@Test(expectedExceptions= ElementNotFoundException.class, enabled= false)
	public void calculatorTest() throws IOException
	{
		WebDriver driver = new FirefoxDriver();
		 WebElement Image = driver.findElement(By.xpath("//img[@border='0']"));
		Runtime.getRuntime().exec("C://Users//sandhyap//Documents//calc.exe");
		File screenShot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Actions action = new Actions(driver);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 10);
		
    		ProfilesIni prof = new ProfilesIni();
		FirefoxProfile firefoxProf = prof.getProfile("XX");
		 driver = new FirefoxDriver(firefoxProf);
		driver = new FirefoxDriver();
		throw new SkipException	("Skipped");
		 
	}
	
	@Test(enabled=false)
	public void JS() throws IOException 
	{
		WebDriver driver = new FirefoxDriver();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.get("http://www.google.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String script = "$('input[name=btnI]').click()";
		WebElement webElement = (WebElement) ((JavascriptExecutor) driver).executeScript(script);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       String pageTitle = (String) js.executeScript("document.title");
		  System.out.println("My Page Title Is  : "+pageTitle);  
	}
	
	@BeforeTest
	public void testBefore()
	{
		System.out.println("This is beforeTest");
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("This is method");
	}
	
	@Test
	public void test1()
	{
		System.out.println("This is test1");
	}
	
	@Test
	public void test2()
	{
		System.out.println("this is test2");
		assert "Sandhya".contains("San");
	}
	

}
