package productDemoApp.tc;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class suiteCRM {
	
	 
	WebDriver driver;
	    @BeforeMethod
	    public void setUp() {
	    	
	        System.setProperty("webdriver.chrome.driver", "C:/Dev_Tools/chromedriver_win32/chromedriver.exe");
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.manage().deleteAllCookies();
	        driver.get("https://suitecrm.theautomationtechies.com/public/index.php#/Login");

	    }

	    @Test
	    public void enterCredentials() {
	        driver.findElement(By.name("username")).sendKeys("manpreet_gill");
	        driver.findElement(By.name("password")).sendKeys("123456");
	        driver.findElement(By.id("login-button"));
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.tagName("a")));

	    }
	    @AfterMethod

	        public void tearDown() {
	            driver.quit();

	        }

}
