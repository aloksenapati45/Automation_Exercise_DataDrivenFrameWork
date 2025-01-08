package TestClass;

import PageClass.RegisterUser;
import config.Base;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Register extends Base {
    private RegisterUser register;

    @BeforeClass
    public void BrowserInvoke(){
        super.Setup();
        register = new RegisterUser(driver);
    }

    @AfterClass
    public void TearDown(){
        driver.close();
    }

    @Test(description = "User Registration to the Application.")
    public void register(){
        register.ClickingSignUpLoginButton();
        register.EnterName("Alok");
        register.EnterEmail("alok12@gmail.com");
        register.ClickSignUpButton();
        register.ClickTitle("Mr");
        register.EnteringPassword("Alok@1234");
        register.SelectDaysFromDropDown("19");
        register.SelectMonthsFromDropDown("December");
        register.SelectYearFromDropDown("2002");
        register.SelectCheckBoxOfNewsLetter();
        register.SelectCheckBoxOfOfferletter();
        register.EnterFirstName("Alok");
        register.EnterLastName("Senapati");
        register.EnteringCompanyName("alokcorp.ltd.");
        register.EnteringAddress1("Ameerpet");
        register.EnteringAddress2("Hyderabad");
        register.CheckCountryDropDownList("India");
        register.EnteringStateName("Telangana");
        register.EnteringCityName("Hyderabad");
        register.EnteringZipCode("300058");
        register.EnteringMobile("2352369856");
        register.ClickingCreateAccountButton();
        register.ClickingContinueButton();
        register.ClickingDeleteAccountButton();
        register.ClickingDeleteContinueButton();
    }
}
