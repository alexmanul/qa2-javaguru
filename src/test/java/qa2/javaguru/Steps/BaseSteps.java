package qa2.javaguru.Steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import qa2.javaguru.Utils.DriverSingleton;
import qa2.javaguru.Utils.Hooks;
import qa2.javaguru.Utils.TestProperties;

public class BaseSteps {

    public WebDriver driver = DriverSingleton.getInstance();
    public WebDriverWait wait = new WebDriverWait(driver, Integer.parseInt(TestProperties.getProperty("selenium.explicit.wait")));
    protected String featureName = Hooks.featureName;
    protected String scenarioName = Hooks.scenarioName;

}
