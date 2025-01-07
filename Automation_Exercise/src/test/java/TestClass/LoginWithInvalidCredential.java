package TestClass;

import PageClass.LoginPage;
import config.Base;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginWithInvalidCredential extends Base {
    LoginPage page;
    @BeforeClass
    public void BrowserInvoke(){
        super.Setup();
        page = new LoginPage(driver);
    }
    @AfterClass
    public void TearDown(){
        driver.close();
    }
    @Test(description = "Login with invalid credentials.")
    public void loginWithInvalidCredentials(){
        page.EnterUserName("abc@gmail.com");
        page.EnterPassword("ABC");
        page.ClickOnLoginButton();
        page.VerifyErrorMessage();
    }
}
