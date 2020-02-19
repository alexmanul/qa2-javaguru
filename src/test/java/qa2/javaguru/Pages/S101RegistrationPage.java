package qa2.javaguru.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import qa2.javaguru.Pages.Partials.Header;
import qa2.javaguru.Pages.Partials.Menu;
import qa2.javaguru.Utils.CommonApproach.Identificator;
import qa2.javaguru.elements.Label;

public class S101RegistrationPage extends BasePage implements Header, Menu {

    public S101RegistrationPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    @Identificator(id = "S101_screen_title")
    public Label S101ScreenTitle() {
        return Label.get(By.cssSelector("div > h1"));
    }

    @Identificator(id = "S101_screen_subtitle_1")
    public Label S101ScreenSubTitle1() {
        return Label.get(By.cssSelector(".wpb_wrapper > h2"));
    }

}