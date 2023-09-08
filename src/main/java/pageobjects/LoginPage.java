package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage extends BaseMain {
    public LoginPage(ChromeDriver driver) {
        super(driver);
    }

    public String email = "email@gmail.com";
    public String password = "password";
    public String emailField = "//input[@id='email']";
    public String passwordField = "//input[@id='password']";

    public By passwordInput = By.xpath("//input[@id='password']");
    public String submitBtn = "//button[@type='submit' and @class='auth-page-main-block-form-submit-button']";
    public By errorMessage = By.xpath("//p[contains(text(),'Error: email is incorrect')]");
    public String rememberMeBox = "//input[@id='auth-page-remember-me']";

    public String rememberMeBtnLabel = "//div[@class='auth-page-remember-me-text']";

    public void fillInEmailAndPassword() throws InterruptedException {
        driver.findElement(By.xpath(emailField)).sendKeys(email);
        driver.findElement((passwordInput)).sendKeys(password);
    }

    public void pressEnter() throws InterruptedException {
        driver.findElement((passwordInput)).sendKeys(Keys.ENTER);
        Thread.sleep(5000);
    }


    public void allFieldsDisplayed() {
        driver.findElement(By.xpath(emailField)).isDisplayed();

        driver.findElement(By.xpath(passwordField)).isDisplayed();
        driver.findElement(By.xpath(submitBtn)).isDisplayed();


    }

    public void displayErrorMessage() {
        System.out.println(driver.findElement(errorMessage).isDisplayed());
    }

    public void checkIfRememberMeIsSelected(){
        System.out.println(driver.findElement(By.xpath(rememberMeBox)).isSelected());

    }

    public void checkRememberMeBtnLabel(){
        System.out.println(driver.findElement(By.xpath(rememberMeBtnLabel)).getText());
    }
}
