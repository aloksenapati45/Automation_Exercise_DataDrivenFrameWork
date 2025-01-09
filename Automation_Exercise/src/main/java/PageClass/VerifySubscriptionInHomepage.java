package PageClass;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class VerifySubscriptionInHomepage {
    WebDriver driver;
    WebDriverWait wait;

    public VerifySubscriptionInHomepage(WebDriver driver)
    {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
    }

    final By SubscriptionTest = By.xpath("//h2[normalize-space()='Subscription']");
    final By SubscriptionEmailField = By.xpath("//input[@id='susbscribe_email']");
    final By ArrowButton = By.xpath("//button[@id='subscribe']");
    final By CartButton = By.xpath("//a[normalize-space()='Cart']");

    @Step("Scrolling to footer.")
    public void ScrollToFooter(){
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(" + 0 + "," + 10000 + ");");
    }

    @Step("Clicking cart button.")
    public void ClickingCartButton(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(CartButton));
        driver.findElement(CartButton).click();
    }

    @Step("Verifying Subscription Test.")
    public void VerifySubscriptionText(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(SubscriptionTest));
        String Subscription = driver.findElement(SubscriptionTest).getText();
        if(Subscription.equalsIgnoreCase("Subscription")){
            System.out.println("It is showing Subscription Text.");
        }
    }

    @Step("Entering Email to Email Field.")
    public void EnteringEmail(String Email){
        wait.until(ExpectedConditions.visibilityOfElementLocated(SubscriptionEmailField));
        driver.findElement(SubscriptionEmailField).sendKeys(Email);
    }

    @Step("Clicking Arrow button.")
    public void ClickingArrowButton(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(ArrowButton));
        driver.findElement(ArrowButton).click();
    }
}
