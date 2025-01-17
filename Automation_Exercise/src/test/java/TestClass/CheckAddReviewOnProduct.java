package TestClass;

import PageClass.CheckProduct;
import config.Base;
import io.qameta.allure.Description;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CheckAddReviewOnProduct extends Base {

    CheckProduct product;

    @BeforeClass
    public void BrowserInvoke(){
        super.Setup();
        product = new CheckProduct(driver);
    }

    @AfterClass
    public void TearDown(){
        driver.close();
    }

    @Test
    @Description("Check Add review on product.")
    public void CheckReview(){
        product.ClickProductButton();
        product.ClickViewProduct();
        product.NameField("Alok");
        product.EmailField("alok@gmail.com");
        product.ReviewField("This item is Good.");
        product.ClickSubmitButton();
    }
}
