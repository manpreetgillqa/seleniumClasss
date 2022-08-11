package firstTestSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SecondTest {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:/Dev_Tools/chromedriver_win32/chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.navigate().to("https://google.com/");
		Thread.sleep(1000);
	
		
		
		

		
		
		driver.get("https://www.netflix.com/browse");
		Thread.sleep(1000);
	
		driver.findElement(By.id("id_userLoginId")).sendKeys("manpreetgill4455@gmail.com");
		Thread.sleep(1000);
		
//		driver.findElement(By.cssSelector("#id_password")).click();
		
		
		driver.findElement(By.cssSelector("input[id='id_password']")).sendKeys("");
		Thread.sleep(1000);
		
		driver.findElement(By.cssSelector("button[type=submit]")).click();		
		Thread.sleep(1000);
		
		driver.findElement(By.cssSelector("#appMountPoint > div > div > div:nth-child(1) > div.bd.dark-background > div.profiles-gate-container > div > div > ul > li:nth-child(1) > div > a > span")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#appMountPoint > div > div > div:nth-child(1) > div.bd.dark-background > div.pinning-header > div > div > div > div:nth-child(1) > div > button > svg")).click();		
		driver.findElements(By.cssSelector("div[class=account-dropdown-button]"));
		Thread.sleep(1000);
		
		driver.findElement(By.cssSelector("svg[class=search-icon]")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.cssSelector("button[class=searchTab]")).sendKeys(" the last kingdom");
		Thread.sleep(5000);
		
		WebElement DropdownElement = driver.findElement(By.className("account-dropdown-button"));
		
		Select Dropdown = new Select(DropdownElement);
		
		Dropdown.selectByVisibleText("");
		
		
//		driver.findElement(By.cssSelector("#appMountPoint > div > div > div:nth-child(1) > div.bd.dark-background > div.pinning-header > div > div > div > div:nth-child(4) > div > div")).click();
//		Thread.sleep(3000);
//		
//		driver.close();
//		driver.quit();
	
	
		
		
		
		
		
		
		
		
		//		driver.findElement(By.className("btn login-button btn-submit btn-small")).click();	
	
	
		
		
		
		
	}
	
}
