package TestClass;

import PageClass.CartPage;
import PageClass.CheckProduct;
import PageClass.RegisterUser;
import config.Base;
import io.qameta.allure.Description;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CheckPlaceOrderRegisterWhileCheckOut extends Base {

    CartPage page;
    CheckProduct product;
    RegisterUser user;

    @BeforeClass
    public void BrowserInvoke(){
        super.Setup();
        page = new CartPage(driver);
        product = new CheckProduct(driver);
        user = new RegisterUser(driver);
    }

    @AfterClass
    public void TearDown(){
        driver.close();
    }

    @Test
    @Description("Check Place order: Register while Checkout.")
    public void CheckPlaceOrder(){
        product.HoverFirstElement();
        product.ClickingAddCartButtonFirst();
        product.ClickingContinueShoppingButton();
        page.ClickCartButton();
        page.ClickProceedToCheckOutButton();
        page.ClickRegisterSignUpButton();
        user.EnterName("Alok");
        user.EnterEmail("alok12345@gmail.com");
        user.ClickSignUpButton();
        user.ClickTitle("Mr");
        user.EnteringPassword("Alok@1234");
        user.SelectDaysFromDropDown("19");
        user.SelectMonthsFromDropDown("December");
        user.SelectYearFromDropDown("2002");
        user.SelectCheckBoxOfNewsLetter();
        user.SelectCheckBoxOfOfferletter();
        user.EnterFirstName("Alok");
        user.EnterLastName("Senapati");
        user.EnteringCompanyName("Alok ltd .com");
        user.EnteringAddress1("Ameerpet");
        user.EnteringAddress2("Hyderabad");
        user.CheckCountryDropDownList("India");
        user.EnteringStateName("Telangana");
        user.EnteringCityName("Hyderabad");
        user.EnteringZipCode("900035");
        user.EnteringMobile("7205868256");
        user.ClickingCreateAccountButton();
        user.ClickingContinueButton();
        page.ClickCartButton();
        page.ClickProceedToCheckOutButton();
        page.EnteringMessage("It is for Testing only.");
        page.ClickingPlaceOrderButton();
        page.EnteringNameOnCard("Alok Senapati");
        page.EnteringCardNumber("123456789123");
        page.EnteringCVVNumber("225");
        page.EnteringMMField("02");
        page.EnteringYYYYField("2027");
        page.ClickingPayAndConfirmButton();
        page.VerifyConfirmationMessage();
        page.ClickingContinueButton();
        user.ClickingDeleteAccountButton();
        user.ClickingDeleteContinueButton();
    }
}
