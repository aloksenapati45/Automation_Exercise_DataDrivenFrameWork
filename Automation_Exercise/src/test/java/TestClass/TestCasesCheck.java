package TestClass;

import PageClass.TestCasesPage;
import config.Base;
import io.qameta.allure.Description;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestCasesCheck extends Base {

    TestCasesPage page;
    @BeforeClass
    public void BrowserInvoke(){
        super.Setup();
        page = new TestCasesPage(driver);
    }

    @AfterClass
    public void TearDown(){
        driver.close();
    }

    @Test
    @Description("Check TestCase Functionality working properly.")
    public void CheckTestCases(){
       page.ClickTestCases();
       page.VerifyTestCases();
    }
}
