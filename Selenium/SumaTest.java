package seleniumIntroduction;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SumaTest {
	
  public static void main(String[] args) {
	

	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

	//WebDriverManager.chromedriver().setup(); //Automatically taking care of chrome driver version

	WebDriver driver = new ChromeDriver();

	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().timeouts().scriptTimeout(Duration.ofMinutes(2));
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

	driver.get("http://google.com");

	driver.close();
  }
}
