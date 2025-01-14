package TestClass;

import PageClass.DressCategory;
import config.Base;
import io.qameta.allure.Description;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CheckViewCartBrandProducts extends Base {

    DressCategory category;

    @BeforeClass
    public void BrowserInvoke(){
        super.Setup();
        category = new DressCategory(driver);
    }

    @AfterClass
    public void TearDown(){
        driver.close();
    }

    @Test
    @Description("Checking View Cart Brand Products.")
    public void CheckBrand(){
        category.ClickProductButton();
        category.VerifyAllBrands();
        category.ClickPolo();
        category.VerifyPoloBrand();
        category.ClickingMadame();
        category.VerifyMadame();
    }
}
