package PageClass;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ContactUsForm {
    WebDriver driver;
    WebDriverWait wait;

    public ContactUsForm(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
    }

    final By ContactUsButton = By.xpath("//a[normalize-space()='Contact us']");
    final By NameField = By.xpath("//input[@placeholder='Name']");
    final By EmailField = By.xpath("//input[@placeholder='Email']");
    final By SubjectField = By.xpath("//input[@placeholder='Subject']");
    final By MessageField = By.xpath("//textarea[@id='message']");
    final By SubmitButton = By.xpath("//input[@name='submit']");
    final By VerifySuccessMessage = By.xpath("//div[@class='status alert alert-success']");
    final By HomeButton = By.xpath("//span[normalize-space()='Home']");
    final By VerifyHomePage = By.xpath("//a[normalize-space()='Home']");

    @Step("Clicking ContactUs Button")
    public void ClickContactUsButton(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(ContactUsButton));
        driver.findElement(ContactUsButton).click();
    }

    @Step("Entering Name Field")
    public void EnterName(String Name){
        wait.until(ExpectedConditions.visibilityOfElementLocated(NameField));
        driver.findElement(NameField).sendKeys(Name);
    }

    @Step("Entering Email Field.")
    public void EnterEmail(String Email){
        wait.until(ExpectedConditions.visibilityOfElementLocated(EmailField));
        driver.findElement(EmailField).sendKeys(Email);
    }

    @Step("Entering Subject Field.")
    public void EnterSubjectField(String Subject){
        wait.until(ExpectedConditions.visibilityOfElementLocated(SubjectField));
        driver.findElement(SubjectField).sendKeys(Subject);
    }

    @Step("Entering Message Field.")
    public void EnterMessageField(String Message){
        wait.until(ExpectedConditions.visibilityOfElementLocated(MessageField));
        driver.findElement(MessageField).sendKeys(Message);
    }

    @Step("Entering Submit Button and Clicking Alert ok Button.")
    public void ClickingSubmitAndAlertButton(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(SubmitButton));
        driver.findElement(SubmitButton).click();
        driver.switchTo().alert().accept();
    }

    @Step("Verifying Success message.")
    public void VerifySuccessMessage(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(VerifySuccessMessage));
        String SuccessMessage = driver.findElement(VerifySuccessMessage).getText();
        if(SuccessMessage.equalsIgnoreCase("Success! Your details have been submitted successfully.")){
            System.out.println(SuccessMessage+" is updated successfully.");
        }
    }

    @Step("Entering Home Button.")
    public void EnteringHomeButton(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(HomeButton));
        driver.findElement(HomeButton).click();
    }

    @Step("Verify Homepage.")
    public void VerifyHomePage(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(VerifyHomePage));
        String HomePage = driver.findElement(VerifyHomePage).getText();
        if(HomePage.equalsIgnoreCase(" Home")){
            System.out.println(HomePage+" is redirecting to homepage successfully.");
        }
    }
}
