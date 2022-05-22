package seleniumLocators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByPartialLink {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));

		
		
		driver.get("https://www.flipkart.com/");
		WebElement forgot=driver.findElement(By.linkText("Forgot?"));
		System.out.println(forgot.isDisplayed());
		WebElement TermsOfUse=driver.findElement(By.partialLinkText("Terms"));
		System.out.println(TermsOfUse.isDisplayed());
		driver.quit();
	}
}
