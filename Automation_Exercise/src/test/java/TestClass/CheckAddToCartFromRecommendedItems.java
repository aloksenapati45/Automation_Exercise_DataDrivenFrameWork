package TestClass;

import PageClass.CheckProduct;
import config.Base;
import io.qameta.allure.Description;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CheckAddToCartFromRecommendedItems extends Base {

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
    @Description("Checking Add to cart from Recommended items.")
    public void CheckAddToCartFromRecommendedItem(){
        product.ScrollUpToRecommendedItem();
        product.ClickAddToCartButtonOnFirstItem();
        product.ClickViewCart();
        product.VerifyRecommendedItem();
    }
}
