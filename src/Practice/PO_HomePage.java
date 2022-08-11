package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PO_HomePage {
	
	WebDriver driver;
	
	public PO_HomePage(WebDriver driver) {
	this.driver = driver;
	
	PageFactory.initElements(driver,this);
	
	}
	
	@FindBy(how = How.ID, using = "username")
	WebElement username;
	
	@FindBy(how = How.ID, using = "password")
	WebElement password;
	
	@FindBy(how = How.ID, using = "home_login_submit")
	WebElement signinButton;
	
	public void setUsername(String uName) {
		username.sendKeys(uName);
	}
	public void setPassword(String pWord) {
		password.sendKeys(pWord);
	}
	public void hitSignIn() {
		signinButton.click();
	}
	
	
	
}
