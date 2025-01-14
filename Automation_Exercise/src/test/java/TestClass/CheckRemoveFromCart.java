package TestClass;

import PageClass.CartPage;
import PageClass.CheckProduct;
import config.Base;
import io.qameta.allure.Description;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CheckRemoveFromCart extends Base {

    CheckProduct product;
    CartPage page;

    @BeforeClass
    public void BrowserInvoke(){
        super.Setup();
        product = new CheckProduct(driver);
        page = new CartPage(driver);
    }

    @AfterClass
    public void TearDown(){
        driver.close();
    }

    @Test
    @Description("Checking Remove item from Cart.")
    public void CheckRemoveCart(){
        product.HoverFirstElement();
        product.ClickingAddCartButtonFirst();
        product.ClickingContinueShoppingButton();
        page.ClickCartButton();
        page.ClickRemoveButton();
        page.VerifyCartIsEmpty();
    }

}
