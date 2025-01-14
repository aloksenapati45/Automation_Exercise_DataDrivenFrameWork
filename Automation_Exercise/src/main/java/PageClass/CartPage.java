package PageClass;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CartPage {
    WebDriver driver;
    WebDriverWait wait;

    public CartPage(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
    }

    final By CartButton = By.xpath("//body[1]/header[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[3]/a[1]");
    final By ProceedToCheckOutButton = By.xpath("//a[normalize-space()='Proceed To Checkout']");
    final By RegisterSignUpButton = By.xpath("//u[normalize-space()='Register / Login']");
    final By CommentField = By.xpath("//textarea[@name='message']");
    final By PlaceOrderButton = By.xpath("//a[normalize-space()='Place Order']");
    final By NameOnCartField = By.xpath("//input[@name='name_on_card']");
    final By CardNumberField = By.xpath("//input[@name='card_number']");
    final By CVVNumberButton = By.xpath("//input[@placeholder='ex. 311']");
    final By ExpirationMMField = By.xpath("//input[@placeholder='MM']");
    final By ExpirationYYYYField = By.xpath("//input[@placeholder='YYYY']");
    final By PayAndConfirmButton = By.xpath("//button[@id='submit']");
    final By VerifyConfirmMessage = By.xpath("//p[normalize-space()='Congratulations! Your order has been confirmed!']");
    final By ContinueButton = By.xpath("//a[normalize-space()='Continue']");
    final By RemoveItemButton = By.xpath("(//a[@class='cart_quantity_delete'])[1]");
    final By VerifyCartEmpty = By.xpath("//b[normalize-space()='Cart is empty!']");


    @Step("Clicking Cart Button in Homepage.")
    public void ClickCartButton(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(CartButton));
        driver.findElement(CartButton).click();
    }

    @Step("Clicking Proceed to checkout button.")
    public void ClickProceedToCheckOutButton(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(ProceedToCheckOutButton));
        driver.findElement(ProceedToCheckOutButton).click();
    }

    @Step("Clicking Register/SignUp Button in cart page.")
    public void ClickRegisterSignUpButton(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(RegisterSignUpButton));
        driver.findElement(RegisterSignUpButton).click();
    }

    @Step("Entering some message in message box.")
    public void EnteringMessage(String Message){
        wait.until(ExpectedConditions.visibilityOfElementLocated(CommentField));
        driver.findElement(CommentField).sendKeys(Message);
    }

    @Step("Clicking Place Order Button.")
    public void ClickingPlaceOrderButton(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(PlaceOrderButton));
        driver.findElement(PlaceOrderButton).click();
    }

    @Step("Entering Name On Card Field.")
    public void EnteringNameOnCard(String Name){
        wait.until(ExpectedConditions.visibilityOfElementLocated(NameOnCartField));
        driver.findElement(NameOnCartField).sendKeys(Name);
    }

    @Step("Entering Card Number in Field.")
    public void EnteringCardNumber(String Number){
        wait.until(ExpectedConditions.visibilityOfElementLocated(CardNumberField));
        driver.findElement(CardNumberField).sendKeys(Number);
    }

    @Step("Entering CVV Number in Field.")
    public void EnteringCVVNumber(String CVVNum){
        wait.until(ExpectedConditions.visibilityOfElementLocated(CVVNumberButton));
        driver.findElement(CVVNumberButton).sendKeys(CVVNum);
    }

    @Step("Entering MM field.")
    public void EnteringMMField(String MM){
        wait.until(ExpectedConditions.visibilityOfElementLocated(ExpirationMMField));
        driver.findElement(ExpirationMMField).sendKeys(MM);
    }

    @Step("Entering YYYY field.")
    public void EnteringYYYYField(String YYYY){
        wait.until(ExpectedConditions.visibilityOfElementLocated(ExpirationYYYYField));
        driver.findElement(ExpirationYYYYField).sendKeys(YYYY);
    }

    @Step("Clicking Pay and confirm button.")
    public void ClickingPayAndConfirmButton(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(PayAndConfirmButton));
        driver.findElement(PayAndConfirmButton).click();
    }

    @Step("Verifying Confirmation message.")
    public void VerifyConfirmationMessage(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(VerifyConfirmMessage));
        String Message = driver.findElement(VerifyConfirmMessage).getText();
        System.out.println(Message);
    }

    @Step("Clicking Continue button.")
    public void ClickingContinueButton(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(ContinueButton));
        driver.findElement(ContinueButton).click();
    }

    @Step("Clicking Remove Button")
    public void ClickRemoveButton(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(RemoveItemButton));
        driver.findElement(RemoveItemButton).click();
    }

    @Step("Verify Cart is Empty.")
    public void VerifyCartIsEmpty(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(VerifyCartEmpty));
        String Message = driver.findElement(VerifyCartEmpty).getText();
        System.out.println(Message);
    }

}
