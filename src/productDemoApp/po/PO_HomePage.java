package productDemoApp.po;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PO_HomePage {
//page object class for homepage objects
	
	WebDriver driver;
	
	public PO_HomePage(WebDriver driver) {
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}
	@FindBy(how = How.XPATH, using = "//input[@placeholder='First Name']")
	WebElement firstName;
	
	@FindBy(how = How.XPATH, using = "//input[@placeholder='Last Name']")
	WebElement lastName;
	
	@FindBy(how = How.XPATH, using = "//textarea[@ng-model='Adress']")
	WebElement address;
	
	@FindBy(how = How.ID, using = "Skills")
	WebElement SkillsDropDown;
	
	@FindBy(how = How.CSS, using = "input[value='Male']")
	WebElement radioButtonMale;
	
	@FindBy(how = How.ID, using = "checkbox1")
	WebElement checkBox1;
	
	
	public void setFirstName(String fName) {
	firstName.sendKeys(fName);	
	}
	public void setLastName(String lName) {
	lastName.sendKeys(lName);	
	}
	public void setAddress(String adr) {
	address.sendKeys(adr);	
	}
	public void scrollDownBy(int num){
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,"+num+")");
	}
	public void selectSkillsDropDownByValue(String x) {
		Select drop = new Select(SkillsDropDown);
		drop.selectByValue(x);	
	}
	public void clickRadioButtonMale() {
		radioButtonMale.click();
	}
	public void clickCheckBox1() {
		checkBox1.click();
	}
}	


