package qa2.javaguru.forms;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import qa2.javaguru.core.BaseFunctions;

public class PhpRegistrationForm implements RegistrationForm {

    private static final By HAVING_PC = By.id("group_1887084786_2");
    private static final By ADVISER = By.id("entry_1696450117");
    private static final Logger LOGGER = Logger.getLogger(PhpRegistrationForm.class);
    BaseFunctions baseFunctions;


    public PhpRegistrationForm(BaseFunctions baseFunctions) {
        this.baseFunctions = baseFunctions;
        LOGGER.info("Registration form is loaded");
    }

    public void fillRegistrationForm(String firstName, String lastName, String phone, String email, String skills,
                                     String adviser, String comment) {
        baseFunctions.waitForElement(FIRST_NAME_FIELD);
        baseFunctions.fillInput(FIRST_NAME_FIELD, firstName);
        baseFunctions.fillInput(LAST_NAME_FIELD, lastName);
        baseFunctions.fillInput(PHONE, phone);
        baseFunctions.fillInput(EMAIL, email);
        baseFunctions.fillInput(PROGRAMMING_SKILLS, skills);
        baseFunctions.click(HAVING_PC);
        baseFunctions.fillInput(ADVISER, adviser);
        baseFunctions.fillInput(COMMENT, comment);
        //baseFunctions.click(SUBMIT_FORM);
    }
}