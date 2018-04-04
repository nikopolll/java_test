package Chromedrive;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class interogation_basics {
	WebDriver driver;
	String testUrl = "http://www.seleniumeasy.com/test/basic-first-form-demo.html";
	
	@Before
	public void setUp() {
		driver = new ChromeDriver();
		driver.get(testUrl);
		
	};
	@Test
	public void getTitleTest() {
	 assertEquals("Selenium Easy Demo - Simple Form to Automate using Selenium", driver.getTitle());	
	}
	@Test
	public void getCuretnURLtest() {
		assertEquals(testUrl, driver.getCurrentUrl());
	}
	@Test
	public void getCuretnPageSRCtest() {
		Boolean text = driver.getPageSource().contains("This would be your first example to start with Selenium.");
		if(text == true) {
			System.out.println("Tekst znaleziony");
		} else {
			System.out.println("Nie ma takiego zdania");
		}
	}
	
	@After
	public void tearDown() {
		driver.quit();
	}
};
