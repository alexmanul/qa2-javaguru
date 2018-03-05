package qa2.javaguru.forms;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import qa2.javaguru.core.BaseFunctions;

public class QARegistrationForm implements RegistrationForm {

    public static final By COURSE = By.id("group_738971122_1");
    public static final By HAVING_PC = By.id("group_1887084786_2");
    public static final By DISCOUNT = By.id("entry_1091055623");
    private static final Logger LOGGER = Logger.getLogger(QARegistrationForm.class);
    private BaseFunctions baseFunctions;

    public QARegistrationForm(BaseFunctions baseFunctions) {
        this.baseFunctions = baseFunctions;
        LOGGER.info("Registration form is loaded");
    }

    public void fillRegistrationForm(String firstName, String lastName, String phone, String email, String skills,
                                     String adviser, String comment, String discount) {
        baseFunctions.waitForElement(FIRST_NAME_FIELD);
        baseFunctions.fillInput(FIRST_NAME_FIELD, firstName);
        baseFunctions.fillInput(LAST_NAME_FIELD, lastName);
        baseFunctions.fillInput(PHONE, phone);
        baseFunctions.fillInput(EMAIL, email);
        baseFunctions.click(COURSE);
        baseFunctions.fillInput(PROGRAMMING_SKILLS, skills);
        baseFunctions.click(HAVING_PC);
        baseFunctions.fillInput(ADVISER, adviser);
        baseFunctions.fillInput(COMMENT, comment);
        baseFunctions.fillInput(DISCOUNT, discount);
        //baseFunctions.click(SUBMIT_FORM);
    }
}
