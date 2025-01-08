package PageClass;

import io.qameta.allure.Allure;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class RegisterUser {
    WebDriver driver;
    WebDriverWait wait;

    public RegisterUser(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
    }

    final By SignUpLoginButton = By.xpath("//a[normalize-space()='Signup / Login']");
    final By NameField = By.xpath("//input[@placeholder='Name']");
    final By EmailField = By.xpath("//input[@data-qa='signup-email']");
    final By SignUpButton = By.xpath("//button[normalize-space()='Signup']");
    final By TitleMrButton = By.xpath("//input[@id='id_gender1']");
    final By TitleMrsButton = By.xpath("//input[@id='id_gender2']");
    final By PasswordField = By.xpath("//input[@id='password']");
    final By DaysDropDownList = By.xpath("//select[@id='days']");
    final By MonthDropDownList = By.xpath("//select[@id='months']");
    final By YearDropDownList = By.xpath("//select[@id='years']");
    final By NewsletterButton = By.xpath("//input[@id='newsletter']");
    final By SpecialOfferButton = By.xpath("//input[@id='optin']");
    final By FirstNameField = By.xpath("//input[@id='first_name']");
    final By LastNameField = By.xpath("//input[@id='last_name']");
    final By CompanyField = By.xpath("//input[@id='company']");
    final By Address1Field = By.xpath("//input[@id='address1']");
    final By Address2Field = By.xpath("//input[@id='address2']");
    final By CountryDropdownList = By.xpath("//select[@id='country']");
    final By StateField = By.xpath("//input[@id='state']");
    final By CityField = By.xpath("//input[@id='city']");
    final By ZipcodeField = By.xpath("//input[@id='zipcode']");
    final By MobileField = By.xpath("//input[@id='mobile_number']");
    final By CreateAccountButton = By.xpath("//button[normalize-space()='Create Account']");
    final By ContinueButton = By.xpath("//a[normalize-space()='Continue']");
    final By DeleteAccountButton = By.xpath("//a[normalize-space()='Delete Account']");
    final By DeleteContinueButton = By.xpath("//a[normalize-space()='Continue']");
    final By ErrorMessage = By.xpath("//p[normalize-space()='Email Address already exist!']");

    @Step("clicking Signup/Login Button")
    public void ClickingSignUpLoginButton(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(SignUpLoginButton));
        driver.findElement(SignUpLoginButton).click();
    }

    @Step("Entering Name.")
    public void EnterName(String Name) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(NameField));
        driver.findElement(NameField).sendKeys(Name);
    }

    @Step("Entering Email.")
    public void EnterEmail(String Email) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(EmailField));
        driver.findElement(EmailField).sendKeys(Email);
    }

    @Step("Clicking Signup Button.")
    public void ClickSignUpButton() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(SignUpButton));
        driver.findElement(SignUpButton).click();
    }

    @Step("Clicking the Title")
    public void ClickTitle(String Title) {
        if (Title.equalsIgnoreCase("Mr")) {
            wait.until(ExpectedConditions.visibilityOfElementLocated(TitleMrButton));
            driver.findElement(TitleMrButton).click();
        }
        if (Title.equalsIgnoreCase("Mrs")) {
            wait.until(ExpectedConditions.visibilityOfElementLocated(TitleMrsButton));
            driver.findElement(TitleMrsButton).click();
        }
    }

    @Step("Entering Password.")
    public void EnteringPassword(String Password) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(PasswordField));
        driver.findElement(PasswordField).sendKeys(Password);
    }

    @Step("Select Days From DropDownList.")
    public void SelectDaysFromDropDown(String Days) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(DaysDropDownList));
        Select days = new Select(driver.findElement(DaysDropDownList));
        days.selectByVisibleText(Days);
    }

    @Step("Select Month From DropDownList.")
    public void SelectMonthsFromDropDown(String Month) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(MonthDropDownList));
        Select Months = new Select(driver.findElement(MonthDropDownList));
        Months.selectByVisibleText(Month);
    }

    @Step("Select Year From DropDownList.")
    public void SelectYearFromDropDown(String Year) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(YearDropDownList));
        Select year = new Select(driver.findElement(YearDropDownList));
        year.selectByVisibleText(Year);
    }

    @Step("Clicking The NewsLetter Checkbox.")
    public void SelectCheckBoxOfNewsLetter() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(NewsletterButton));
        driver.findElement(NewsletterButton).click();
    }

    @Step("Clicking The Offerletter Chechbox.")
    public void SelectCheckBoxOfOfferletter() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(SpecialOfferButton));
        driver.findElement(SpecialOfferButton).click();
    }

    @Step("Entering FirstName")
    public void EnterFirstName(String FirstName) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(FirstNameField));
        driver.findElement(FirstNameField).sendKeys(FirstName);
    }

    @Step("Entering LastName")
    public void EnterLastName(String LastName) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(LastNameField));
        driver.findElement(LastNameField).sendKeys(LastName);
    }

    @Step("Entering Company Name")
    public void EnteringCompanyName(String CompanyName) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(CompanyField));
        driver.findElement(CompanyField).sendKeys(CompanyName);
    }

    @Step("Entering Address1")
    public void EnteringAddress1(String Address1Name) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(Address1Field));
        driver.findElement(Address1Field).sendKeys(Address1Name);
    }

    @Step("Entering Address2")
    public void EnteringAddress2(String Address2Name) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(Address2Field));
        driver.findElement(Address2Field).sendKeys(Address2Name);
    }

    @Step("Select Country DropDownList")
    public void CheckCountryDropDownList(String Country) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(CountryDropdownList));
        Select country = new Select(driver.findElement(CountryDropdownList));
        country.selectByVisibleText(Country);
    }

    @Step("Entering State")
    public void EnteringStateName(String State) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(StateField));
        driver.findElement(StateField).sendKeys(State);
    }

    @Step("Entering CityName.")
    public void EnteringCityName(String City) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(CityField));
        driver.findElement(CityField).sendKeys(City);
    }

    @Step("Entering ZipCode.")
    public void EnteringZipCode(String Zipcode) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(ZipcodeField));
        driver.findElement(ZipcodeField).sendKeys(Zipcode);
    }

    @Step("Entering Mobile")
    public void EnteringMobile(String Mobile) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(MobileField));
        driver.findElement(MobileField).sendKeys(Mobile);
    }

    @Step("Clicking CreateAccount Button")
    public void ClickingCreateAccountButton() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(CreateAccountButton));
        driver.findElement(CreateAccountButton).click();
    }

    @Step("Clicking Continue button")
    public void ClickingContinueButton() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(ContinueButton));
        driver.findElement(ContinueButton).click();
    }

    @Step("Clicking DeleteAccount Button")
    public void ClickingDeleteAccountButton() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(DeleteAccountButton));
        driver.findElement(DeleteAccountButton).click();
    }

    @Step("Clicking Continue Button")
    public void ClickingDeleteContinueButton() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(DeleteContinueButton));
        driver.findElement(DeleteContinueButton).click();
    }

    @Step("Verify Error Message.")
    public void VerifyErrorMessage(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(ErrorMessage));
        String GetErrorMessage = driver.findElement(ErrorMessage).getText();
        if(GetErrorMessage.equalsIgnoreCase("Email Address already exist!"))
        {
            Allure.epic("Error Message showing properly.");
        }
    }
}