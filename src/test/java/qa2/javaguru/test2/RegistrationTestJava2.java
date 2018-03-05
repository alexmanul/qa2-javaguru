package qa2.javaguru.test2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import qa2.javaguru.core.BaseFunctions;
import qa2.javaguru.forms.Java2RegistrationForm;
import qa2.javaguru.pages.Java2Page;
import qa2.javaguru.pages.MainPage;

public class RegistrationTestJava2 {

    private static final String FIRST_NAME = "John";
    private static final String LAST_NAME = "Doe";
    private static final String PHONE = "39393939";
    private static final String EMAIL = "selenium01@mail.ru";
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
        Java2Page java2Page = mainPage.openJava2Page();
        Java2RegistrationForm java2RegistrationForm = java2Page.openRegistrationForm();
        baseFunctions.switchingTabs();
        java2RegistrationForm.fillRegistrationForm(FIRST_NAME, LAST_NAME, PHONE, EMAIL, DISCOUNT);
    }

    @After
    public void tearDown() {
        baseFunctions.closePages();
    }
}
