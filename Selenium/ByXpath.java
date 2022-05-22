package seleniumLocators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByXpath {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		
		driver.get("https://www.bing.com/");
		WebElement textField= driver.findElement(By.id("sb_form_q"));
		textField.sendKeys("Bengaluru, India");
		textField.submit();
		
		WebElement address= driver.findElement(By.xpath("//*[@id=\"elc_eid_YN4070x408154415252700828\"]/div/div/div[2]/span[2]/div"));
		String text =address.getText();
		System.out.println("Address: "+text);
	  driver.quit();
	}
}
