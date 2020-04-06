package Runners;//@RunWith(Cucumber.class)
//@CucumberOptions(plugin = {"pretty","io.qameta.allure.cucumber4jvm.AllureCucumber4Jvm"},
////@CucumberOptions(plugin = {"pretty",},
//        features = {"src/test/resources/features"},
////        glue = {"lv/testdevlab/task/steps"},
//        glue = {"C:\\Users\\Manul\\IdeaProjects\\qa2-javaguru\\src\\test\\java\\Steps"},
//        tags = {"@SmokeTest"}
//)
//public class TestRunner {
//}

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "html:target/cucumber", "json:target/cucumber-report.json"},
        strict = true,
        features = "classpath:features",
        glue = "steps",
//        tags = "@all"
        tags = "@SmokeTest"
)
public class DefaultTestRunner extends AbstractTestRunner {
}