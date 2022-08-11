package firstTestSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class thirdTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:/Dev_Tools/chromedriver_win32/chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.navigate().to("https://www.youtube.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("input[id=search]")).sendKeys(" Sukh Mann No match");
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("#search-icon-legacy > yt-icon")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("No Match - Sukh Mann ft. MSOB | latest Punjabi songs 2022")).click();
		Thread.sleep(10000);
		
		driver.navigate().back();
		Thread.sleep(2000);
		
		driver.navigate().back();
		Thread.sleep(2000);

		
		String Title = driver.getTitle();
		System.out.println(Title);
	
		int links = driver.findElements(By.tagName("a")).size();	
		System.out.println(links);

		driver.close();
		driver.quit();
		
		}

}
