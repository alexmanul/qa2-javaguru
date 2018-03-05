package qa2.javaguru.pages;

import org.apache.log4j.Logger;
import qa2.javaguru.core.BaseFunctions;
import qa2.javaguru.forms.CSharpRegistrationForm;

public class CSharpPage extends JavaGuruPage {

    private static final Logger LOGGER = Logger.getLogger(CSharpPage.class);

    CSharpPage(BaseFunctions baseFunctions) {
        this.baseFunctions = baseFunctions;
        LOGGER.info("CSharp course page is loaded");
    }

    public CSharpRegistrationForm openRegistrationForm() {
        LOGGER.info("We are opening Google registration form for QA course");
        baseFunctions.click(REGISTER_LINK);
        return new CSharpRegistrationForm(baseFunctions);
    }
}
