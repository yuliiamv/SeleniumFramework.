package testcases;

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
}
