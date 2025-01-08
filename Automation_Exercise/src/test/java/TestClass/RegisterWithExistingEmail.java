package TestClass;

import PageClass.RegisterUser;
import config.Base;
import io.qameta.allure.Description;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class RegisterWithExistingEmail extends Base {
    RegisterUser user;

    @BeforeClass
    public void BrowserInvoke(){
        super.Setup();
        user = new RegisterUser(driver);
    }

    @AfterClass
    public void TearDown(){
        driver.close();
    }

    @Test
    @Description("Register with Existing name and Email")
    public void RegisterWithExistInputs(){
        user.ClickingSignUpLoginButton();
        user.EnterName("Alok");
        user.EnterEmail("alok@gmail.com");
        user.ClickSignUpButton();
        user.VerifyErrorMessage();
    }
}
