package qa2.javaguru.pages;

import org.apache.log4j.Logger;
import qa2.javaguru.core.BaseFunctions;
import qa2.javaguru.forms.Java3RegistrationForm;

public class Java3Page extends JavaGuruPage {

    private static final Logger LOGGER = Logger.getLogger(Java3Page.class);

    Java3Page(BaseFunctions baseFunctions) {
        this.baseFunctions = baseFunctions;
        LOGGER.info("Java 3 course page is loaded");
    }

    // Clicking on the link which opens Google registration form for Java 3 course
    public Java3RegistrationForm openRegistrationForm() {
        LOGGER.info("We are opening Google registration form for Java 3 course");
        baseFunctions.click(REGISTER_LINK);
        return new Java3RegistrationForm(baseFunctions);
    }
}
