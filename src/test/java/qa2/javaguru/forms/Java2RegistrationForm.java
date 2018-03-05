package qa2.javaguru.forms;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import qa2.javaguru.core.BaseFunctions;

public class Java2RegistrationForm implements RegistrationForm {

    private static final By LAST_NAME_FIELD = By.id("entry_1000003");
    private static final By PHONE = By.id("entry_1000001");
    private static final By EMAIL = By.id("entry_1000004");
    private static final By DISCOUNT = By.id("entry_1849903685");
    private static final Logger LOGGER = Logger.getLogger(Java2RegistrationForm.class);
    private BaseFunctions baseFunctions;

    public Java2RegistrationForm(BaseFunctions baseFunctions) {
        this.baseFunctions = baseFunctions;
        LOGGER.info("Registration form for Java 2 course is loaded");
    }

    public void fillRegistrationForm(String firstName, String lastName, String phone, String email,
                                     String discount) {
        baseFunctions.waitForElement(FIRST_NAME_FIELD);
        baseFunctions.fillInput(FIRST_NAME_FIELD, firstName);
        baseFunctions.fillInput(LAST_NAME_FIELD, lastName);
        baseFunctions.fillInput(PHONE, phone);
        baseFunctions.fillInput(EMAIL, email);
        baseFunctions.fillInput(DISCOUNT, discount);
        //baseFunctions.click(SUBMIT_FORM);
    }
}
