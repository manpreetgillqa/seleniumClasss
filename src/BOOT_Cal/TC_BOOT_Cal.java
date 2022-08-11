package BOOT_Cal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC_BOOT_Cal extends BaseClass {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		driver = SetProperty();	
	}
	
	@Test
	public void TC001_Title_Verification() throws InterruptedException {
	PO_HomePage hp = new PO_HomePage(driver);
	hp.getUrl("https://www.calculator.net/");
	Thread.sleep(1000);
	String Title = driver.getTitle();
	Assert.assertEquals(Title,"Calculator.net: Free Online Calculators - Math, Fitness, Finance, Science" );
	}
	
	@Test
	public void TC002_Verify_Search_Button_Functionality() throws InterruptedException {
		PO_HomePage hp = new PO_HomePage(driver);
		hp.getUrl("https://www.calculator.net/");
		hp.setSearch("Mortgage Calculator");
		Thread.sleep(2000);
		hp.clickMortgageCalculator();
		hp.verifyPageTitle("Mortgage Calculator");
		hp.clickLogo();
		hp.setSearch("BMR Calculator");
		Thread.sleep(2000);
		hp.clickBMRCalculator();
		hp.verifyPageTitle("BMR Calculator");
	}
	
	@Test
	public void TC003_Verify_Search_Functionality_With_Non_Alaphabetical_Inputs() throws InterruptedException {
		PO_HomePage hp = new PO_HomePage(driver);
		hp.getUrl("https://www.calculator.net/");
		hp.setSearch("1234");
		Thread.sleep(2000);
		hp.displayResultsFromSearchField();
		hp.searchBar.clear();
		hp.setSearch("!#^)<");
		Thread.sleep(2000);
		hp.displayResultsFromSearchField();
		
	}
	
	@Test
	public void TC004_Link_Verification_Test_On_HomePage() throws InterruptedException {
		PO_HomePage hp = new PO_HomePage(driver);
		hp.getUrl("https://www.calculator.net/");
		hp.clickFinancialCalculators();
		Thread.sleep(2000);
		hp.verifyPageTitle("Financial Calculators");
		hp.clickLogo();
		Thread.sleep(1000);
		hp.clickHealthAndFitnessCalculators();
		Thread.sleep(2000);
		hp.verifyPageTitle("Fitness and Health Calculators");
		hp.clickLogo();
		Thread.sleep(1000);
		
	}
	
	
	
	
	
	
	
	
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();	
	}

}
