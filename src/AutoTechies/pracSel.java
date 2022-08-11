package AutoTechies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class pracSel {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", "C:/Dev_Tools/chromedriver_win32/chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://shoppingcart.theautomationtechies.com/");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Login or register")).click();
		Thread.sleep(2000);
		// verify the Register radio button is checked or not
		WebElement RegAccBtn = driver.findElement(By.id("accountFrm_accountregister"));
		boolean verify = RegAccBtn.isSelected();
		
		if (verify == true)
			System.out.println("radio button for account registration is checked");
		else
			System.out.println("radio button for account registration is not checked");
		
		driver.findElement(By.xpath("//button[@type='submit'and @title= 'Continue']")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.id("AccountFrm_firstname")).sendKeys("Manpreet");
		Thread.sleep(1000);
		driver.findElement(By.id("AccountFrm_lastname")).sendKeys("Gill");
		Thread.sleep(1000);
		driver.findElement(By.id("AccountFrm_email")).sendKeys("manpreetgill4455@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.id("AccountFrm_address_1")).sendKeys("42 Harvest");
		Thread.sleep(1000);
		driver.findElement(By.id("AccountFrm_city")).sendKeys("Kitchener");
		Thread.sleep(1000);
		WebElement element = driver.findElement(By.id("AccountFrm_zone_id"));
		Select dDown1 = new Select(element);
		dDown1.selectByVisibleText("Ontario");
		driver.findElement(By.id("AccountFrm_postcode")).sendKeys("N2P1T3");
		Thread.sleep(1000);
		driver.findElement(By.id("AccountFrm_loginname")).sendKeys("manpreetgillqa");
		Thread.sleep(1000);
		driver.findElement(By.id("AccountFrm_password")).sendKeys("password");
		Thread.sleep(1000);
		driver.findElement(By.id("AccountFrm_confirm")).sendKeys("password");
		Thread.sleep(1000);
		driver.findElement(By.id("AccountFrm_newsletter0")).click();
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("input[type=checkbox]")).click();
		
//		driver.findElement(By.cssSelector("button[title=Continue]")).click();
	
		
		
		
		driver.close();

	}

}
