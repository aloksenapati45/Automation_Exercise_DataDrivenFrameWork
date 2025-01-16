package TestClass;

import PageClass.CartPage;
import PageClass.CheckProduct;
import PageClass.LoginPage;
import config.Base;
import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CheckSearchProductsAndVerifyCartAfterLogin extends Base {

    CheckProduct product;
    CartPage page;
    LoginPage login;

    @BeforeClass
    public void BrowserInvoke() {
        super.Setup();
        product = new CheckProduct(driver);
        page = new CartPage(driver);
        login = new LoginPage(driver);
    }

    @AfterClass
    public void TearDown() {
        driver.close();
    }

    @Test
    @Description("Checking Search product and Verifying after login cart items are displayed or not.")
    public void CheckSearchProduct() throws InterruptedException {
        product.ClickProductButton();
        product.VerifyAllProduct();
        product.EnterSearchItem("Saree");
        product.HoverFirstSareeAndAddCart();
        Thread.sleep(4000);
        product.ClickingContinueShoppingButton();
        product.HoverSecondSareeAndAddCart();
        Thread.sleep(4000);
        product.ClickingContinueShoppingButton();
        product.HoverThirdSareeAndAddCart();
        Thread.sleep(4000);
        product.ClickingContinueShoppingButton();
        page.ClickCartButton();
        String FirstItem = driver.findElement(By.xpath("//a[normalize-space()='Cotton Silk Hand Block Print Saree']")).getText();
        System.out.println("First Item name : " + FirstItem);
        String SecondItem = driver.findElement(By.xpath("//a[normalize-space()='Beautiful Peacock Blue Cotton Linen Saree']")).getText();
        System.out.println("Second Item : " + SecondItem);
        String ThirdItem = driver.findElement(By.xpath("//a[normalize-space()='Rust Red Linen Saree']")).getText();
        System.out.println("Third Item : " + ThirdItem);
        login.ClickingSignUpLoginButton();
        login.EnterUserName("alok@gmail.com");
        login.EnterPassword("Alok@1234");
        login.ClickOnLoginButton();
        page.ClickCartButton();
        if (driver.findElement(By.xpath("//a[normalize-space()='Proceed To Checkout']")).isDisplayed()) {
            String FirstItems = driver.findElement(By.xpath("//a[normalize-space()='Cotton Silk Hand Block Print Saree']")).getText();
            System.out.println("First Item name : " + FirstItems);
            String SecondItems = driver.findElement(By.xpath("//a[normalize-space()='Beautiful Peacock Blue Cotton Linen Saree']")).getText();
            System.out.println("Second Item : " + SecondItems);
            String ThirdItems = driver.findElement(By.xpath("//a[normalize-space()='Rust Red Linen Saree']")).getText();
            System.out.println("Third Item : " + ThirdItems);
        } else
            System.out.println("Those items are not displayed.");

    }
}
