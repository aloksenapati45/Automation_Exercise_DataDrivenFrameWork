package TestClass;

import PageClass.VerifySubscriptionInHomepage;
import config.Base;
import io.qameta.allure.Description;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CheckSubscriptionInCart extends Base {
    VerifySubscriptionInHomepage sub;

    @BeforeClass
    public void BrowserInvoke(){
        super.Setup();
        sub = new VerifySubscriptionInHomepage(driver);
    }

    @AfterClass
    public void TearDown(){
        driver.close();
    }

    @Test
    @Description("Checking Subscription in Cart.")
    public void CheckSubscriptionCart(){
        sub.ClickingCartButton();
        sub.ScrollToFooter();
        sub.VerifySubscriptionText();
        sub.EnteringEmail("alok@gmail.com");
        sub.ClickingArrowButton();
    }
}
