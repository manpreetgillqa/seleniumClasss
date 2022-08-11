package BOOT_Cal;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class PO_HomePage {
	
	WebDriver driver;
	
	public PO_HomePage(WebDriver driver) {
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}
	@FindBy(how = How.CSS, using = "a[href='/']")
	WebElement logo;
	
	@FindBy(how = How.ID, using = "calcSearchTerm")
	WebElement searchBar;
	
	@FindBy(how = How.CSS, using = "a[href=\"/sitemap.html\"]")
	WebElement allCalculatorsButton;
	
	@FindBy(how = How.LINK_TEXT, using = "Financial Calculators")
	WebElement fCalculators;
	
	@FindBy(how = How.LINK_TEXT, using = "Fitness & Health Calculators")
	WebElement fhCalculators;
	
	@FindBy(how = How.LINK_TEXT, using = "Math Calculators")
	WebElement mCalculators;
	
	@FindBy(how = How.LINK_TEXT, using = "Other Calculators")
	WebElement oCalculators;
	
	@FindBy(how = How.LINK_TEXT, using = "Mortgage Calculator")
	WebElement mortCalculator;
	
	@FindBy(how = How.LINK_TEXT, using = "Loan Calculator")
	WebElement lCalculator;
	
	@FindBy(how = How.LINK_TEXT, using = "Auto Loan Calculator")
	WebElement alCalculator;
	
	@FindBy(how = How.LINK_TEXT, using = "Interest Calculator")
	WebElement iCalculator;
	
	@FindBy(how = How.LINK_TEXT, using = "Payment Calculator")
	WebElement pCalculator;
	
	@FindBy(how = How.LINK_TEXT, using = "Retirement Calculator")
	WebElement rCalculator;
	
	@FindBy(how = How.LINK_TEXT, using = "Amortization Calculator")
	WebElement aCalculator;
	
	@FindBy(how = How.LINK_TEXT, using = "Investment Calculator")
	WebElement invCalculator;
	
	@FindBy(how = How.LINK_TEXT, using = "Inflation Calculator")
	WebElement infCalculator;
	
	@FindBy(how = How.LINK_TEXT, using = "Finance Calculator")
	WebElement finCalculator;
	
	@FindBy(how = How.LINK_TEXT, using = "Income Tax Calculator")
	WebElement itCalculator;
	
	@FindBy(how = How.LINK_TEXT, using = "Compound Interest Calculator")
	WebElement ciCalculator;
	
	@FindBy(how = How.LINK_TEXT, using = "Salary Calculator")
	WebElement salCalculator;
	
	@FindBy(how = How.LINK_TEXT, using = "Interest Rate Calculator")
	WebElement intRCalculator;
	
	@FindBy(how = How.LINK_TEXT, using = "Sales Tax Calculator")
	WebElement sTaxCalculator;
	
	@FindBy(how = How.LINK_TEXT, using = "BMI Calculator")
	WebElement bmiCalculator;
	
	@FindBy(how = How.LINK_TEXT, using = "Calorie Calculator")
	WebElement calCalculator;
	
	@FindBy(how = How.LINK_TEXT, using = "Body Fat Calculator")
	WebElement bFatCalculator;
	
	@FindBy(how = How.LINK_TEXT, using = "BMR Calculator")
	WebElement bmrCalculator;
	
	@FindBy(how = How.LINK_TEXT, using = "Ideal Weight Calculator")
	WebElement idwCalculator;
	
	@FindBy(how = How.LINK_TEXT, using = "Pace Calculator")
	WebElement pacCalculator;
	
	@FindBy(how = How.LINK_TEXT, using = "Pregnancy Calculator")
	WebElement pregCalculator;
	
	@FindBy(how = How.LINK_TEXT, using = "Pregnancy Conception Calculator")
	WebElement pConCalculator;
	
	@FindBy(how = How.LINK_TEXT, using = "Due Date Calculator")
	WebElement dDateCalculator;
	
	@FindBy(how = How.LINK_TEXT, using = "Scientific Calculator")
	WebElement sciCalculator;
	
	@FindBy(how = How.LINK_TEXT, using = "Fraction Calculator")
	WebElement fracCalculator;
	
	@FindBy(how = How.LINK_TEXT, using = "Percentage Calculator")
	WebElement percCalculator;
	
	@FindBy(how = How.LINK_TEXT, using = "Random Number Generator")
	WebElement rNumGen;
	
	@FindBy(how = How.LINK_TEXT, using = "Triangle Calculator")
	WebElement triCalculator;
	
	@FindBy(how = How.LINK_TEXT, using = "Standard Deviation Calculator")
	WebElement sDevCalculator;
	
	@FindBy(how = How.LINK_TEXT, using = "Age Calculator")
	WebElement ageCalculator;
	
	@FindBy(how = How.LINK_TEXT, using = "Date Calculator")
	WebElement dateCalculator;
	
	@FindBy(how = How.LINK_TEXT, using = "Time Calculator")
	WebElement timeCalculator;
	
	@FindBy(how = How.LINK_TEXT, using = "Hours Calculator")
	WebElement hoursCalculator;
	
	@FindBy(how = How.LINK_TEXT, using = "GPA Calculator")
	WebElement gpaCalculator;
	
	@FindBy(how = How.LINK_TEXT, using = "Grade Calculator")
	WebElement gradeCalculator;
	
	@FindBy(how = How.LINK_TEXT, using = "Concrete Calculator")
	WebElement concCalculator;
	
	@FindBy(how = How.LINK_TEXT, using = "Subnet Calculator")
	WebElement subCalculator;
	
	@FindBy(how = How.LINK_TEXT, using = "Password Generator")
	WebElement pwordGen;
	
	@FindBy(how = How.LINK_TEXT, using = "Conversion Calculator")
	WebElement converCalculator;
	
	@FindBy(how = How.ID, using = "calcSearchOut")
	WebElement searchResultField;
	
	public void verifyPageTitle(String str) {
		String title = driver.getTitle();
		Assert.assertEquals(title,str);
	}
	
	public void displayResultsFromSearchField() {
		System.out.println(searchResultField.getText());
	}
	
	
	public void getUrl(String url) {
		driver.get(url);
	}
	
	public void clickLogo() {
		logo.click();
	}
	
	public void setSearch(String str) {
	searchBar.sendKeys(str);
	}
	
	public void clickAllCalculators() {
		allCalculatorsButton.click();
	}
	
	public void clickFinancialCalculators() {
		fCalculators.click();
	}
		
	public void clickHealthAndFitnessCalculators() {
		fhCalculators.click();
	}
	
	public void clickMathCalculators() {
		mCalculators.click();
	}
		
	public void clickOtherCalculators() {
		oCalculators.click();
	}
	
	public void clickMortgageCalculator() {
		mortCalculator.click();
	}
		
	public void clickLoanCalculator() {
		lCalculator.click();
	}
	
	public void clickAutoLoanCalculator() {
		alCalculator.click();
	}
		
	public void clickInterestCalculator() {
		iCalculator.click();
	}
	
	public void clickPaymentCalculator() {
		pCalculator.click();
	}
		
	public void clickRetirementCalculator() {
		rCalculator.click();
	}
	
	public void clickAmortizationCalculator() {
		aCalculator.click();
	}
		
	public void clickInvestmentCalculator() {
		invCalculator.click();
	}
	
	public void clickInflationCalculator() {
		infCalculator.click();
	}
		
	public void clickFinanceCalculator() {
		finCalculator.click();
	}
	
	public void clickIncomeTaxCalculator() {
		itCalculator.click();
	}
		
	public void clickCompoundInterestCalculator() {
		ciCalculator.click();
	}
	
	public void clickSalaryCalculator() {
		salCalculator.click();
	}
		
	public void clickInterestRateCalculator() {
		intRCalculator.click();
	}
	
	public void clickSalesTaxCalculator() {
		sTaxCalculator.click();
	}
		
	public void clickBMICalculator() {
		bmiCalculator.click();
	}
	
	public void clickCalorieCalculator() {
		calCalculator.click();
	}
		
	public void clickBodyFatCalculator() {
		bFatCalculator.click();
	}
	
	public void clickBMRCalculator() {
		bmrCalculator.click();
	}
		
	public void clickIdealWeightCalculator() {
		idwCalculator.click();
	}
	
	public void clickPaceCalculator() {
		pacCalculator.click();
	}
		
	public void clickPregnancyCalculator() {
		pregCalculator.click();
	}
	
	public void clickPregnancyConceptionCalculator() {
		pConCalculator.click();
	}
		
	public void clickDueDateCalculator() {
		dDateCalculator.click();
	}
	
	public void clickScientificCalculator() {
		sciCalculator.click();
	}
		
	public void clickFractionCalculator() {
		fracCalculator.click();
	}
	
	public void clickPercentageCalculator() {
		percCalculator.click();
	}
		
	public void clickRandomNumberGenerator() {
		rNumGen.click();
	}
	
	public void clickTriangleCalculator() {
		triCalculator.click();
	}
		
	public void clickStandardDeviationCalculator() {
		sDevCalculator.click();
	}
	
	public void clickAgeCalculator() {
		ageCalculator.click();
	}
		
	public void clickDateCalculator() {
		dateCalculator.click();
	}
	
	public void clickTimeCalculator() {
		timeCalculator.click();
	}
	
	public void clickHoursCalculator() {
		hoursCalculator.click();
	}
		
	public void clickGPACalculator() {
		gpaCalculator.click();
	}
	
	public void clickGradeCalculator() {
		gradeCalculator.click();
	}
		
	public void clickConcreteCalculator() {
		concCalculator.click();
	}
	
	public void clickSubnetCalculator() {
		subCalculator.click();
	}
		
	public void clickPasswordGenerator() {
		pwordGen.click();
	}
	
	public void clickConversationCalculator() {
		converCalculator.click();
	}

}