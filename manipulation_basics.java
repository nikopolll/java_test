package Chromedrive;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class manipulation_basics {
	WebDriver driver;
	String pageURL = "http://www.seleniumeasy.com/test/basic-first-form-demo.html";

	@Before
	public void setUp() {
		driver = new ChromeDriver();
		driver.get(pageURL);
	}

	@Test
	public void insertTextClickCheckMessage() {
		WebElement inputMessage, button, message;
		String text = "Ala ma kota";
		inputMessage = driver.findElement(By.cssSelector("[id='user-message']"));
		button = driver.findElement(By.className("btn-default"));
		message = driver.findElement(By.cssSelector("[id='display']"));
		
		try {
			assertEquals("form-control", inputMessage.getAttribute("class"));
		} catch (Exception e) {
			System.out.println("Uwaga mamy błąd: " + e);
		}

		inputMessage.sendKeys(text);
		button.click();
		assertEquals(text, message.getText());

	}

	@After
	public void tearDown() {
		driver.quit();
	}

}
