package TestClass;

import PageClass.CheckProduct;
import config.Base;
import io.qameta.allure.Description;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ProductAndProductDetails extends Base {

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
    @Description("Checking Product and Product Details.")
    public void CheckProductDetails(){
        product.ClickProductButton();
        product.VerifyAllProduct();
        product.ClickViewProduct();
        product.VerifyProductName();
        product.VerifyProductCategory();
        product.VerifyProductPrice();
        product.VerifyAvailability();
        product.VerifyCondition();
        product.VerifyBrand();
    }
}
