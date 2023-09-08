package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pageobjects.HomePage;

import javax.swing.*;

public class FirstTest extends BaseTest{


    @Test
    public void openSignInPage() throws InterruptedException {
       homePage.openSignInPage();
       homePage.clickSignInBtn();

    }

    @Test
    public void allFieldsAreDisplayed() throws InterruptedException {

        homePage.openSignInPage();
        homePage.clickSignInBtn();
        loginPage.allFieldsDisplayed();

    }

    @Test
    public void logInIntoApp() throws InterruptedException {

        homePage.openSignInPage();
        homePage.clickSignInBtn();
        loginPage.fillInEmailAndPassword();
        loginPage.pressEnter();

    }

    @Test
    public void errorMessageIsDisplayed() throws InterruptedException {

        homePage.openSignInPage();
        homePage.clickSignInBtn();
        loginPage.fillInEmailAndPassword();
        loginPage.pressEnter();
        loginPage.displayErrorMessage();

    }

    @Test
    public void rememberMeIsCheckedByDefault() throws InterruptedException {

        homePage.openSignInPage();
        homePage.clickSignInBtn();
        loginPage.checkIfRememberMeIsSelected();
        loginPage.checkRememberMeBtnLabel();
    }


}

