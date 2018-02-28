import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestWebdriverFFox {

	@Test
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.seleniumeasy.com/test/basic-radiobutton-demo.html");
		WebElement userMessage = driver.findElement(By.name("optradio"));
		if (userMessage.isEnabled()) {
			if (!userMessage.isSelected()) {
				userMessage.click();
				System.out.println("Zaznaczyłem Element");
			}
		}
		driver.quit();
	}
	

}
