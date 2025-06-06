package TestClass;

import PageClass.LoginPage;
import config.Base;
import io.qameta.allure.Description;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Login extends Base {

    private LoginPage loginpage;

    @BeforeClass
    public void browserInvoke() {
        super.Setup();
        loginpage = new LoginPage(driver);
    }

    @AfterClass
    public void browserTearDown() {
        driver.close();
    }

    @Test
    @Description("Login to website.")
    public void login() {
        loginpage.ClickingSignUpLoginButton();
        loginpage.EnterUserName("alok@gmail.com");
        loginpage.EnterPassword("Alok@1234");
        loginpage.ClickOnLoginButton();
    }
}