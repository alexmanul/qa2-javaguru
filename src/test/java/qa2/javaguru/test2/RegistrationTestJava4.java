package qa2.javaguru.test2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import qa2.javaguru.core.BaseFunctions;
import qa2.javaguru.forms.Java4RegistrationForm;
import qa2.javaguru.pages.Java4Page;
import qa2.javaguru.pages.MainPage;

public class RegistrationTestJava4 {

    private static final String FIRST_NAME = "John";
    private static final String LAST_NAME = "Doe";
    private static final String PHONE = "39393939";
    private static final String EMAIL = "selenium01@mail.ru";
    private static final String SKILLS = "I am QA2 course student writing automation tests for JavaGuru website";
    private static final String COMMENT = "Don't hesitate to delete my spam ha-ha";
    private static final String DISCOUNT = "no discount";
    private BaseFunctions baseFunctions = new BaseFunctions();
    private MainPage mainPage;

    @Before
    public void setUp() {
        baseFunctions.goToUrl("www.javaguru.lv");
        mainPage = new MainPage(baseFunctions);
    }

    @Test
    public void registrationTesting() {
        Java4Page java4Page = mainPage.openJava4Page();
        Java4RegistrationForm java4RegistrationForm = java4Page.openRegistrationForm();
        baseFunctions.switchingTabs();
        java4RegistrationForm.fillRegistrationForm(FIRST_NAME, LAST_NAME, PHONE, EMAIL, SKILLS, COMMENT, DISCOUNT);
    }

    @After
    public void tearDown() {
        baseFunctions.closePages();
    }
}