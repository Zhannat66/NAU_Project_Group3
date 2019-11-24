package Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

    @RunWith(Cucumber.class)
    @CucumberOptions(features = "src/test/java/FeatureFiles/campuslife.feature",tags = {"@SwitchTo"},
                     glue = "StepDefenition")

    public class RunnerClass {

    }
//tags = {"@Housing"},