package Chromedrive;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testnr3 {
	private WebDriver driver;

	@Before
	public void setup() {
		driver = new ChromeDriver();
		String sitetUrl = "http://www.seleniumeasy.com/test/basic-checkbox-demo.html";
		driver.get(sitetUrl);
	}

	@Test
	public void checkSiteTitle() {
		assertEquals("Selenium Easy - Checkbox demo for automation using selenium", driver.getTitle());
		System.out.println(driver.getTitle());
	}

	@Test
	public void checkSiteUrl() {
		assertEquals("http://www.seleniumeasy.com/test/basic-checkbox-demo.html", driver.getCurrentUrl());
		System.out.println(driver.getTitle());
	}
	
	@Test
	public void checkSiteSource() {
		String pageSource = driver.getPageSource();
		assertTrue("\"checkbox\"", pageSource.contains("\"checkbox\""));
	}
	
	@After
	public void tearDown() {
		driver.quit();
		
	}

}
