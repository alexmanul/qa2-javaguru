package qa2.javaguru.pages;

import org.apache.log4j.Logger;
import qa2.javaguru.core.BaseFunctions;
import qa2.javaguru.forms.Java4RegistrationForm;

public class Java4Page extends JavaGuruPage {

    private static final Logger LOGGER = Logger.getLogger(Java4Page.class);

    Java4Page(BaseFunctions baseFunctions) {
        this.baseFunctions = baseFunctions;
        LOGGER.info("Java 4 course page is loaded");
    }

    // Clicking on the link which opens Google registration form for Java 4 course
    public Java4RegistrationForm openRegistrationForm() {
        LOGGER.info("We are opening Google registration form for Java 4 course");
        baseFunctions.click(REGISTER_LINK);
        return new Java4RegistrationForm(baseFunctions);
    }
}
