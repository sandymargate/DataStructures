package com.selenium.OrangeHRM.Login;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.*;

import com.gargoylesoftware.htmlunit.BrowserVersion;
import com.google.common.base.Function;

public class loginHttpUnitTest {

	@Test
	public static void testLoginThroughHTMLUnitDriver() {
		WebDriver driver = new HtmlUnitDriver(BrowserVersion.MOZILLA_1_0);
		driver.get("http://www.google.com");
		Assert.assertEquals(driver.getTitle().trim(), "Google",
				"Google page is not displayed");

		// Search and submit

		/*Wait<WebDriver> wait3 = new FluentWait<WebDriver>(driver)
				.withTimeout(30, TimeUnit.SECONDS)
				.pollingEvery(5, TimeUnit.SECONDS)
				.ignoring(NoSuchElementException.class);

		WebElement foo = wait3.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver) {
				return driver.findElement(By.name("q"));
			}
		});*/
		
       WebDriverWait wait = new WebDriverWait(driver, 10);
       wait.until(ExpectedConditions.presenceOfElementLocated(By.name("q")));
       
		driver.findElement(By.name("q")).sendKeys("Sandy");
		driver.findElement(By.tagName("button")).submit();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		Assert.assertEquals(driver.getTitle().trim(), "Sandy - Google Search",
				"Google page is not displayed");

		driver.quit();

	}

}
