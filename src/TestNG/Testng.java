package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testng {
	
	/*
	 * Setup System property for Chrome - @BeforeSuite
Launch Chrome Browser- @BeforeTest
Enter URL- @BeforeClass
Log in to App - @BeforeMethod
Google Title Test - @Test
Log out from App - @AfterMethod
Close Browser - @AfterClass
Delete all cookies - @AfterTest
	 * 
	 */
	
	@BeforeSuite
	public void setUp() {
		System.out.println("Setup System property for Chrome - @BeforeSuite");
	}
	
	
	@BeforeTest
	public void launchBrowser() {
		System.out.println("Launch Chrome Browser- @BeforeTest");
	}
	
	
	@BeforeClass
	public void enterUrl() {
		System.out.println("Enter URL- @BeforeClass");	
	}
	
	
	@BeforeMethod
	public void login() {
		System.out.println("Log in to App - @BeforeMethod");
	}
	
	@Test
	public void googleTitleTest() {
		System.out.println("Google Title Test - @Test");
	}
	
	@AfterMethod
	public void logout() {
		System.out.println("Log out from App - @AfterMethod");
	}
	
	@AfterClass
	public void closeBrowser() {
		System.out.println("Close Browser - @AfterClass");
	}
	
	@AfterTest
	public void deleteAllCookies() {
		System.out.println("Delete all cookies - @AfterTest");
	}

}
