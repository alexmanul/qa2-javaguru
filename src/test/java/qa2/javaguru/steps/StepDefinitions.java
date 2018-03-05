package qa2.javaguru.steps;

import cucumber.api.DataTable;
import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import qa2.javaguru.core.BaseFunctions;
import qa2.javaguru.forms.*;
import qa2.javaguru.pages.*;

import java.util.List;

import static qa2.javaguru.forms.Java1RegistrationForm.GROUP;
import static qa2.javaguru.forms.QARegistrationForm.ADVISER;
import static qa2.javaguru.forms.QARegistrationForm.*;
import static qa2.javaguru.forms.RegistrationForm.COMMENT;
import static qa2.javaguru.forms.RegistrationForm.EMAIL;
import static qa2.javaguru.forms.RegistrationForm.FIRST_NAME_FIELD;
import static qa2.javaguru.forms.RegistrationForm.LAST_NAME_FIELD;
import static qa2.javaguru.forms.RegistrationForm.PHONE;
import static qa2.javaguru.forms.RegistrationForm.PROGRAMMING_SKILLS;

public class StepDefinitions {

    private BaseFunctions baseFunctions = new BaseFunctions();
    private Java1Page java1Page;
    private Java2Page java2Page;
    private Java3Page java3Page;
    private Java4Page java4Page;
    private AndroidPage androidPage;
    private PythonPage pythonPage;
    private CSharpPage cSharpPage;
    private QAPage qaPage;
    private PhpPage phpPage;
    private Java1RegistrationForm java1RegistrationForm;
    private Java2RegistrationForm java2RegistrationForm;
    private Java3RegistrationForm java3RegistrationForm;
    private Java4RegistrationForm java4RegistrationForm;
    private AndroidRegistrationForm androidRegistrationForm;
    private PythonRegistrationForm pythonRegistrationForm;
    private CSharpRegistrationForm cSharpRegistrationForm;
    private QARegistrationForm qaRegistrationForm;
    private PhpRegistrationForm phpRegistrationForm;
    private MainPage mainPage;
    private Scenario scenario;

    @Before
    public void before(Scenario scenario) {
        this.scenario = scenario;
    }

    @Given("User is on the '(.+)' page")
    public void open_main_page(final String url) {
        baseFunctions.goToUrl(url);
        mainPage = new MainPage(baseFunctions);
    }

    @When("User opens Java 1 course")
    public void open_java1_course_link() {
        scenario.write("Trying to open Java1 course page");
        java1Page = mainPage.openJava1Page();
    }

    @When("User opens Java 2 course")
    public void open_java2_course_link() {
        scenario.write("Trying to open Java2 course page");
        java2Page = mainPage.openJava2Page();
    }

    @When("User opens Java 3 course")
    public void open_java3_course_link() {
        scenario.write("Trying to open Java3 course page");
        java3Page = mainPage.openJava3Page();
    }

    @When("User opens Java 4 course")
    public void open_java4_course_link() {
        scenario.write("Trying to open Java4 course page");
        java4Page = mainPage.openJava4Page();
    }

    @When("User opens Android course")
    public void open_android_course_link() {
        scenario.write("Trying to open Android course page");
        androidPage = mainPage.openAndroidPage();
    }

    @When("User opens Python course")
    public void open_python_course_link() {
        scenario.write("Trying to open Python course page");
        pythonPage = mainPage.openPythonPage();
    }

    @When("User opens C# course")
    public void open_csharp_course_link() {
        scenario.write("Trying to open C# course page");
        cSharpPage = mainPage.openCSharpPage();
    }

    @When("User opens PHP course")
    public void open_php_course_link() {
        scenario.write("Trying to open PHP course page");
        phpPage = mainPage.openPhpPage();
    }

    @When("User opens Java 1 registration form")
    public void open_java1_registration_form_link() {
        scenario.write("Trying to open Java1 course registration form");
        java1RegistrationForm = java1Page.openRegistrationForm();
    }

    @When("User opens Java 2 registration form")
    public void open_java2_registration_form_link() {
        scenario.write("Trying to open Java2 course registration form");
        java2RegistrationForm = java2Page.openRegistrationForm();
    }

    @When("User opens Java 3 registration form")
    public void open_java3_registration_form_link() {
        scenario.write("Trying to open Java3 course registration form");
        java3RegistrationForm = java3Page.openRegistrationForm();
    }

    @When("User opens Java 4 registration form")
    public void open_java4_registration_form_link() {
        scenario.write("Trying to open Java4 course registration form");
        java4RegistrationForm = java4Page.openRegistrationForm();
    }

    @When("User opens Android registration form")
    public void open_android_registration_form_link() {
        scenario.write("Trying to open Android course registration form");
        androidRegistrationForm = androidPage.openRegistrationForm();
    }

    @When("User opens Python registration form")
    public void open_python_registration_form_link() {
        scenario.write("Trying to open Python course registration form");
        pythonRegistrationForm = pythonPage.openRegistrationForm();
    }

    @When("User opens C# registration form")
    public void open_csharp_registration_form_link() {
        scenario.write("Trying to open C# course registration form");
        cSharpRegistrationForm = cSharpPage.openRegistrationForm();
    }

    @When("User switches tabs")
    public void switch_tabs() {
        baseFunctions.switchingTabs();
    }

    @When("User opens PHP registration form")
    public void open_php_registration_form_link() {
        scenario.write("Trying to open PHP course registration form");
        phpRegistrationForm = phpPage.openRegistrationForm();
    }

    @When("User opens QA course")
    public void open_qa_course_link() {
        scenario.write("Trying to open QA course page");
        qaPage = mainPage.openQaPage();
    }

    @When("User opens QA registration form")
    public void open_qa_registration_form_link() {
        scenario.write("Trying to open QA course registration form");
        qaRegistrationForm = qaPage.openRegistrationForm();
    }

    @When("User fills QA registration form with data")
    public void fill_qa_registration_form(DataTable dataTable) {
        List<List<String>> data = dataTable.raw();
        baseFunctions.findElement(FIRST_NAME_FIELD).sendKeys(data.get(0).get(1));
        baseFunctions.findElement(LAST_NAME_FIELD).sendKeys(data.get(1).get(1));
        baseFunctions.findElement(PHONE).sendKeys(data.get(2).get(1));
        baseFunctions.findElement(EMAIL).sendKeys(data.get(3).get(1));
        baseFunctions.findElement(COURSE).sendKeys(data.get(4).get(1));
        baseFunctions.findElement(PROGRAMMING_SKILLS).sendKeys(data.get(5).get(1));
        baseFunctions.findElement(HAVING_PC).sendKeys(data.get(6).get(1));
        baseFunctions.findElement(ADVISER).sendKeys(data.get(7).get(1));
        baseFunctions.findElement(COMMENT).sendKeys(data.get(8).get(1));
        baseFunctions.findElement(QARegistrationForm.DISCOUNT).sendKeys(data.get(9).get(1));
        baseFunctions.closePages();
    }

    @When("User fills Java 1 registration form with data")
    public void fill_java1_registration_form(DataTable dataTable) {
        List<List<String>> data = dataTable.raw();
        baseFunctions.findElement(FIRST_NAME_FIELD).sendKeys(data.get(0).get(1));
        baseFunctions.findElement(LAST_NAME_FIELD).sendKeys(data.get(1).get(1));
        baseFunctions.findElement(PHONE).sendKeys(data.get(2).get(1));
        baseFunctions.findElement(EMAIL).sendKeys(data.get(3).get(1));
        baseFunctions.findElement(GROUP).sendKeys(data.get(4).get(1));
        baseFunctions.findElement(PROGRAMMING_SKILLS).sendKeys(data.get(5).get(1));
        baseFunctions.findElement(ADVISER).sendKeys(data.get(7).get(1));
        baseFunctions.findElement(COMMENT).sendKeys(data.get(8).get(1));
        baseFunctions.findElement(Java1RegistrationForm.DISCOUNT).sendKeys(data.get(9).get(1));
        baseFunctions.closePages();
    }

    @When("User fills Python registration form with data")
    public void fill_python_registration_form(DataTable dataTable) {
        List<List<String>> data = dataTable.raw();
        baseFunctions.findElement(FIRST_NAME_FIELD).sendKeys(data.get(0).get(1));
        baseFunctions.findElement(LAST_NAME_FIELD).sendKeys(data.get(1).get(1));
        baseFunctions.findElement(PHONE).sendKeys(data.get(2).get(1));
        baseFunctions.findElement(EMAIL).sendKeys(data.get(3).get(1));
        baseFunctions.findElement(PROGRAMMING_SKILLS).sendKeys(data.get(4).get(1));
        baseFunctions.findElement(COMMENT).sendKeys(data.get(5).get(1));
        baseFunctions.findElement(PythonRegistrationForm.DISCOUNT).sendKeys(data.get(6).get(1));
        baseFunctions.closePages();
    }

    @When("User fills C# registration form with data")
    public void fill_csharp_registration_form(DataTable dataTable) {
        List<List<String>> data = dataTable.raw();
        baseFunctions.findElement(FIRST_NAME_FIELD).sendKeys(data.get(0).get(1));
        baseFunctions.findElement(LAST_NAME_FIELD).sendKeys(data.get(1).get(1));
        baseFunctions.findElement(PHONE).sendKeys(data.get(2).get(1));
        baseFunctions.findElement(EMAIL).sendKeys(data.get(3).get(1));
        baseFunctions.findElement(PROGRAMMING_SKILLS).sendKeys(data.get(4).get(1));
        baseFunctions.findElement(COMMENT).sendKeys(data.get(5).get(1));
        baseFunctions.findElement(PythonRegistrationForm.DISCOUNT).sendKeys(data.get(6).get(1));
        baseFunctions.closePages();
    }
}