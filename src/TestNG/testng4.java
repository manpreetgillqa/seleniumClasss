package TestNG;

import org.testng.annotations.Test;

public class testng4 {
	@Test(invocationCount=10)
	public void sum() {
		int a = 10;
		int b = 15;
		int c = a + b;
		System.out.println("Sum is " + c);
	}

}
