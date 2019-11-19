package Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

  @RunWith(Cucumber.class)
    @CucumberOptions(features = "src/test/java/FeatureFiles/admissions.feature",
            tags={"@14"},
            glue = "StepDefenition",



              dryRun=false
    )

    public class RunnerClass {

    }