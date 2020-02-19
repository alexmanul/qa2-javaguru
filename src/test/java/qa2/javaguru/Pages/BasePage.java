package qa2.javaguru.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import qa2.javaguru.Utils.TestDataReader;
import qa2.javaguru.Utils.Utils;
import qa2.javaguru.elements.Button;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

public class BasePage {

    public RemoteWebDriver driver;
    public WebDriverWait wait;
    private TestDataReader testDataReader = new TestDataReader();

    public BasePage(WebDriver driver, WebDriverWait wait) {
        this.driver = (RemoteWebDriver) driver;
        this.wait = wait;
    }

    // ASSERTIONS

    public void assertThatEquals(String actual, String expected) {
        assertThat(actual)
                .isEqualTo(testDataReader.getDataFromFile(Utils.getSpecificDate(expected)));
    }

    public void assertThatEquals(String actual, String expected, String exceptionMessage) {
        assertThat(actual).as(exceptionMessage)
                .isEqualTo(testDataReader.getDataFromFile(Utils.getSpecificDate(expected)));
    }

    public void assertThatEquals(int actual, int expected, String exceptionMessage) {
        assertThatEquals(String.valueOf(actual), Utils.getSpecificDate(String.valueOf(expected)), exceptionMessage);
    }

    public void waitPageIsLoaded() {
        new Button(driver, By.cssSelector("")).waitPageIsLoaded();
    }

    public void switchBrowserTab(int browserTabNumber) {
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(browserTabNumber - 1));
    }
}
