package TestClass;

import PageClass.CheckProduct;
import config.Base;
import io.qameta.allure.Description;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SearchProduct extends Base {
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
    @Description("Checking Search functionality.")
    public void CheckSearchProduct() {
        product.ClickProductButton();
        product.VerifyAllProduct();
        product.EnterSearchItem("Saree");
    }
}
