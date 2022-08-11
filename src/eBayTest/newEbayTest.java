	package eBayTest;

	import java.time.Duration;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.Select;
	import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

	public class newEbayTest {
		
		WebDriver driver;
		
		@BeforeMethod
		public void setUp() {
			
			System.setProperty("webdriver.chrome.driver", "C:/Dev_Tools/chromedriver_win32/chromedriver.exe");
			
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			
			
			driver.get("https://ebay.com");
		}
		
		@Test
		public void homePageTest1() {
			
			homePage hp = new homePage(driver);
			hp.typeSearch("Watch");
			hp.selectCategory("Collectibles");
			hp.clickButton();
			
			
		}
		@Test
		public void homePageTest2() {
			
			homePage hp = new homePage(driver);
			hp.typeSearch("iPhone");
			hp.selectCategory("Collectibles");
			hp.clickButton();
			
			
		}
		@Test
		public void homePageTest3() {
			
			homePage hp = new homePage(driver);
			hp.typeSearch("car");
			hp.selectCategory("Collectibles");
			hp.clickButton();
			
			
		}
			
			@AfterMethod
			public void teardown() {
		
			driver.close();
			driver.quit();
			
		}

	
	}


