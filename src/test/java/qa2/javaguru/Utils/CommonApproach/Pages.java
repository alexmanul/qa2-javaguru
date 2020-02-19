package qa2.javaguru.Utils.CommonApproach;

import lombok.extern.log4j.Log4j;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import qa2.javaguru.Pages.BasePage;
import qa2.javaguru.Pages.S100MainPage;
import qa2.javaguru.Pages.S101RegistrationPage;
import qa2.javaguru.Steps.BaseSteps;
import qa2.javaguru.Utils.DriverSingleton;
import qa2.javaguru.Utils.TestProperties;

import java.util.HashMap;
import java.util.Map;

@Log4j
public class Pages extends BaseSteps {
    private final static String MENU = "MENU";
    private final static String S100 = "S100";
    private final static String S101 = "S101";

    private final static Map<String, BasePage> cache = new HashMap<>();
    private static RemoteWebDriver driver;
    private static WebDriverWait wait;

    private static void getPageObjectForSpecificPage(String screen) throws Exception {
        switch (screen) {
            case "S100":
                cache.put(S100, new S100MainPage(driver, wait));
                return;
            case "S101":
                cache.put(S101, new S101RegistrationPage(driver, wait));
                return;
            default:
                throw new Exception("Page object is not found for the " + screen);
        }
    }

    public static BasePage getCachedPageObject(String page) throws Exception {
        log.debug("Cached pages count is " + cache.size());
        if (!cache.containsKey(page)) {
            getPageObjectForSpecificPage(page);
        }
        return cache.get(page);
    }

    public static void clearCache() {
        log.debug("Clearing cache");
        cache.clear();
    }

    public static void setWebDriverAndWait() {
        if (driver == null || driver.getSessionId() == null) {
            driver = DriverSingleton.getInstance();
            wait = new WebDriverWait(driver, Integer.parseInt(TestProperties.getProperty("selenium.explicit.wait")));
        }
    }
}