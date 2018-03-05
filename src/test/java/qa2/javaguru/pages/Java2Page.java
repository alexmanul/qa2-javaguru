package qa2.javaguru.pages;

import org.apache.log4j.Logger;
import qa2.javaguru.core.BaseFunctions;
import qa2.javaguru.forms.Java2RegistrationForm;

public class Java2Page extends JavaGuruPage {

    private static final Logger LOGGER = Logger.getLogger(Java2Page.class);

    Java2Page(BaseFunctions baseFunctions) {
        this.baseFunctions = baseFunctions;
        LOGGER.info("Java 2 course page is loaded");
    }

    public Java2RegistrationForm openRegistrationForm() {
        LOGGER.info("We are opening Google registration form for Java 2 course");
        baseFunctions.click(REGISTER_LINK);
        return new Java2RegistrationForm(baseFunctions);
    }
}
