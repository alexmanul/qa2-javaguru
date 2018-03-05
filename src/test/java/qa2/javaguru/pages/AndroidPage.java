package qa2.javaguru.pages;

import org.apache.log4j.Logger;
import qa2.javaguru.core.BaseFunctions;
import qa2.javaguru.forms.AndroidRegistrationForm;

public class AndroidPage extends JavaGuruPage {

    private static final Logger LOGGER = Logger.getLogger(AndroidPage.class);

    AndroidPage(BaseFunctions baseFunctions) {
        this.baseFunctions = baseFunctions;
        LOGGER.info("Android course page is loaded");
    }

    public AndroidRegistrationForm openRegistrationForm() {
        LOGGER.info("We are opening Google registration form for Android course");
        baseFunctions.click(REGISTER_LINK);
        return new AndroidRegistrationForm(baseFunctions);
    }
}
