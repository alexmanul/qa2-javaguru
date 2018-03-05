package qa2.javaguru.pages;

import org.openqa.selenium.By;
import qa2.javaguru.core.BaseFunctions;

public class JavaGuruPage {

    static final By REGISTER_LINK = By.className("registrationCourse");
    static final By JAVA1_COURSE_LINK = By.xpath("(//*[contains(@class, 'menuAcourse')])[1]");
    static final By JAVA2_COURSE_LINK = By.xpath("(//*[contains(@class, 'menuAcourse')])[2]");
    static final By JAVA3_COURSE_LINK = By.xpath("(//*[contains(@class, 'menuAcourse')])[3]");
    static final By JAVA4_COURSE_LINK = By.xpath("(//*[contains(@class, 'menuAcourse')])[4]");
    static final By ANDROID_COURSE_LINK = By.xpath("(//*[contains(@class, 'menuAcourse')])[5]");
    static final By PYTHON_COURSE_LINK = By.xpath("(//*[contains(@class, 'menuAcourse')])[6]");
    static final By CSHARP_COURSE_LINK = By.xpath("(//*[contains(@class, 'menuAcourse')])[7]");
    static final By QA_COURSE_LINK = By.xpath("(//*[contains(@class, 'menuAcourse')])[8]");
    static final By PHP_COURSE_LINK = By.xpath("(//*[contains(@class, 'menuAcourse')])[9]");
    public BaseFunctions baseFunctions;
}
