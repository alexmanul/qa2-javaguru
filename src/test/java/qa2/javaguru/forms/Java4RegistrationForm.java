package qa2.javaguru.forms;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import qa2.javaguru.core.BaseFunctions;

public class Java4RegistrationForm implements RegistrationForm {

    public static final By DISCOUNT = By.id("entry_337407387");
    private static final Logger LOGGER = Logger.getLogger(Java1RegistrationForm.class);
    private static final By SUBMIT_FORM = By.id("ss-submit");
    BaseFunctions baseFunctions;

    public Java4RegistrationForm(BaseFunctions baseFunctions) {
        this.baseFunctions = baseFunctions;
        LOGGER.info("Registration form for Java 4 course is loaded");
    }

    public void fillRegistrationForm(String firstName, String lastName, String phone, String email,
                                     String skills, String comment, String discount) {
        baseFunctions.waitForElement(FIRST_NAME_FIELD);
        baseFunctions.fillInput(FIRST_NAME_FIELD, firstName);
        baseFunctions.fillInput(LAST_NAME_FIELD, lastName);
        baseFunctions.fillInput(PHONE, phone);
        baseFunctions.fillInput(EMAIL, email);
        baseFunctions.fillInput(PROGRAMMING_SKILLS, skills);
        baseFunctions.fillInput(COMMENT, comment);
        baseFunctions.fillInput(DISCOUNT, discount);
        //baseFunctions.click(SUBMIT_FORM);
    }
}