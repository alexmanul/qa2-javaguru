package qa2.javaguru.pages;

import org.apache.log4j.Logger;
import qa2.javaguru.core.BaseFunctions;
import qa2.javaguru.forms.PhpRegistrationForm;

public class PhpPage extends JavaGuruPage {

    private static final Logger LOGGER = Logger.getLogger(PhpPage.class);

    PhpPage(BaseFunctions baseFunctions) {
        this.baseFunctions = baseFunctions;
        LOGGER.info("PHP course page is loaded");
    }

    public PhpRegistrationForm openRegistrationForm() {
        LOGGER.info("We are opening Google registration form for PHP course");
        baseFunctions.click(REGISTER_LINK);
        return new PhpRegistrationForm(baseFunctions);
    }
}
