package qa2.javaguru.Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import qa2.javaguru.Utils.DriverSingleton;

public class Button extends UIElement {

    public Button(WebDriver driver, By by) {
        super(driver, by);
    }

    public static Button get(By by) {
        return new Button(DriverSingleton.getInstance(), by);
    }
}
