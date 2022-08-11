package firstTestSelenium;

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



public class firstTest {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException, IOException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:/Dev_Tools/chromedriver_win32/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "C:/Dev_Tools/geckodriver-v0.31.0-win64/geckodriver.exe");
	practice("chrome");
	practice("firefox");
		
	}
	public static void practice(String browser) throws InterruptedException {
		if(browser =="chrome") {
			driver = new ChromeDriver();
		}
		else {
			driver = new FirefoxDriver();
		}
		
		
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		
		driver.get("https://google.com");
//		
//		File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		Files.copy(srcFile,new File("./image.png"));
		
		
		WebElement element = driver.findElement(By.cssSelector(".lnXdpd"));
		
//		File srcFile1 = ((TakesScreenshot)element).getScreenshotAs(OutputType.FILE);
//		Files.copy(srcFile1,new File("./image1.png"));
		
//      click on the source folder to refresh and get images of screenshots	
		
//		Thread.sleep(1000);
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		
//		WebElement luckyBtn = driver.findElement(By.name("btnI"));
//		
//		js.executeScript("arguments[0].click();",luckyBtn);
//		
//     	luckyBtn.click();

		driver.navigate().to("https://www.automationstepbystep.com/");
	
		System.out.println(driver.getCurrentUrl());
	
    	System.out.println(driver.getTitle());
		
		driver.navigate().back();
		
		Thread.sleep(2000);
		
		driver.navigate().forward();
		
		Thread.sleep(2000);
		
//		driver.switchTo().newWindow(WindowType.WINDOW);
//		Thread.sleep(2000);
		
		driver.switchTo().newWindow(WindowType.TAB);
		Thread.sleep(2000);
		
		
		
		
		driver.close();
		driver.quit();	
		}
	}


