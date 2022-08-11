package eBayTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class homePage {
	
	WebDriver driver;
	
	// page object model way
	// find objects so you can use them again without writing code
	// we are creating page objects
	
	
	/*identify the elements , assign them a name
	 * create a method with action performed
	 * then call that class name and create an object of the same class , and use it multiple times
	 * assign annotations
	 */
	
	public homePage(WebDriver driver) {
	this.driver = driver;
	}
	
	By search = By.id("gh-ac");
	
	By category = By.id("gh-cat");
	
	By searchButton = By.id("gh-btn");
	
	public void typeSearch(String product) {
		
		driver.findElement(search).click();
		driver.findElement(search).clear();
		driver.findElement(search).sendKeys(product);
	}
	public void selectCategory( String cgory) {
		driver.findElement(category).sendKeys(cgory);
		
	}
	
	public void clickButton() {
		
		driver.findElement(searchButton).click();
	}
}
