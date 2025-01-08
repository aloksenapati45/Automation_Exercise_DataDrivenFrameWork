package TestClass;

import PageClass.ContactUsForm;
import config.Base;
import io.qameta.allure.Description;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ContactUsFormFill extends Base {

    ContactUsForm contact;
    @BeforeClass
    public void BrowserInvoke(){
        super.Setup();
        contact = new ContactUsForm(driver);
    }

    @AfterClass
    public void TearDown(){
        driver.close();
    }

    @Test
    @Description("Check ContactUs of the application.")
    public void ContactUsCheck(){
        contact.ClickContactUsButton();
        contact.EnterName("Alok Senapati");
        contact.EnterEmail("alok123@gmail.com");
        contact.EnterSubjectField("Applying the job");
        contact.EnterMessageField("This is for automation testing purpose only.");
        contact.ClickingSubmitAndAlertButton();
        contact.VerifySuccessMessage();
        contact.EnteringHomeButton();
        contact.VerifyHomePage();
    }
}
