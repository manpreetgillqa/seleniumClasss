package BOOT_Cal;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class PO_MortgageCal {
	
	WebDriver driver;
	
	public PO_MortgageCal(WebDriver driver) {
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.ID, using = "chouseprice")
	WebElement hPrice;
	
	@FindBy(how = How.ID, using = "cdownpayment")
	WebElement dpay;
	
	@FindBy(how = How.ID, using = "cloanterm")
	WebElement lTerm;
	
	@FindBy(how = How.ID, using = "cinterestrate")
	WebElement irate;
	
	@FindBy(how = How.ID, using = "cstartyear")
	WebElement sDate;
	
	@FindBy(how = How.ID, using = "cpropertytaxes")
	WebElement pTaxes;
	
	@FindBy(how = How.ID, using = "chomeins")
	WebElement hIns;
	
	@FindBy(how = How.ID, using = "cpmi")
	WebElement pmiIns;
	
	@FindBy(how = How.ID, using = "choa")
	WebElement hoaFee;
	
	@FindBy(how = How.ID, using = "cothercost")
	WebElement oCosts;
	
	@FindBy(how = How.NAME, using = "cptinc")
	WebElement propTaxInc;
	
	@FindBy(how = How.NAME, using = "chiinc")
	WebElement hInsInc;
	
	@FindBy(how = How.NAME, using = "choainc")
	WebElement hoaInc;
	
	@FindBy(how = How.NAME, using = "cocinc")
	WebElement ocInc;
	
	@FindBy(how = How.NAME, using = "cexma")
	WebElement extraMonthlyPay;
	
	@FindBy(how = How.NAME, using = "cexya")
	WebElement extraYearlyPay;
	
	@FindBy(how = How.NAME, using = "cexoa")
	WebElement extraOneTimePay;
	
	@FindBy(how = How.NAME, using = "cexmsy")
	WebElement extraMonthlyPayYear;
	
	@FindBy(how = How.NAME, using = "cexysy")
	WebElement extraYearlyPayYear;
	
	@FindBy(how = How.NAME, using = "cexosy")
	WebElement extraOneTimePayYear;
	
	@FindBy(how = How.ID, using = "caddoptional")
	WebElement cbox1;
	
	@FindBy(how = How.ID, using = "csbw")
	WebElement cbox2;
	
	@FindBy(how = How.CSS, using = "input[alt=Calculate]")
	WebElement calculateButton;
	
	@FindBy(how = How.ID, using = "cmoreoptionlinks")
	WebElement moreOptionsLinks;
	
	@FindBy(how = How.NAME, using = "cdownpaymentunit")
	WebElement downPaymentDropdown;
	
	@FindBy(how = How.NAME, using = "cpropertytaxesunit")
	WebElement propertyTaxDropdown;
	
	@FindBy(how = How.NAME, using = "chomeinsunit")
	WebElement homeInsDropdown;
	
	@FindBy(how = How.NAME, using = "cpmiunit")
	WebElement pmiInsDropdown;
	
	@FindBy(how = How.NAME, using = "choaunit")
	WebElement hoaFeeDropdown;
	
	@FindBy(how = How.NAME, using = "cothercostunit")
	WebElement otherCostsDropdown;
	
	@FindBy(how = How.NAME, using = "cstartmonth")
	WebElement startDateDropdown;
	
	@FindBy(how = How.NAME, using = "cexmsm")
	WebElement extraMonthlyPayDropdown;
	
	@FindBy(how = How.NAME, using = "cexysm")
	WebElement extraYearlyPayDropdown;
	
	@FindBy(how = How.NAME, using = "cexosm")
	WebElement extraOneTimePayDropdown;
	
	public void setHousePrice(String str) {
		hPrice.sendKeys(str);
	}
	
	public void setDownPayment(String str) {
		dpay.sendKeys(str);
	}
	
	public void setLoanTerm(String str) {
		lTerm.sendKeys(str);
	}
	
	public void setInterestRate(String str) {
		irate.sendKeys(str);
	}
	
	public void setStartDate(String str) {
		sDate.sendKeys(str);
	}
	
	public void setPropertyTaxes(String str) {
		pTaxes.sendKeys(str);
	}
	public void setHomeInsurance(String str) {
		hIns.sendKeys(str);
	}
	
	public void setPmiInsurance(String str) {
		pmiIns.sendKeys(str);
	}
	
	public void setHoaFee(String str) {
		hoaFee.sendKeys(str);
	}
	
	public void setOtherCosts(String str) {
		oCosts.sendKeys(str);
	}
	
	public void setPropertyTaxIncrease(String str) {
		propTaxInc.sendKeys(str);
	}
	
	public void setHomeInsuranceIncrease(String str) {
		hInsInc.sendKeys(str);
	}
	
	public void setHoaFeeIncrease(String str) {
		hoaInc.sendKeys(str);
	}
	
	public void setOtherCostsIncrease(String str) {
		ocInc.sendKeys(str);
	}
	public void setExtraMonthlyPay(String str) {
		extraMonthlyPay.sendKeys(str);
	}
	
	public void setExtraYearlyPay(String str) {
		extraYearlyPay.sendKeys(str);
	}
	
	public void setExtraOneTimePay(String str) {
		extraOneTimePay.sendKeys(str);
	}
	
	public void setExtraMonthlyPayYear(String str) {
		extraMonthlyPayYear.sendKeys(str);
	}
	
	public void setExtraYearlyPayYear(String str) {
		extraYearlyPayYear.sendKeys(str);
	}
	
	public void setExtraOneTimePayYear(String str) {
		extraOneTimePayYear.sendKeys(str);
	}
	
	public void checkBoxIncludeOptionsBelow() {
		cbox1.click();
	}
	
	public void checkBoxShowBiweeklyPaybackResults() {
		cbox2.click();
	}
	
	public void clickCalculate() {
		calculateButton.click();
	}
	
	public void showMoreOptions() {
		moreOptionsLinks.click();
	}
	
	public void selectFromDownPaymentDropdown(String Str) {
		Select d1 = new Select(downPaymentDropdown);
		d1.selectByValue(Str);
	}
	
	public void selectFromPropertyTaxDropdown(String Str) {
		Select d2 = new Select(propertyTaxDropdown);
		d2.selectByValue(Str);
	}
	
	public void selectFromHomeInsuranceDropdown(String Str) {
		Select d3 = new Select(homeInsDropdown);
		d3.selectByValue(Str);
	}
	
	public void selectFromPmiInsuranceDropdown(String Str) {
		Select d4 = new Select(pmiInsDropdown);
		d4.selectByValue(Str);
	}
	
	public void selectFromHoaFeeDropdown(String Str) {
		Select d5 = new Select(hoaFeeDropdown);
		d5.selectByValue(Str);
	}
	
	public void selectFromOtherCostsDropdown(String Str) {
		Select d6 = new Select(otherCostsDropdown);
		d6.selectByValue(Str);
	}
	
	public void selectFromStartDateDropdown(String Str) {
		Select d7 = new Select(startDateDropdown);
		d7.selectByValue(Str);
	}
	
	public void selectFromExtraMonthlyPayDropdown(String Str) {
		Select d8 = new Select(extraMonthlyPayDropdown);
		d8.selectByValue(Str);
	}
	
	public void selectFromExtraYearlyPayDropdown(String Str) {
		Select d9 = new Select(extraYearlyPayDropdown);
		d9.selectByValue(Str);
	}
	
	public void selectFromExtraOneTimePayDropdown(String Str) {
		Select d10 = new Select(extraOneTimePayDropdown);
		d10.selectByValue(Str);
	}
}
