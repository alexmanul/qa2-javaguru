package qa2.javaguru.Steps;

import cucumber.api.DataTable;
import cucumber.api.Scenario;
import cucumber.api.java.en.And;
import qa2.javaguru.Elements.UIElement;
import qa2.javaguru.Pages.BasePage;
import qa2.javaguru.Pages.S100MainPage;
import qa2.javaguru.Utils.CommonApproach.IdentificatorReader;
import qa2.javaguru.Utils.CustomAssertions;

import java.util.List;
import java.util.Map;

public class CommonSteps extends BaseSteps {

    private final BasePage basePage = new BasePage(driver, wait);
    private final S100MainPage mainPage = new S100MainPage(driver, wait);
    Scenario scenario;

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////// COMMON APPROACH ////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //////////////////////////////////////////////////// NAVIGATION ////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    @And("I navigate to JAVAGURU.LV website")
    public void INavigateToWebsite() throws Exception {
        mainPage.navigateToPortal();
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //////////////////////////////////////////////////// ASSERTIONS ////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    @And("I see '(.+)' element on the '(.+)' page")
    public void ISeeElementOnTheScreen(String element, String page) throws Exception {
        new IdentificatorReader(page).getUIElement(element, UIElement.class).isDisplayed();
    }

    @And("I see '(.+)' text for '(.+)' element on the '(.+)' page")
    public void ISeeElementOnTheScreen(String text, String element, String page) throws Exception {
        CustomAssertions.assertThatEquals(new IdentificatorReader(page).getUIElement(element, UIElement.class).getValue(),
                text, "Element " + element + " text is wrong");
    }

    @And("I do not see '(.+)' element on the '(.+)' page")
    public void IDoNotSeeElementOnTheScreen(String title, String page) throws Exception {
        new IdentificatorReader(page).getUIElement(title, UIElement.class).isNotDisplayed();
    }

    @And("I see following elements on the '(.+)' page")
    public void ISeeElementOn(String page, DataTable table) throws Exception {
        List<Map<String, String>> data = table.asMaps(String.class, String.class);
        for (Map<String, String> row : data) {
            CustomAssertions.assertThatTrue(new IdentificatorReader(page).getUIElement(row.get("ELEMENT"), UIElement.class).isDisplayed(),
                    "Element " + row.get("ELEMENT") + " is not displayed");
        }

        if (data.get(0).size() > 1) {
            for (Map<String, String> row : data) {
                if (row.get("LABEL").startsWith("*")) {
                    String label = row.get("LABEL").replace("*", "");
                    CustomAssertions.assertThatContains(new IdentificatorReader(page).getUIElement(row.get("ELEMENT"), UIElement.class)
                            .getValue(), label, "Element " + row.get("ELEMENT") + " label is wrong");
                } else if (!row.get("LABEL").isEmpty()) {
                    CustomAssertions.assertThatEquals(new IdentificatorReader(page).getUIElement(row.get("ELEMENT"), UIElement.class)
                            .getValue(), row.get("LABEL"), "Element " + row.get("ELEMENT") + " label is wrong");
                }
            }
        }

    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////// CLICKS //////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    @And("I click on '(.+)' element on the '(.+)' page")
    public void IClickOnIcon(String title, String screen) throws Exception {
        new IdentificatorReader(screen).getUIElement(title, UIElement.class).click();
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////// FILLINGS /////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
}