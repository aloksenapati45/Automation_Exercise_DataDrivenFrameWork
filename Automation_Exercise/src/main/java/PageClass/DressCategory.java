package PageClass;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class DressCategory {

    WebDriver driver;
    WebDriverWait wait;

    public DressCategory(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
    }

    final By WomenButton = By.xpath("(//a[normalize-space()='Women'])[1]");
    final By DressButton = By.xpath("//div[@id='Women']//a[contains(text(),'Dress')]");
    final By VerifyWomenDressProduct = By.xpath("//h2[normalize-space()='Women - Dress Products']");
    final By MenButton = By.xpath("//a[normalize-space()='Men']");
    final By TshirtButton = By.xpath("//a[normalize-space()='Tshirts']");
    final By VerifyMenTshirtProduct = By.xpath("//h2[normalize-space()='Men - Tshirts Products']");
    final By ProductsButton = By.xpath("//a[@href='/products']");
    final By VerifyBrands = By.xpath("//div[@class=\"brands-name\"]/ul[@class=\"nav nav-pills nav-stacked\"]/li");
    final By PoloButton = By.xpath("//a[@href='/brand_products/Polo']");
    final By VerifyBrandPoloProduct = By.xpath("//h2[normalize-space()='Brand - Polo Products']");
    final By MadameButton = By.xpath("//a[@href='/brand_products/Madame']");
    final By VerifyBrandMadameProduct = By.xpath("//h2[normalize-space()='Brand - Madame Products']");


    @Step("Entering Women product.")
    public void ClickWomen(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(WomenButton));
        driver.findElement(WomenButton).click();
    }

    @Step("Entering Dress Button in product.")
    public void ClickDress(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(DressButton));
        driver.findElement(DressButton).click();
    }

    @Step("Verify all are displayed about Women dress related.")
    public void VerifyWomenDress(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(VerifyWomenDressProduct));
        String WomenDress = driver.findElement(VerifyWomenDressProduct).getText();
        System.out.println(WomenDress);
    }

    @Step("Entering Men product.")
    public void ClickMen(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(MenButton));
        driver.findElement(MenButton).click();
    }

    @Step("Entering Tshirt button in product.")
    public void ClickTshirt(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(TshirtButton));
        driver.findElement(TshirtButton).click();
    }

    @Step("Verify it is showing Men Tshirt related.")
    public void VerifyMenTshirt(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(VerifyMenTshirtProduct));
        String MenTshirt = driver.findElement(VerifyMenTshirtProduct).getText();
        System.out.println(MenTshirt);
    }

    @Step("Entering Product Button.")
    public void ClickProductButton(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(ProductsButton));
        driver.findElement(ProductsButton).click();
    }

    @Step("Verifying Brands in products.")
    public void VerifyAllBrands(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(VerifyBrands));
        List<WebElement> li  = driver.findElements(VerifyBrands).subList(0,7);
        for(WebElement element : li){
            System.out.println(element);
        }
    }

    @Step("Clicking on polo button.")
    public void ClickPolo(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(PoloButton));
        driver.findElement(PoloButton).click();
    }

    @Step("Verify POLO brand Product is showing.")
    public void VerifyPoloBrand(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(VerifyBrandPoloProduct));
        String PoloBrand = driver.findElement(VerifyBrandPoloProduct).getText();
        System.out.println(PoloBrand);
    }

    @Step("Clicking Madame Button")
    public void ClickingMadame(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(MadameButton));
        driver.findElement(MadameButton).click();
    }

    @Step("Verify MADAME ba=rand product is showing.")
    public void VerifyMadame(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(VerifyBrandMadameProduct));
        String Madame = driver.findElement(VerifyBrandMadameProduct).getText();
        System.out.println(Madame);
    }
}
