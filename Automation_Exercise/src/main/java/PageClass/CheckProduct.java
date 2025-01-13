package PageClass;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CheckProduct {
    WebDriver driver;
    WebDriverWait wait;
    Actions act;

    public CheckProduct(WebDriver driver) {
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
    final By HoverFirstElement = By.xpath("/html[1]/body[1]/section[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]");
    final By AddCartButtonFirst = By.xpath("(//a[@class='btn btn-default add-to-cart'][normalize-space()='Add to cart'])[2]");
    final By ContinueShoppingButton = By.xpath("//button[normalize-space()='Continue Shopping']");
    final By HoverSecondElement = By.xpath("/html[1]/body[1]/section[2]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[2]");
    final By AddCartButtonSecond = By.xpath("//div[3]//div[1]//div[1]//div[2]//div[1]//a[1]");
    final By ViewCartButton = By.xpath("//u[normalize-space()='View Cart']");
    final By VerifyFirstProduct = By.xpath("//a[normalize-space()='Blue Top']");
    final By VerifySecondProduct = By.xpath("//a[normalize-space()='Men Tshirt']");
    final By VerifyFirstProductPrice = By.xpath("(//p[contains(text(),'Rs. 500')])[1]");
    final By VerifyFirstProductQuantity = By.xpath("(//button[@class='disabled'][normalize-space()='1'])[1]");
    final By VerifyFirstProductTotalPrice = By.xpath("//p[@class='cart_total_price'][normalize-space()='Rs. 500']");
    final By VerifySecondProductPrice = By.xpath("(//p[contains(text(),'Rs. 400')])[1]");
    final By VerifySecondProductQuantity = By.xpath("(//button[@class='disabled'][normalize-space()='1'])[2]");
    final By VerifySecondProductTotalPrice = By.xpath("(//p[@class='cart_total_price'][normalize-space()='Rs. 400'])[1]");
    final By SetQuantityField = By.xpath("//input[@id='quantity']");
    final By AddToCartButton = By.xpath("//button[normalize-space()='Add to cart']");
    final By ViewCartButtonAfterQuantitySet = By.xpath("//u[normalize-space()='View Cart']");
    final By VerifyQuantity = By.xpath("//table[@id=\"cart_info_table\"]/tbody[1]/tr[1]/td[4]/button");

    @Step("Increasing Quantity to 4.")
    public void SetQuantityField(String Quantity){
        wait.until(ExpectedConditions.visibilityOfElementLocated(SetQuantityField));
        driver.findElement(SetQuantityField).clear();
        driver.findElement(SetQuantityField).sendKeys(Quantity);
    }

    @Step("Clicking AddToCart Button.")
    public void ClickAddToCart(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(AddToCartButton));
        driver.findElement(AddToCartButton).click();
    }

    @Step("Clicking The View Cart Button.")
    public void ClickViewCart(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(ViewCartButtonAfterQuantitySet));
        driver.findElement(ViewCartButtonAfterQuantitySet).click();
    }

    @Step("Check Quantity you entered same or not.")
    public void VerifyQuantity(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(VerifyQuantity));
        String Quantity = driver.findElement(VerifyQuantity).getText();
        System.out.println("Product Quantity : "+Quantity);
    }

    @Step("Verify First product price.")
    public void VerifyFirstProductPrice() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(VerifyFirstProductPrice));
        String FirstPrice = driver.findElement(VerifyFirstProductPrice).getText();
        System.out.println("First Price : " + FirstPrice);
    }

    @Step("Verify First product Quantity.")
    public void VerifyFirstProductQuantity() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(VerifyFirstProductQuantity));
        String FirstQuantity = driver.findElement(VerifyFirstProductQuantity).getText();
        System.out.println("First Quantity : " + FirstQuantity);
    }

    @Step("Verify First product Total price.")
    public void VerifyFirstProductTotalPrice() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(VerifyFirstProductTotalPrice));
        String FirstTotalPrice = driver.findElement(VerifyFirstProductTotalPrice).getText();
        System.out.println("First total Price : " + FirstTotalPrice);
    }

    @Step("Verify Second product price.")
    public void VerifySecondProductPrice() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(VerifySecondProductPrice));
        String SecondPrice = driver.findElement(VerifySecondProductPrice).getText();
        System.out.println("Second Price : " + SecondPrice);
    }

    @Step("Verify Second product Quantity.")
    public void VerifySecondProductQuantity() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(VerifySecondProductQuantity));
        String SecondQuantity = driver.findElement(VerifySecondProductQuantity).getText();
        System.out.println("Second Quantity : " + SecondQuantity);
    }

    @Step("Verify Second product Total price.")
    public void VerifySecondProductTotalPrice() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(VerifySecondProductTotalPrice));
        String SecondTotalPrice = driver.findElement(VerifySecondProductTotalPrice).getText();
        System.out.println("Second total Price : " + SecondTotalPrice);
    }

    @Step("Verifying First product Name.")
    public void VerifyFirstProduct() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(VerifyFirstProduct));
        String FirstProduct = driver.findElement(VerifyFirstProduct).getText();
        if (FirstProduct.equalsIgnoreCase("Blue Top")) {
            System.out.println(FirstProduct + " is a first product.");
        }
    }

    @Step("Verifying Second product Name.")
    public void VerifySecondProduct() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(VerifySecondProduct));
        String SecondProduct = driver.findElement(VerifySecondProduct).getText();
        if (SecondProduct.equalsIgnoreCase("Men Tshirt")) {
            System.out.println(SecondProduct + " is a second product.");
        }
    }

    @Step("Hover First Element.")
    public void HoverFirstElement() {
        act = new Actions(driver);
        act.clickAndHold(driver.findElement(HoverFirstElement)).perform();
    }

    @Step("Clicking AddCart button in First Element.")
    public void ClickingAddCartButtonFirst() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(AddCartButtonFirst));
        driver.findElement(AddCartButtonFirst).click();
    }

    @Step("clicking Continue Shopping button.")
    public void ClickingContinueShoppingButton() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(ContinueShoppingButton));
        driver.findElement(ContinueShoppingButton).click();
    }

    @Step("Hover Second Element.")
    public void HoverSecondElement() {
        act = new Actions(driver);
        act.clickAndHold(driver.findElement(HoverSecondElement)).perform();
    }

    @Step("Clicking AddCart button in second button.")
    public void ClickingAddCartButtonSecond() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(AddCartButtonSecond));
        driver.findElement(AddCartButtonSecond).click();
    }

    @Step("Clicking View Cart button")
    public void ClickingViewCartButton() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(ViewCartButton));
        driver.findElement(ViewCartButton).click();
    }

    @Step("Clicking Product Button.")
    public void ClickProductButton() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(ProductsButton));
        driver.findElement(ProductsButton).click();
    }

    @Step("Verifying All Product Showing.")
    public void VerifyAllProduct() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(VerifyAllProduct));
        String AllProduct = driver.findElement(VerifyAllProduct).getText();
        if (AllProduct.equalsIgnoreCase("all products")) {
            System.out.println("It is showing All Products.");
        }
    }

    @Step("Click on view product Button.")
    public void ClickViewProduct() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(ViewProductButton));
        driver.findElement(ViewProductButton).click();
    }

    @Step("Verifying Product Name.")
    public void VerifyProductName() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(VerifyProductName));
        String ProductName = driver.findElement(VerifyProductName).getText();
        if (ProductName.contains("Blue Top")) {
            System.out.println("It is showing Product Name" + ProductName);
        }
    }

    @Step("Verifying Product Category.")
    public void VerifyProductCategory() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(VerifyProductCategory));
        String ProductCategory = driver.findElement(VerifyProductCategory).getText();
        if (ProductCategory.contains("Women > Tops")) {
            System.out.println("It is showing Product Category" + ProductCategory);
        }
    }

    @Step("Verifying Product Price.")
    public void VerifyProductPrice() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(VerifyProductPrice));
        String ProductPrice = driver.findElement(VerifyProductPrice).getText();
        if (ProductPrice.contains("Rs. 500")) {
            System.out.println("It is showing Product price" + ProductPrice);
        }
    }

    @Step("Verifying Product Availability.")
    public void VerifyAvailability() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(VerifyAvailability));
        String ProductAvailability = driver.findElement(VerifyAvailability).getText();
        if (ProductAvailability.contains(" In Stock")) {
            System.out.println("It is showing Product Availability" + ProductAvailability);
        }
    }

    @Step("Verifying Product Condition.")
    public void VerifyCondition() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(VerifyCondition));
        String ProductCondition = driver.findElement(VerifyCondition).getText();
        if (ProductCondition.contains("New")) {
            System.out.println("It is showing Product Condition" + ProductCondition);
        }
    }

    @Step("Verifying Product Brand.")
    public void VerifyBrand() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(VerifyBrand));
        String ProductBrand = driver.findElement(VerifyBrand).getText();
        if (ProductBrand.contains("Polo")) {
            System.out.println("It is showing Product Name" + ProductBrand);
        }
    }

    @Step("Entering Item into Search Field.")
    public void EnterSearchItem(String Item) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(SearchProductField));
        driver.findElement(SearchProductField).sendKeys(Item);
        wait.until(ExpectedConditions.visibilityOfElementLocated(SearchButton));
        driver.findElement(SearchButton).click();
        if (Item.equalsIgnoreCase("Dress")) {
            wait.until(ExpectedConditions.visibilityOfElementLocated(VerifyDressItem));
            String Dress = driver.findElement(VerifyDressItem).getText();
            if (Dress.contains("Dress")) {
                System.out.println("This is showing Dress Item.");
            }
        }
        if (Item.equalsIgnoreCase("Tops")) {
            wait.until(ExpectedConditions.visibilityOfElementLocated(VerifyTopItem));
            String Top = driver.findElement(VerifyTopItem).getText();
            if (Top.contains("Top")) {
                System.out.println("This is showing Top Items.");
            }
        }
        if (Item.equalsIgnoreCase("Saree")) {
            wait.until(ExpectedConditions.visibilityOfElementLocated(VerifySareeItem));
            String Top = driver.findElement(VerifySareeItem).getText();
            if (Top.contains("Saree")) {
                System.out.println("This is showing SAREE Items.");
            }
        }
        if (Item.equalsIgnoreCase("Tshirt")) {
            wait.until(ExpectedConditions.visibilityOfElementLocated(VerifyTshirtItem));
            String Top = driver.findElement(VerifyTshirtItem).getText();
            if (Top.contains("Tshirt")) {
                System.out.println("This is showing Tshirt Items.");
            }
        }
        if (Item.equalsIgnoreCase("Jeans")) {
            wait.until(ExpectedConditions.visibilityOfElementLocated(VerifyJeansItem));
            String Top = driver.findElement(VerifyJeansItem).getText();
            if (Top.contains("Jeans")) {
                System.out.println("This is showing Jeans Items.");
            }
        }
    }
}