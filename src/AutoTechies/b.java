package AutoTechies;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class b {
	
	public WebDriver setProp() {
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", "C:/Dev_Tools/chromedriver_win32/chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://shoppingcart.theautomationtechies.com/");
		return driver;
	}
}
