package PageClass;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CheckProduct {
    WebDriver driver;
    WebDriverWait wait;

    public CheckProduct(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
    }

    final By ProductsButton = By.xpath("//a[@href='/products']");
    final By VerifyAllProduct = By.xpath("//h2[normalize-space()='All Products']");
    final By ViewProductButton = By.xpath("(//a[contains(text(),'View Product')])[1]");
    final By VerifyProductName = By.xpath("//h2[normalize-space()='Blue Top']");
    final By VerifyProductCategory = By.xpath("//p[normalize-space()='Category: Women > Tops']");
    final By VerifyProductPrice = By.xpath("//span[normalize-space()='Rs. 500']");
    final By VerifyAvailability = By.xpath("//div[@class=\"product-details\"]/div[2]/div[1]/p[2]");
    final By VerifyCondition = By.xpath("//div[@class=\"product-details\"]/div[2]/div[1]/p[3]");
    final By VerifyBrand = By.xpath("//div[@class=\"product-details\"]/div[2]/div[1]/p[4]");
    final By SearchProductField = By.xpath("//input[@id='search_product']");
    final By SearchButton = By.xpath("//button[@id='submit_search']");
    final By VerifyDressItem = By.xpath("//div[@class=\"features_items\"]/div[2]/div[1]/div[1]/div[1]/p");
    final By VerifyTopItem = By.xpath("//div[@class=\"features_items\"]/div[2]/div[1]/div[1]/div[1]/p");
    final By VerifySareeItem = By.xpath("//div[@class=\"features_items\"]/div[2]/div[1]/div[1]/div[1]/p");
    final By VerifyTshirtItem = By.xpath("//div[@class=\"features_items\"]/div[2]/div[1]/div[1]/div[1]/p");
    final By VerifyJeansItem = By.xpath("//div[@class=\"features_items\"]/div[2]/div[1]/div[1]/div[1]/p");

    @Step("Clicking Product Button.")
    public void ClickProductButton(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(ProductsButton));
        driver.findElement(ProductsButton).click();
    }

    @Step("Verifying All Product Showing.")
    public void VerifyAllProduct(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(VerifyAllProduct));
        String AllProduct = driver.findElement(VerifyAllProduct).getText();
        if(AllProduct.equalsIgnoreCase("all products")){
            System.out.println("It is showing All Products.");
        }
    }

    @Step("Click on view product Button.")
    public void ClickViewProduct(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(ViewProductButton));
        driver.findElement(ViewProductButton).click();
    }

    @Step("Verifying Product Name.")
    public void VerifyProductName(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(VerifyProductName));
        String ProductName = driver.findElement(VerifyProductName).getText();
        if(ProductName.contains("Blue Top")){
            System.out.println("It is showing Product Name"+ProductName);
        }
    }

    @Step("Verifying Product Category.")
    public void VerifyProductCategory(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(VerifyProductCategory));
        String ProductCategory = driver.findElement(VerifyProductCategory).getText();
        if(ProductCategory.contains("Women > Tops")){
            System.out.println("It is showing Product Category"+ProductCategory);
        }
    }

    @Step("Verifying Product Price.")
    public void VerifyProductPrice(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(VerifyProductPrice));
        String ProductPrice = driver.findElement(VerifyProductPrice).getText();
        if(ProductPrice.contains("Rs. 500")){
            System.out.println("It is showing Product price"+ProductPrice);
        }
    }

    @Step("Verifying Product Availability.")
    public void VerifyAvailability(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(VerifyAvailability));
        String ProductAvailability = driver.findElement(VerifyAvailability).getText();
        if(ProductAvailability.contains(" In Stock")){
            System.out.println("It is showing Product Availability"+ProductAvailability);
        }
    }

    @Step("Verifying Product Condition.")
    public void VerifyCondition(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(VerifyCondition));
        String ProductCondition = driver.findElement(VerifyCondition).getText();
        if(ProductCondition.contains("New")){
            System.out.println("It is showing Product Condition"+ProductCondition);
        }
    }

    @Step("Verifying Product Brand.")
    public void VerifyBrand(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(VerifyBrand));
        String ProductBrand = driver.findElement(VerifyBrand).getText();
        if(ProductBrand.contains("Polo")){
            System.out.println("It is showing Product Name"+ProductBrand);
        }
    }

    @Step("Entering Item into Search Field.")
    public void EnterSearchItem(String Item){
        wait.until(ExpectedConditions.visibilityOfElementLocated(SearchProductField));
        driver.findElement(SearchProductField).sendKeys(Item);
        wait.until(ExpectedConditions.visibilityOfElementLocated(SearchButton));
        driver.findElement(SearchButton).click();
        if(Item.equalsIgnoreCase("Dress")){
            wait.until(ExpectedConditions.visibilityOfElementLocated(VerifyDressItem));
            String Dress = driver.findElement(VerifyDressItem).getText();
            if(Dress.contains("Dress")){
                System.out.println("This is showing Dress Item.");
            }
        }
        if(Item.equalsIgnoreCase("Tops")){
            wait.until(ExpectedConditions.visibilityOfElementLocated(VerifyTopItem));
            String Top = driver.findElement(VerifyTopItem).getText();
            if(Top.contains("Top")){
                System.out.println("This is showing Top Items.");
            }
        }
        if(Item.equalsIgnoreCase("Saree")){
            wait.until(ExpectedConditions.visibilityOfElementLocated(VerifySareeItem));
            String Top = driver.findElement(VerifySareeItem).getText();
            if(Top.contains("Saree")){
                System.out.println("This is showing SAREE Items.");
            }
        }
        if(Item.equalsIgnoreCase("Tshirt")){
            wait.until(ExpectedConditions.visibilityOfElementLocated(VerifyTshirtItem));
            String Top = driver.findElement(VerifyTshirtItem).getText();
            if(Top.contains("Tshirt")){
                System.out.println("This is showing Tshirt Items.");
            }
        }
        if(Item.equalsIgnoreCase("Jeans")){
            wait.until(ExpectedConditions.visibilityOfElementLocated(VerifyJeansItem));
            String Top = driver.findElement(VerifyJeansItem).getText();
            if(Top.contains("Jeans")){
                System.out.println("This is showing Jeans Items.");
            }
        }
    }
}