package qa2.javaguru.test2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import qa2.javaguru.core.BaseFunctions;
import qa2.javaguru.forms.QARegistrationForm;
import qa2.javaguru.pages.MainPage;
import qa2.javaguru.pages.QAPage;

public class RegistrationTestQA {

    private static final String FIRST_NAME = "John";
    private static final String LAST_NAME = "Doe";
    private static final String PHONE = "39393939";
    private static final String EMAIL = "selenium01@mail.ru";
    private static final String SKILLS = "QA2 course student writes test automation for JavaGuru website";
    private static final String ADVISER = "Dmitry Braslis";
    private static final String COMMENT = "Delete my spam";
    private static final String DISCOUNT = "no discount";
    private MainPage mainPage;
    private BaseFunctions baseFunctions = new BaseFunctions();

    @Before
    public void setUp() {
        baseFunctions.goToUrl("www.javaguru.lv");
        mainPage = new MainPage(baseFunctions);
    }

    @Test
    public void registrationTesting() {
        QAPage qaPage = mainPage.openQaPage();
        QARegistrationForm qaRegistrationForm = qaPage.openRegistrationForm();
        baseFunctions.switchingTabs();
        qaRegistrationForm.fillRegistrationForm(FIRST_NAME, LAST_NAME, PHONE, EMAIL, SKILLS, ADVISER, COMMENT, DISCOUNT);
    }

    @After
    public void tearDown() {
        baseFunctions.closePages();
    }
}
