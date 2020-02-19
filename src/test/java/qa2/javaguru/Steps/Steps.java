package qa2.javaguru.Steps;

import cucumber.api.Scenario;
import cucumber.api.java.Before;
import qa2.javaguru.Pages.BasePage;
import qa2.javaguru.Pages.S100MainPage;

//import qa2.javaguru.core.BaseFunctions;

public class Steps {

    private BasePage basePage;
    //    private BaseFunctions baseFunctions = new BaseFunctions();
    private S100MainPage s100MainPage;
    private Scenario scenario;

    @Before
    public void before(Scenario scenario) {
        this.scenario = scenario;
    }
//
//    @When("I navigate to '(.+)' page")
//    public void openMainPage(final String url) {
//        baseFunctions.goToUrl(url);
////        basePage = new S100MainPage(baseFunctions);
//    }
}
//
////    @When("User opens Java 1 course")
////    public void open_java1_course_link() {
////        scenario.write("Trying to open Java1 course page");
////        java1Page = s100MainPage.openJava1Page();
////    }
////
////    @When("User opens Java 2 course")
////    public void open_java2_course_link() {
////        scenario.write("Trying to open Java2 course page");
////        java2Page = s100MainPage.openJava2Page();
////    }
////
////    @When("User opens Java 3 course")
////    public void open_java3_course_link() {
////        scenario.write("Trying to open Java3 course page");
////        java3Page = s100MainPage.openJava3Page();
////    }
////
////    @When("User opens Java 4 course")
////    public void open_java4_course_link() {
////        scenario.write("Trying to open Java4 course page");
////        java4Page = s100MainPage.openJava4Page();
////    }
////
////    @When("User opens Android course")
////    public void open_android_course_link() {
////        scenario.write("Trying to open Android course page");
////        androidPage = s100MainPage.openAndroidPage();
////    }
////
////    @When("User opens Python course")
////    public void open_python_course_link() {
////        scenario.write("Trying to open Python course page");
////        pythonPage = s100MainPage.openPythonPage();
////    }
////
////    @When("User opens C# course")
////    public void open_csharp_course_link() {
////        scenario.write("Trying to open C# course page");
////        cSharpPage = s100MainPage.openCSharpPage();
////    }
////
////    @When("User opens PHP course")
////    public void open_php_course_link() {
////        scenario.write("Trying to open PHP course page");
////        phpPage = s100MainPage.openPhpPage();
////    }
////
////    @When("User opens QA course")
////    public void open_qa_course_link() {
////        scenario.write("Trying to open QA course page");
////        qaPage = s100MainPage.openQaPage();
////    }
//
//    @When("User opens QA registration form")
//    public void open_qa_registration_form_link() {
//        scenario.write("Trying to open QA course registration form");
//        qaRegistrationForm = qaPage.openRegistrationForm();
//    }
////
////    @When("User switches tabs")
////    public void switch_tabs() {
////        baseFunctions.switchingTabs();
////    }
//
//    @When("User opens Java 1 registration form")
//    public void open_java1_registration_form_link() {
//        scenario.write("Trying to open Java1 course registration form");
//        java1RegistrationForm = java1Page.openRegistrationForm();
//    }
//
//    @When("User opens Java 2 registration form")
//    public void open_java2_registration_form_link() {
//        scenario.write("Trying to open Java2 course registration form");
//        java2RegistrationForm = java2Page.openRegistrationForm();
//    }
//
//    @When("User opens Java 3 registration form")
//    public void open_java3_registration_form_link() {
//        scenario.write("Trying to open Java3 course registration form");
//        java3RegistrationForm = java3Page.openRegistrationForm();
//    }
//
//    @When("User opens Java 4 registration form")
//    public void open_java4_registration_form_link() {
//        scenario.write("Trying to open Java4 course registration form");
//        java4RegistrationForm = java4Page.openRegistrationForm();
//    }
//
//    @When("User opens Android registration form")
//    public void open_android_registration_form_link() {
//        scenario.write("Trying to open Android course registration form");
//        androidRegistrationForm = androidPage.openRegistrationForm();
//    }
//
//    @When("User opens Python registration form")
//    public void open_python_registration_form_link() {
//        scenario.write("Trying to open Python course registration form");
//        pythonRegistrationForm = pythonPage.openRegistrationForm();
//    }
//
//    @When("User opens C# registration form")
//    public void open_csharp_registration_form_link() {
//        scenario.write("Trying to open C# course registration form");
//        cSharpRegistrationForm = cSharpPage.openRegistrationForm();
//    }
//
//    @When("User opens PHP registration form")
//    public void open_php_registration_form_link() {
//        scenario.write("Trying to open PHP course registration form");
//        phpRegistrationForm = phpPage.openRegistrationForm();
//    }
//
//    @When("User fills QA registration form with data")
//    public void fill_qa_registration_form(DataTable dataTable) {
//        List<List<String>> data = dataTable.raw();
//        baseFunctions.findElement(FIRST_NAME_FIELD).sendKeys(data.get(0).get(1));
//        baseFunctions.findElement(LAST_NAME_FIELD).sendKeys(data.get(1).get(1));
//        baseFunctions.findElement(PHONE).sendKeys(data.get(2).get(1));
//        baseFunctions.findElement(EMAIL).sendKeys(data.get(3).get(1));
//        baseFunctions.findElement(COURSE).sendKeys(data.get(4).get(1));
//        baseFunctions.findElement(PROGRAMMING_SKILLS).sendKeys(data.get(5).get(1));
//        baseFunctions.findElement(HAVING_PC).sendKeys(data.get(6).get(1));
//        baseFunctions.findElement(ADVISER).sendKeys(data.get(7).get(1));
//        baseFunctions.findElement(COMMENT).sendKeys(data.get(8).get(1));
//        baseFunctions.findElement(QARegistrationForm.DISCOUNT).sendKeys(data.get(9).get(1));
//        baseFunctions.closePages();
//    }
//
//    @When("User fills Java 1 registration form with data")
//    public void fill_java1_registration_form(DataTable dataTable) {
//        List<List<String>> data = dataTable.raw();
//        baseFunctions.findElement(FIRST_NAME_FIELD).sendKeys(data.get(0).get(1));
//        baseFunctions.findElement(LAST_NAME_FIELD).sendKeys(data.get(1).get(1));
//        baseFunctions.findElement(PHONE).sendKeys(data.get(2).get(1));
//        baseFunctions.findElement(EMAIL).sendKeys(data.get(3).get(1));
//        baseFunctions.findElement(GROUP).sendKeys(data.get(4).get(1));
//        baseFunctions.findElement(PROGRAMMING_SKILLS).sendKeys(data.get(5).get(1));
//        baseFunctions.findElement(ADVISER).sendKeys(data.get(7).get(1));
//        baseFunctions.findElement(COMMENT).sendKeys(data.get(8).get(1));
//        baseFunctions.findElement(Java1RegistrationForm.DISCOUNT).sendKeys(data.get(9).get(1));
//        baseFunctions.closePages();
//    }
//
//    @When("User fills Java 2 registration form with data")
//    public void fill_java2_registration_form(DataTable dataTable) {
//        List<List<String>> data = dataTable.raw();
//        baseFunctions.findElement(FIRST_NAME_FIELD).sendKeys(data.get(0).get(1));
//        baseFunctions.findElement(Java2RegistrationForm.LAST_NAME_FIELD).sendKeys(data.get(1).get(1));
//        baseFunctions.findElement(Java2RegistrationForm.PHONE).sendKeys(data.get(2).get(1));
//        baseFunctions.findElement(Java2RegistrationForm.EMAIL).sendKeys(data.get(3).get(1));
//        baseFunctions.findElement(Java2RegistrationForm.DISCOUNT).sendKeys(data.get(4).get(1));
//        baseFunctions.closePages();
//    }
//
//    @When("User fills Java 3 registration form with data")
//    public void fill_java3_registration_form(DataTable dataTable) {
//        List<List<String>> data = dataTable.raw();
//        baseFunctions.findElement(FIRST_NAME_FIELD).sendKeys(data.get(0).get(1));
//        baseFunctions.findElement(LAST_NAME_FIELD).sendKeys(data.get(1).get(1));
//        baseFunctions.findElement(PHONE).sendKeys(data.get(2).get(1));
//        baseFunctions.findElement(EMAIL).sendKeys(data.get(3).get(1));
//        baseFunctions.findElement(PROGRAMMING_SKILLS).sendKeys(data.get(4).get(1));
//        baseFunctions.findElement(COMMENT).sendKeys(data.get(5).get(1));
//        baseFunctions.findElement(Java3RegistrationForm.DISCOUNT).sendKeys(data.get(6).get(1));
//        baseFunctions.closePages();
//    }
//
//    @When("User fills Java 4 registration form with data")
//    public void fill_java4_registration_form(DataTable dataTable) {
//        List<List<String>> data = dataTable.raw();
//        baseFunctions.findElement(FIRST_NAME_FIELD).sendKeys(data.get(0).get(1));
//        baseFunctions.findElement(LAST_NAME_FIELD).sendKeys(data.get(1).get(1));
//        baseFunctions.findElement(PHONE).sendKeys(data.get(2).get(1));
//        baseFunctions.findElement(EMAIL).sendKeys(data.get(3).get(1));
//        baseFunctions.findElement(PROGRAMMING_SKILLS).sendKeys(data.get(4).get(1));
//        baseFunctions.findElement(COMMENT).sendKeys(data.get(5).get(1));
//        baseFunctions.findElement(Java4RegistrationForm.DISCOUNT).sendKeys(data.get(6).get(1));
//        baseFunctions.closePages();
//    }
//
//    @When("User fills Python registration form with data")
//    public void fill_python_registration_form(DataTable dataTable) {
//        List<List<String>> data = dataTable.raw();
//        baseFunctions.findElement(FIRST_NAME_FIELD).sendKeys(data.get(0).get(1));
//        baseFunctions.findElement(LAST_NAME_FIELD).sendKeys(data.get(1).get(1));
//        baseFunctions.findElement(PHONE).sendKeys(data.get(2).get(1));
//        baseFunctions.findElement(EMAIL).sendKeys(data.get(3).get(1));
//        baseFunctions.findElement(PROGRAMMING_SKILLS).sendKeys(data.get(4).get(1));
//        baseFunctions.findElement(COMMENT).sendKeys(data.get(5).get(1));
//        baseFunctions.findElement(PythonRegistrationForm.DISCOUNT).sendKeys(data.get(6).get(1));
//        baseFunctions.closePages();
//    }
//
//    @When("User fills C# registration form with data")
//    public void fill_csharp_registration_form(DataTable dataTable) {
//        List<List<String>> data = dataTable.raw();
//        baseFunctions.findElement(FIRST_NAME_FIELD).sendKeys(data.get(0).get(1));
//        baseFunctions.findElement(LAST_NAME_FIELD).sendKeys(data.get(1).get(1));
//        baseFunctions.findElement(PHONE).sendKeys(data.get(2).get(1));
//        baseFunctions.findElement(EMAIL).sendKeys(data.get(3).get(1));
//        baseFunctions.findElement(PROGRAMMING_SKILLS).sendKeys(data.get(4).get(1));
//        baseFunctions.findElement(COMMENT).sendKeys(data.get(5).get(1));
//        baseFunctions.findElement(CSharpRegistrationForm.DISCOUNT).sendKeys(data.get(6).get(1));
//        baseFunctions.closePages();
//    }
//
//     @When("User fills Android registration form with data")
//    public void fill_android_registration_form(DataTable dataTable) {
//        List<List<String>> data = dataTable.raw();
//        baseFunctions.findElement(FIRST_NAME_FIELD).sendKeys(data.get(0).get(1));
//        baseFunctions.findElement(LAST_NAME_FIELD).sendKeys(data.get(1).get(1));
//        baseFunctions.findElement(PHONE).sendKeys(data.get(2).get(1));
//        baseFunctions.findElement(EMAIL).sendKeys(data.get(3).get(1));
//        baseFunctions.findElement(PROGRAMMING_SKILLS).sendKeys(data.get(4).get(1));
//        baseFunctions.findElement(COMMENT).sendKeys(data.get(5).get(1));
//        baseFunctions.findElement(AndroidRegistrationForm.DISCOUNT).sendKeys(data.get(6).get(1));
//        baseFunctions.closePages();
//    }
//
//    @When("User fills PHP registration form with data")
//    public void fill_php_registration_form(DataTable dataTable) {
//        List<List<String>> data = dataTable.raw();
//        baseFunctions.findElement(FIRST_NAME_FIELD).sendKeys(data.get(0).get(1));
//        baseFunctions.findElement(LAST_NAME_FIELD).sendKeys(data.get(1).get(1));
//        baseFunctions.findElement(PHONE).sendKeys(data.get(2).get(1));
//        baseFunctions.findElement(EMAIL).sendKeys(data.get(3).get(1));
//        baseFunctions.findElement(PROGRAMMING_SKILLS).sendKeys(data.get(4).get(1));
//        baseFunctions.findElement(HAVING_PC).sendKeys(data.get(5).get(1));
//        baseFunctions.findElement(ADVISER).sendKeys(data.get(6).get(1));
//        baseFunctions.findElement(COMMENT).sendKeys(data.get(7).get(1));
//        baseFunctions.closePages();
//    }
//}