package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstTest {

    public ChromeDriver driver;
    public String myForkURL = "https://test.my-fork.com/";
    public String logInBtn = "//div[@id='log-in-button']";

    public String emailField = "//input[@id='email']";
    public String passwordField = "//input[@id='password']";
    public String email = "email@gmail.com";
    public String password = "password";
    public String submitBtn = "//button[@type='submit' and @class='auth-page-main-block-form-submit-button']";
    public String rememberMeBox = "//input[@id='auth-page-remember-me']";


    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "/Users/juliamyroniv/IdeaProjects/SeleniumProject./src/test/resources/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
        driver = new ChromeDriver(options);
    }

    @Test
    public void openWebsite() throws InterruptedException {

        driver.get(myForkURL);
    }


    public void openSignInPage() throws InterruptedException {
        driver.get(myForkURL);
        driver.findElement(By.xpath(logInBtn)).click();
        Thread.sleep(1000);


    }

    @Test
    public void allFieldsAreDisplayed() throws InterruptedException {

        openSignInPage();
        driver.findElement(By.xpath(emailField)).isDisplayed();
        driver.findElement(By.xpath(passwordField)).isDisplayed();
        driver.findElement(By.xpath(submitBtn)).isDisplayed();
        driver.quit();
    }

    @Test
    public void logInIntoApp() throws InterruptedException {

        openSignInPage();
        driver.findElement(By.xpath(emailField)).sendKeys(email);
        driver.findElement(By.xpath(passwordField)).sendKeys(password);
        driver.findElement(By.xpath(passwordField)).sendKeys(Keys.ENTER);
        Thread.sleep(5000);
        driver.quit();
    }

    @Test
    public void errorMessageIsDisplayed() throws InterruptedException {

        openSignInPage();
        driver.findElement(By.xpath(emailField)).sendKeys(email);
        driver.findElement(By.xpath(passwordField)).sendKeys(password);
        Thread.sleep(5000);
        System.out.println(driver.findElement(By.xpath("//p[contains(text(),'Error: email is incorrect')]")).isDisplayed());
        driver.quit();
    }

    @Test
    public void rememberMeIsCheckedByDefault() throws InterruptedException {

        openSignInPage();
        System.out.println(driver.findElement(By.xpath(rememberMeBox)).isSelected());
        System.out.println(driver.findElement(By.xpath("//div[@class='auth-page-remember-me-text']")).getText());
        driver.quit();

    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void closeBrowser() {
        driver.close();
    }
}

