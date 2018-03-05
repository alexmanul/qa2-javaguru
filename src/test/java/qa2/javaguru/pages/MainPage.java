package qa2.javaguru.pages;

import org.apache.log4j.Logger;
import qa2.javaguru.core.BaseFunctions;
import qa2.javaguru.forms.Java1RegistrationForm;

public class MainPage extends JavaGuruPage {

    private static final Logger LOGGER = Logger.getLogger(MainPage.class);

    public MainPage(BaseFunctions baseFunctions) {
        this.baseFunctions = baseFunctions;
        LOGGER.info("Main Page is loaded");
    }

    public Java1RegistrationForm openRegistrationForm() {
        LOGGER.info("We are opening registration page");
        baseFunctions.click(REGISTER_LINK);
        return new Java1RegistrationForm(baseFunctions);
    }

    public Java1Page openJava1Page() {
        LOGGER.info("We are opening Java 1 course page");
        baseFunctions.click(JAVA1_COURSE_LINK);
        return new Java1Page(baseFunctions);
    }

    public Java2Page openJava2Page() {
        LOGGER.info("We are opening Java 2 course page");
        baseFunctions.click(JAVA2_COURSE_LINK);
        return new Java2Page(baseFunctions);
    }

    public Java3Page openJava3Page() {
        LOGGER.info("We are opening Java 3 course page");
        baseFunctions.click(JAVA3_COURSE_LINK);
        return new Java3Page(baseFunctions);
    }

    public Java4Page openJava4Page() {
        LOGGER.info("We are opening Java 4 course page");
        baseFunctions.click(JAVA4_COURSE_LINK);
        return new Java4Page(baseFunctions);
    }

    public AndroidPage openAndroidPage() {
        LOGGER.info("We are opening Android course page");
        baseFunctions.click(ANDROID_COURSE_LINK);
        return new AndroidPage(baseFunctions);
    }

    public PythonPage openPythonPage() {
        LOGGER.info("We are opening Python course page");
        baseFunctions.click(PYTHON_COURSE_LINK);
        return new PythonPage(baseFunctions);
    }

    public CSharpPage openCSharpPage() {
        LOGGER.info("We are opening Java 2 course page");
        baseFunctions.click(CSHARP_COURSE_LINK);
        return new CSharpPage(baseFunctions);
    }

    public QAPage openQaPage() {
        LOGGER.info("We are opening QA course page");
        baseFunctions.click(QA_COURSE_LINK);
        return new QAPage(baseFunctions);
    }

    public PhpPage openPhpPage() {
        LOGGER.info("We are opening PHP course page");
        baseFunctions.click(PHP_COURSE_LINK);
        return new PhpPage(baseFunctions);
    }

}
