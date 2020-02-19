package qa2.javaguru.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import qa2.javaguru.Utils.DriverSingleton;

public class Label extends UIElement {

    public Label(WebDriver driver, By by) {
        super(driver, by);
    }

    public static Label get(By by) {
        return new Label(DriverSingleton.getInstance(), by);
    }
}

