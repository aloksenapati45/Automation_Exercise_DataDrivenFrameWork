package TestClass;

import PageClass.CartPage;
import PageClass.CheckProduct;
import PageClass.LoginPage;
import PageClass.RegisterUser;
import config.Base;
import io.qameta.allure.Description;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CheckPlaceOrderLoginBeforeCheckout extends Base {
    CartPage page;
    CheckProduct product;
    LoginPage user;
    RegisterUser userReg;

    @BeforeClass
    public void BrowserInvoke(){
        super.Setup();
        userReg = new RegisterUser(driver);
        page = new CartPage(driver);
        product = new CheckProduct(driver);
        user = new LoginPage(driver);
    }

    @AfterClass
    public void TearDown(){
        driver.close();
    }

    @Test
    @Description("Check Place order: Register while Checkout.")
    public void CheckPlaceOrder(){
        user.ClickingSignUpLoginButton();
        user.EnterUserName("alok123456@gmail.com");
        user.EnterPassword("Alok@1234");
        user.ClickOnLoginButton();
        product.HoverFirstElement();
        product.ClickingAddCartButtonFirst();
        product.ClickingContinueShoppingButton();
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
        userReg.ClickingDeleteAccountButton();
        userReg.ClickingDeleteContinueButton();
    }
}
