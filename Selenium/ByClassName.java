package seleniumLocators;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByClassName {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));

		driver.get("https://www.bigbasket.com/");

		List<WebElement> links=driver.findElements(By.className("eFQ30H"));
		System.out.println("Total number of links present: "+links.size());
		System.out.println();

		for(int i=0; i<links.size(); i++) {
			String text= links.get(i).getText();
			if(text.isEmpty()) {
				System.out.println(i+"th link text is : [not accessible or not present]");
			}
			else	
				System.out.println(i+"th link text is : "+text);
		}
		Thread.sleep(3000);
		driver.quit();	

	}
}