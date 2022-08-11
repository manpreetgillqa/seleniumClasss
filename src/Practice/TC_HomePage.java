package Practice;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC_HomePage extends Base {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		driver = setProperty();
		
	}
	
	@Test
	public void t_001_Validate_Login() throws InterruptedException {
		PO_HomePage hp = new PO_HomePage(driver);
		hp.setUsername("Manpreet");
		hp.setPassword("password");
		Thread.sleep(2000);
		hp.hitSignIn();
	}
	@Test
	public void t_002_Validate_Login() throws InterruptedException {
		PO_HomePage hp = new PO_HomePage(driver);
		hp.setUsername("sabiya");
		hp.setPassword("password");
		Thread.sleep(2000);
		hp.hitSignIn();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();	
	}
}
