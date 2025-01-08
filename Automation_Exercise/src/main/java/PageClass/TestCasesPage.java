package PageClass;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TestCasesPage {
    WebDriver driver;
    WebDriverWait wait;

    public TestCasesPage(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
    }

    final By TestCasesButton = By.xpath("//a[normalize-space()='Test Cases']");
    final By VerifyTestCases = By.xpath("//b[normalize-space()='Test Cases']");

    @Step("Clicking Testcases Button.")
    public void ClickTestCases(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(TestCasesButton));
        driver.findElement(TestCasesButton).click();
    }

    @Step("Verifying TestCases page.")
    public void VerifyTestCases(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(VerifyTestCases));
        String TestCases = driver.findElement(VerifyTestCases).getText();
        if(TestCases.equalsIgnoreCase("Test Cases")){
            System.out.println(TestCases+" is properly showing.");
        }
    }
}
