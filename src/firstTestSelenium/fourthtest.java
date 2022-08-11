package firstTestSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fourthtest {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:/Dev_Tools/chromedriver_win32/chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.navigate().to("https://google.com/");
		
		Thread.sleep(2000);
		
		driver.get("https://www.netflix.com/browse");
		
		WebElement Username = driver.findElement(By.id("id_userLoginId"));
		Username.sendKeys("manpreetgill4455@gmail.com");
		Thread.sleep(2000);
		
		WebElement Password = driver.findElement(By.id("id_password"));
		Password.sendKeys("");
		Thread.sleep(2000);
		
		WebElement SignInButton = driver.findElement(By.cssSelector("button[type=submit]"));
		SignInButton.click();

		
	}

}
