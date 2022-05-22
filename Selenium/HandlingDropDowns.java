package main;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingDropDowns {

	public static void main(String[] args) throws InterruptedException {

		//System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));

		driver.get("https://trytestingthis.netlify.app");
		//driver.manage().window().maximize();
		WebElement dropdown = driver.findElement(By.id("option"));
        Select selectObject = new Select(dropdown);
        
        selectObject.selectByIndex(1);
        Thread.sleep(3000);
        
        selectObject.selectByValue("option 3");
        Thread.sleep(3000);
       
        selectObject.selectByVisibleText("option1");
        Thread.sleep(3000);
        driver.quit();
        System.out.print("Done");
       
}
}