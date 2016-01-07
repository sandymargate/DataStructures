package com.selenium.OrangeHRM.Login;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ExperimentingDifferentWaitsTest {

	@Test
	public void diffWait()
	{
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setJavascriptEnabled(true);
		FirefoxProfile profile = new FirefoxProfile();
        dc.setCapability(FirefoxDriver.PROFILE, profile);
		WebDriver driver = new FirefoxDriver(profile);
		dc.setJavascriptEnabled(false);
        System.out.println("The browser: "+ dc.isJavascriptEnabled()+ "The version: "+ dc.getVersion());
        
         driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://accounts.google.com/SignUp");
		WebElement ele = driver.findElement(By.tagName("h1"));
		Assert.assertTrue(ele.isDisplayed(), "The link is displayed");
		WebElement eleNext = driver.findElement(By.cssSelector("#submitbutton"));
		eleNext.click();
		WebDriverWait wait = new WebDriverWait(driver, 30);
		
		//Refreshing DOM
		wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(ele)));
		Assert.assertTrue(ele.isDisplayed(), "The link is displayed");
		
		//Checking if the element is clickable
		wait.until(ExpectedConditions.elementToBeClickable(eleNext));
		Assert.assertTrue(eleNext.isEnabled(), "The link is displayed");
		
		//Checking if the title of an element matches 

		WebElement gender = driver.findElement(By.cssSelector("div[title='Gender']"));
		wait.until(ExpectedConditions.titleContains("Create your Google Account"));
		
		//Checking if the element is present in the dom
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("errormsg_0_Passwd")));
		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("Passwd"), "You can't leave this empty."));
		
	    driver.findElement(By.id("Passwd")).sendKeys(Keys.chord(Keys.CONTROL+"T"));
	    
				
        driver.quit();
		
	}
	
	
}
