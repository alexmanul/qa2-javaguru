package qa2.javaguru.core;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;

public class BaseFunctions {

    private static final String CHROME_WEBDRIVER_LOCATION = "C:/chromedriver.exe";
    private static final Logger LOGGER = Logger.getLogger(BaseFunctions.class);
    private WebDriver driver;

    public BaseFunctions() {
        LOGGER.info("Setting global property for driver");
        System.setProperty("webdriver.chrome.driver", CHROME_WEBDRIVER_LOCATION);

        LOGGER.info("Opening Chrome browser");
        this.driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    public void goToUrl(String url) {
        if (!url.contains("http://") && !url.contains("https://")) {
            url = "http://" + url;
        }
        LOGGER.info("User goes to: " + url);
        driver.get(url);
    }

    public void click(By locator) {
        driver.findElement(locator).click();
    }

    public WebElement waitForElement(By locator) {
        return (new WebDriverWait(driver, 10))
                .until(ExpectedConditions.presenceOfElementLocated
                        (locator));
    }

    public void fillInput(By locator, String text) {
        driver.findElement(locator).sendKeys(text);
    }


    public void switchingTabs() {
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
    }

    public void switchingTabsBack() {
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(0));
    }

    public void closeDriver() {
        driver.close();
    }

    public void closePages() {
        closeDriver();
        switchingTabsBack();
        closeDriver();
    }

    public WebElement findElement(By locator) {
        waitForElement(locator);
        return driver.findElement(locator);
    }
}


