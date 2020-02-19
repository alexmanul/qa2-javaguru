package qa2.javaguru.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import qa2.javaguru.Pages.Partials.Header;
import qa2.javaguru.Pages.Partials.Menu;
import qa2.javaguru.Utils.TestProperties;

public class S100MainPage extends BasePage implements Menu, Header {

    public S100MainPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public void navigateToPortal() {
        driver.navigate().to(TestProperties.getProperty("url"));
        driver.manage().window().maximize();
    }
}