package TestNG;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.google.common.io.Files;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class googleTest extends base {
	

	WebDriver driver;
	
	
	@BeforeMethod
	public void setup() {
	driver = setProperty();
	driver.navigate().to("https://google.com/");
	
	}
	
	@Test
	public void googleTitleTest() {
	
	String title = driver.getTitle();
	System.out.println(title);
	
	Assert.assertEquals(title, "Google");
	}
	
	@Test
	public void googleLogoTest() {
	
	boolean logo = driver.findElement(By.className("lnXdpd")).isDisplayed();
	System.out.println("Logo is displayed: " + logo);
	
	}
	
	@Test
	public void googleGmailTest() {
	
	boolean gmail = driver.findElement(By.linkText("Gmail")).isDisplayed();
	System.out.println("Gmail is displayed: " + gmail);
	
	Assert.assertEquals(gmail, gmail);
	}
	
	@AfterMethod
	public void teardown() {
		
	driver.close();
	driver.quit();
	}
	
}
