package qa2.javaguru;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/",
        tags = {"@QA"})
public class FeatureRunner {

    public static void main(String[] args) {

    }
}
