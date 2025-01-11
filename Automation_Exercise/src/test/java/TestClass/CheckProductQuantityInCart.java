package TestClass;

import PageClass.CheckProduct;
import config.Base;
import io.qameta.allure.Description;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CheckProductQuantityInCart extends Base {
    CheckProduct product;

    @BeforeClass
    public void BrowserInvoke() {
        super.Setup();
        product = new CheckProduct(driver);
    }

    @AfterClass
    public void TearDown() {
        driver.close();
    }

    @Test
    @Description("Checking The Quantity of a product Added in cart.")
    public void CheckQuantity() {
        product.ClickViewProduct();
        product.SetQuantityField("4");
        product.ClickAddToCart();
        product.ClickViewCart();
        product.VerifyQuantity();
    }
}