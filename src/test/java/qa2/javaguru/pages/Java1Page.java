package qa2.javaguru.pages;

import org.apache.log4j.Logger;
import qa2.javaguru.core.BaseFunctions;
import qa2.javaguru.forms.Java1RegistrationForm;

public class Java1Page extends JavaGuruPage {

    private static final Logger LOGGER = Logger.getLogger(Java1Page.class);

    Java1Page(BaseFunctions baseFunctions) {
        this.baseFunctions = baseFunctions;
        LOGGER.info("Java 1 course page is loaded");
    }

    public Java1RegistrationForm openRegistrationForm() {
        LOGGER.info("We are opening Google registration form for Java 1 course");
        baseFunctions.click(REGISTER_LINK);
        return new Java1RegistrationForm(baseFunctions);
    }
}
