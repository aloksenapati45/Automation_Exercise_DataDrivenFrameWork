package PageClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegisterUser {
    WebDriver driver;
    WebDriverWait wait;
    public RegisterUser(WebDriver driver)
    {
        this.driver = driver;
    }
    final By NameField = By.xpath("//input[@placeholder='Name']");
    final By EmailField = By.xpath("//input[@data-qa='signup-email']");
    final By SignUpButton = By.xpath("//button[normalize-space()='Signup']");
    final By TitleMrButton  = By.xpath("//input[@id='id_gender1']");
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
    final By ZipcodeFirld = By.xpath("//input[@id='zipcode']");
    final By MobileField = By.xpath("//input[@id='mobile_number']");
    final By CreateAccountField = By.xpath("//button[normalize-space()='Create Account']");
    final By ContinueButton = By.xpath("//a[normalize-space()='Continue']");

}
