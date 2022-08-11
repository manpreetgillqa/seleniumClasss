package eBayTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class eBayTest {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:/Dev_Tools/chromedriver_win32/chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		
		driver.get("https://ebay.com");
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		
//		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("gh-ac")));
		
		WebElement searchText = driver.findElement(By.id("gh-ac"));
		
		searchText.sendKeys("Watch");
		
		WebElement dropDownElement = driver.findElement(By.id("gh-cat"));
		
		Select dropdown = new Select(dropDownElement);
		
		dropdown.selectByVisibleText("Collectibles");
		
		WebElement searchButton = driver.findElement(By.id("gh-btn"));
		
		searchButton.click();
		
		Thread.sleep(2000);
		
		driver.close();
		driver.quit();
		
	}

}
