import static org.junit.Assert.assertEquals;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
//import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class navigationTest {
	public WebDriver driver;
	
	@Before
	public void setup() {
	driver = new FirefoxDriver();
	driver.manage().window().setSize(new Dimension(1440,900));
	driver.get("http://www.seleniumeasy.com/test");
	}
	
	@Test
	public void navTests() {
		driver.navigate().to("http://www.seleniumeasy.com/test/basic-checkbox-demo.html");
		assertEquals("Selenium Easy - Checkbox demo for automation using selenium", driver.getTitle());
		System.out.println(driver.getTitle());
		driver.navigate().back();
		
		driver.navigate().to("http://www.seleniumeasy.com/test/jquery-date-picker-demo.html");
		assertEquals("Selenium Easy - JQuery Date picker demo", driver.getTitle());
		System.out.println(driver.getTitle());
		driver.navigate().back();
        
		driver.navigate().to("http://google.com");
		System.out.println(driver.getTitle());
		driver.navigate().back();
		
		System.out.println(driver.getTitle());
		driver.navigate().refresh();
		
		driver.navigate().forward();
		System.out.println(driver.getTitle());
	};
	
	@After
	public void tearDown() {
		driver.quit();
		
	};

}
