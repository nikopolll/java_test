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

public class testnr1 {
     
       public WebDriver driver;
	

	@Before
	public void Setup() {
		
		driver = new ChromeDriver();
		driver.manage().window().setSize(new Dimension(1440,900));
		driver.get("http://google.com");
		
	}
	
	@Test
	public void testGoogleSearch() {
		WebElement element = driver.findElement(By.name("q"));
		element.sendKeys("Selenium 3 api");
		WebElement szukaj = driver.findElement(By.className("sbqs_c"));
		szukaj.click();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.titleContains("selenium 3 api"));
		
		System.out.println(driver.getTitle() + "Test wykonany pomyślnie");
	}
	
	@Test
	public void selectByCssPath() {
		WebElement button = driver.findElement(By.cssSelector("form#tsf div div > center > input"));
		System.out.println(button.getAttribute("value"));
	}
	
	@After
	public void tearDown() {
		driver.quit();
		
	}
}
