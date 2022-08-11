package firstTestSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class fifthtest {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:/Dev_Tools/chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.youtube.com/");
//		String title = driver.getTitle();
//		Assert.assertEquals(title, "YouTube");
		
		WebElement searchBar = driver.findElement(By.cssSelector("input[id=search]"));
		searchBar.sendKeys("Driving licence by Olivia");
		WebElement searchButton = driver.findElement(By.id("search-icon-legacy"));
		searchButton.click();
		Thread.sleep(2000);
		searchBar.clear();
		searchBar.sendKeys("Manpreet");
		searchButton.click();
		Thread.sleep(2000);
		driver.navigate().back();
		searchBar.clear();
		searchBar.sendKeys("sabiya");
		searchButton.click();
		Thread.sleep(2000);
		driver.navigate().back();
		
		
		
		
		
//		Thread.sleep(2000);
//		driver.quit();
		
		
		
		
		

	}

}
