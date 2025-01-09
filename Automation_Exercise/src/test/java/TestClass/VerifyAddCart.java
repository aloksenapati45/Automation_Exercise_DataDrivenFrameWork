package TestClass;

import PageClass.CheckProduct;
import config.Base;
import io.qameta.allure.Description;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class VerifyAddCart extends Base {
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
    @Description("Checking Add Cart Functionality")
    public void CheckAddCart(){
        product.ClickProductButton();
        product.HoverFirstElement();
        product.HoverFirstElement();
        product.ClickingAddCartButtonFirst();
        product.ClickingContinueShoppingButton();
        product.HoverSecondElement();
        product.ClickingAddCartButtonSecond();
        product.ClickingViewCartButton();
        product.VerifyFirstProduct();
        product.VerifySecondProduct();
        product.VerifyFirstProductPrice();
        product.VerifyFirstProductQuantity();
        product.VerifyFirstProductTotalPrice();
        product.VerifySecondProductPrice();
        product.VerifySecondProductQuantity();
        product.VerifySecondProductTotalPrice();
    }
}
