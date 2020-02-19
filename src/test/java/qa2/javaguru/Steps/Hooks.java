package qa2.javaguru.Steps;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import qa2.javaguru.Utils.CommonApproach.Pages;
import qa2.javaguru.Utils.DriverSingleton;
import qa2.javaguru.Utils.Screenshots;

public class Hooks {
    static String featureName;
    static String scenarioName;
    private static ExtentTest extentTest;
    private WebDriver driver;
    private ExtentReports extent;
    private Screenshots screen;

    @Before
    public void before(Scenario scenario) {
        driver = DriverSingleton.getInstance();
        screen = new Screenshots();
        scenarioName = screen.getNameOfScenario(scenario);
        featureName = screen.getNameOfFeature(scenario);
        extent = DriverSingleton.getExtent();
        extentTest = DriverSingleton.getExtentTest(featureName, scenarioName);
        Pages.clearCache();
        Pages.setWebDriverAndWait();
    }

    @After
    public void tearDown(Scenario scenario) {
        extent.endTest(extentTest);
        extent.flush();
        DriverSingleton.destroySingletonInstance();
    }
}
