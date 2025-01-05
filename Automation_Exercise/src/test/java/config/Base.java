package config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Base {
    String Url = "https://automationexercise.com/login";
    public static WebDriver driver;

    public void Setup() {
        ChromeOptions options = new ChromeOptions();
        driver = new ChromeDriver(options);
//        options.addArguments("--headless");
        driver.manage().window().maximize();
        driver.get(Url);
    }
}
