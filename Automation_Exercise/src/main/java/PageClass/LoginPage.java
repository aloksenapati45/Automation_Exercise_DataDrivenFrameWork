package PageClass;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {
    WebDriver driver;
    WebDriverWait wait;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
    }

    final By UserNameField = By.xpath("(//input[@data-qa='login-email'])[1]");
    final By PasswordField = By.xpath("(//input[@placeholder='Password'])[1]");
    final By LoginButton = By.xpath("//button[normalize-space()='Login']");
    final By ErrorMessage = By.xpath("//p[normalize-space()='Your email or password is incorrect!']");

    @Step("Entering UserName.")
    public void EnterUserName(String Username) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(UserNameField));
        driver.findElement(UserNameField).sendKeys(Username);
    }

    @Step("Entering Password.")
    public void EnterPassword(String Password) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(PasswordField));
        driver.findElement(PasswordField).sendKeys(Password);
    }

    @Step("Clicking on LoginButton.")
    public void ClickOnLoginButton() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(LoginButton));
        driver.findElement(LoginButton).click();
    }

    @Step("Verifying Error Message 'Your email or password is incorrect!'")
    public void VerifyErrorMessage(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(ErrorMessage));
        String ErrorMessageGet = driver.findElement(ErrorMessage).getText();
        if(ErrorMessageGet.equalsIgnoreCase("Your email or password is incorrect!"))
        {
            System.out.println(ErrorMessageGet+" showing properly.");
        }
    }
}