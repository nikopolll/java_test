package Chromedrive;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findelements {
	public WebDriver driver;
	String pageURL = "http://fdm.org.pl";
	

	@Before
	public void setUp() {
		driver = new ChromeDriver();
		driver.get(pageURL);
	}

	@Test
	public void findElementsBy() {
		List<WebElement> linki = driver.findElements(By.tagName("a"));
		assertEquals(35, linki.size());
		
		
		System.out.println(linki.size());
		
		
		for (WebElement links : linki) {
			System.out.println(links.getAttribute("href"));
		}

	}
	@Test 
	public void getTitleLength(){
		int title = driver.getTitle().length();
		System.out.println("Title length: " + title);
		
	}

	@After
	public void teraDown() {
		driver.quit();
	}

}
