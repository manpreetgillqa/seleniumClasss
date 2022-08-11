package productDemoApp.tc;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import productDemoApp.base;
import productDemoApp.po.PO_HomePage;

public class TC_HomePage extends base{
	
	WebDriver driver;
	
	@BeforeMethod
	public void setup() {
	driver = setProperty();
	
	
	}
	
	@Test
	public void t_01_Validate_Form() throws InterruptedException {
	PO_HomePage hp = new PO_HomePage(driver);
	hp.setFirstName("Manpreet");
	hp.setLastName("Gill");
	hp.setAddress("Kitchener");
	Thread.sleep(2000);
	hp.scrollDownBy(300);
	Thread.sleep(2000);
	hp.selectSkillsDropDownByValue("Android");
	hp.clickRadioButtonMale();
	hp.clickCheckBox1();
	}
	
	@AfterMethod
	public void tearDown() {
		
	driver.quit();
		
	}

}
