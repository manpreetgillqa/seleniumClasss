package LocatorswithFirefox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class locatorswithfirefox {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver", "C:/Dev_Tools/geckodriver-v0.31.0-win64/geckodriver.exe");
		driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.navigate().to("https://google.com/");
		Thread.sleep(2000);
		
		driver.get("http://automationpractice.com/index.php");
		
		WebElement searchbar = driver.findElement(By.id("search_query_top"));
		searchbar.sendKeys("T-shirt");
		Thread.sleep(2000);
		
		driver.findElement(By.name("submit_search")).click();
		Thread.sleep(2000);
		
		driver.navigate().back();
		
		int sliders = driver.findElements(By.className("homeslider-container")).size();
		
		System.out.println(sliders);
		
		int links = driver.findElements(By.tagName("a")).size();
		
		System.out.println(links);
		

	}

}
