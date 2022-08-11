package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testng2 {
	
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
	
	@Test(priority=1,groups="title")
	public void googleTitleTest() {
		System.out.println("Google Title Test - @Test");
	}
	
	@Test(priority=2,groups="title")
	public void googleGmailTest() {
		System.out.println("Google Gmail Test - @Test");
	}
	@Test(priority=3,groups="title")
	public void googleSearchTest() {
		System.out.println("Google Search Test - @Test");
	}
	@Test(priority=4,groups="Test")
	public void Test4() {
		System.out.println("Test - @Test4");
	}
	
	@Test(priority=5,groups="Test")
	public void Test5() {
		System.out.println("Test - @Test5");
	}
	@Test(priority=6,groups="Test")
	public void Test6() {
		System.out.println("Test - @Test6");
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
