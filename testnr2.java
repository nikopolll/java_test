package Chromedrive;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class testnr2 {
	
	public WebDriver driver;
	
	@Before
	public void setup() {
	driver = new ChromeDriver();
	driver.get("http://www.seleniumeasy.com/test/");
	driver.manage().window().setSize(new Dimension(1440,900));
	}
	
	@Test 
	public void menuNaw() {
		WebElement menu = driver.findElement(By.cssSelector("div.container > div > ul > li > a"));
		menu.click();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.titleContains("Simple Form"));
		System.out.println(driver.getTitle());
		
	}
	
	@After
	public void tearDown() {
		driver.quit();
	} 
	
	
}
