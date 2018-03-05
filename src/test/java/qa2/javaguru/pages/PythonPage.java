package qa2.javaguru.pages;

import org.apache.log4j.Logger;
import qa2.javaguru.core.BaseFunctions;
import qa2.javaguru.forms.PythonRegistrationForm;

public class PythonPage extends JavaGuruPage {

    private static final Logger LOGGER = Logger.getLogger(PythonPage.class);

    PythonPage(BaseFunctions baseFunctions) {
        this.baseFunctions = baseFunctions;
        LOGGER.info("Python course page is loaded");
    }

    public PythonRegistrationForm openRegistrationForm() {
        LOGGER.info("We are opening Google registration form for QA course");
        baseFunctions.click(REGISTER_LINK);
        return new PythonRegistrationForm(baseFunctions);
    }
}
