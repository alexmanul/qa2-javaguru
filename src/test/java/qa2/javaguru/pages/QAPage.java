package qa2.javaguru.pages;

import org.apache.log4j.Logger;
import qa2.javaguru.core.BaseFunctions;
import qa2.javaguru.forms.QARegistrationForm;

public class QAPage extends JavaGuruPage {

    private static final Logger LOGGER = Logger.getLogger(QAPage.class);

    QAPage(BaseFunctions baseFunctions) {
        this.baseFunctions = baseFunctions;
        LOGGER.info("QA course page is loaded");
    }

    public QARegistrationForm openRegistrationForm() {
        LOGGER.info("We are opening Google registration form for QA course");
        baseFunctions.click(REGISTER_LINK);
        return new QARegistrationForm(baseFunctions);
    }
}
