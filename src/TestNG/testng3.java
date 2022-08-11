package TestNG;

import org.testng.annotations.Test;

public class testng3 {
	
	
//	@Test
//	public void loginTest() {
//		System.out.println("Test - Login");
//	}
//	
//	@Test(dependsOnMethods= "loginTest")
//	public void homepageTest() {
//		System.out.println("Test - HomePage");
//	}

	@Test
	public void loginTest() {
		System.out.println("Test - Login");
		int i = 9/0;
	}
	
	@Test(dependsOnMethods= "loginTest")
	public void homepageTest() {
		System.out.println("Test - HomePage");
	}
}
