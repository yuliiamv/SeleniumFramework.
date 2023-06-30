package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class TestCase {
    @Test
    public void startBrowser() {
        System.setProperty("webdriver.chrome.driver", "/Users/juliamyroniv/IdeaProjects/SeleniumProject./src/test/resources/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
        ChromeDriver driver = new ChromeDriver(options);
        driver.get("https://www.nytimes.com/");
    }



    @Test
    public void openWebsite() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/juliamyroniv/IdeaProjects/SeleniumProject./src/test/resources/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
        ChromeDriver driver = new ChromeDriver(options);
        driver.get("https://test.my-fork.com/");
    }

    @Test
    public void openSignInPage() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/juliamyroniv/IdeaProjects/SeleniumProject./src/test/resources/chromedriver");
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--remote-allow-origins=*");
            options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
            ChromeDriver driver = new ChromeDriver(options);
            driver.get("https://test.my-fork.com/");
            driver.findElement(By.xpath("//div[@id='log-in-button']")).click();
            Thread.sleep(1000);
            driver.quit();
        }
        
    @Test
    public void allFieldsAreDisplayed() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/juliamyroniv/IdeaProjects/SeleniumProject./src/test/resources/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
        ChromeDriver driver = new ChromeDriver(options);
        driver.get("https://test.my-fork.com/");
        driver.findElement(By.xpath("//div[@id='log-in-button']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='email']")).isDisplayed();
        driver.findElement(By.xpath("//input[@id='password']")).isDisplayed();
        driver.findElement(By.xpath("//button[@type='submit' and @class='auth-page-main-block-form-submit-button']")).isDisplayed();
        driver.quit();
    }

    @Test
    public void logInIntoApp() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/juliamyroniv/IdeaProjects/SeleniumProject./src/test/resources/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
        ChromeDriver driver = new ChromeDriver(options);
        driver.get("https://test.my-fork.com/");
        driver.findElement(By.xpath("//div[@id='log-in-button']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("email@gmail.com");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("password");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys(Keys.ENTER);
        Thread.sleep(5000);
        driver.quit();
    }

    @Test
    public void errorMesssageValidation() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/juliamyroniv/IdeaProjects/SeleniumProject./src/test/resources/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
        ChromeDriver driver = new ChromeDriver(options);
        driver.get("https://test.my-fork.com/");
        driver.findElement(By.xpath("//div[@id='log-in-button']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("email@gmail.com");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("password");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys(Keys.ENTER);
        Thread.sleep(5000);
        System.out.println(driver.findElement(By.xpath("//p[contains(text(),'Error: email is incorrect')]")).isDisplayed());
        driver.quit();
    }

    @Test
    public void checkBoxIsCheckedByDefault() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/juliamyroniv/IdeaProjects/SeleniumProject./src/test/resources/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
        ChromeDriver driver = new ChromeDriver(options);
        driver.get("https://test.my-fork.com/");
        driver.findElement(By.xpath("//div[@id='log-in-button']")).click();
        Thread.sleep(1000);
        System.out.println(driver.findElement(By.xpath("//input[@id='auth-page-remember-me']")).isSelected());
        System.out.println(driver.findElement(By.xpath("//div[@class='auth-page-remember-me-text']")).getText());
        driver.quit();

    }
    @Test
    public void openWebsiteSuite() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/juliamyroniv/IdeaProjects/SeleniumProject./src/test/resources/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
        ChromeDriver driver = new ChromeDriver(options);
        driver.get("https://test.my-fork.com/");
        driver.findElement(By.xpath("//div[@id='log-in-button']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("email@gmail.com");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("password");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys(Keys.ENTER);
        Thread.sleep(5000);
        System.out.println(driver.findElement(By.xpath("//p[contains(text(),'Error: email is incorrect')]")).isDisplayed());
        System.out.println(driver.findElement(By.xpath("//input[@id='auth-page-remember-me']")).isSelected());
        System.out.println(driver.findElement(By.xpath("//div[@class='auth-page-remember-me-text']")).getText());
        driver.quit();
    }
}

