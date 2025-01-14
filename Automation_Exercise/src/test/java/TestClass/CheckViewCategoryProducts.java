package TestClass;

import PageClass.DressCategory;
import config.Base;
import io.qameta.allure.Description;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CheckViewCategoryProducts extends Base {

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
    @Description("Check All category in dress item.")
    public void CheckCategory(){
        category.ClickWomen();
        category.ClickDress();
        category.VerifyWomenDress();
        category.ClickMen();
        category.ClickTshirt();
        category.VerifyMenTshirt();
    }
}