package zephyrJira;
import java.sql.Time;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ZephyrJira {

	WebDriver driver;
	
	

	@BeforeMethod
	public static void setupClass() {
		WebDriverManager.chromedriver().setup();
	}
	
	@BeforeTest
	public void setupTest() {
		driver = new ChromeDriver();
	}
	
	@AfterTest
	public void teardown() {
		if (driver != null) {
			driver.quit();
		}
	}
		@Test
		public void getMsn() throws InterruptedException {
			// Your test code here
			
			driver.get("https://www.msn.com/en-us");
			Thread.sleep(1000);
			System.out.println(driver.getTitle());
			
			
			
		}
		
		@Test
		public void getYahoo() throws InterruptedException {
			// Your test code here
			Thread.sleep(1000);
			driver.get("https://www.yahoo.com/");
			Thread.sleep(1000);
			System.out.println(driver.getTitle());
			
			
		}
}
