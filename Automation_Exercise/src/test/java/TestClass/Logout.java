package TestClass;

import PageClass.LoginPage;
import config.Base;
import io.qameta.allure.Description;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Logout extends Base {
    LoginPage page;

    @BeforeClass
    public void BrowserInvoke() {
        super.Setup();
        page = new LoginPage(driver);
    }

    @AfterClass
    public void TearDown() {
        driver.close();
    }

    @Test
    @Description("Logout to the application test")
    public void Logout() {
        page.ClickingSignUpLoginButton();
        page.EnterUserName("alok@gmail.com");
        page.EnterPassword("Alok@1234");
        page.ClickOnLoginButton();
        page.ClickLogoutButton();
    }
}
