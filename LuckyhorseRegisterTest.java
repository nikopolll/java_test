package registerFormTest;

import static org.junit.Assert.assertEquals;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LuckyhorseRegisterTest {
	public WebDriver driver;
	String regPageUrl = "http://ogloszenia.luckyhorse.pl/user/register";

	@Before
	public void setUp() {
		driver = new ChromeDriver();
		driver.get(regPageUrl);

	}

	@Test
	public void titleCheck() {
		assertEquals("Utwórz nowe konto - Ogłoszenia - Lucky Horse", driver.getTitle());

	}

	@Test
	public void formFill() {
		String[] name = { "Jan Test1", "Jan Test2", "Jan Test3" };
		String[] mail = { "vtgr@asdhgsad.com", "jcht@50mb.ml", "lier@gotimes.xyz" };
		String[] password = { "haslo1", "haslo2", "haslo3" };
		

		for (int i = 0; i <= 2; i++) {
			WebElement inputName = driver.findElement(By.id("s_name"));
			WebElement inputEmail = driver.findElement(By.id("s_email"));
			WebElement inputPassword1 = driver.findElement(By.id("s_password"));
			WebElement inputPassword2 = driver.findElement(By.id("s_password2"));
			WebElement submitButton = driver.findElement(By.className("btn-success"));
			inputName.sendKeys(name[i]);
			inputEmail.sendKeys(mail[i]);
			inputPassword1.sendKeys(password[i]);
			inputPassword2.sendKeys(password[i]);
			submitButton.click();
			driver.navigate().to(regPageUrl);

			new WebDriverWait(driver, 10).until(new ExpectedCondition<Boolean>() {
				public Boolean apply(WebDriver d) {
					return d.findElement(By.xpath("//*[@id=\"s_name\"]")).isDisplayed();

				}
			});
			
		}

	}

	@After
	public void tearDown() throws Exception{
		driver.quit();
	}
}
