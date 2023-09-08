package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage extends BaseMain{
    public HomePage(ChromeDriver driver){
        super(driver);
    }

    public String myForkURL = "https://test.my-fork.com/";
    public String signInBtn = "//div[@id='log-in-button']";
    public void openSignInPage() throws InterruptedException {
        driver.get(myForkURL);
        Thread.sleep(1000);
    }
        public void clickSignInBtn(){
            driver.findElement(By.xpath(signInBtn)).click();

        }


    }

