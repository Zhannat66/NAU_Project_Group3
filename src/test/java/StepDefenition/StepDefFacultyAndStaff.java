package StepDefenition;

import Common.Base;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefFacultyAndStaff {
    @Given("^User navigates to NAU website$")
    public void user_navigates_to_NAU_website() throws Throwable {
        Base.getDriver();
    }

    @When("^NAU dashboard appears$")
    public void nau_dashboard_appears() throws Throwable {

    }

    @Then("^User should see following \"([^\"]*)\"$")
    public void user_should_see_following(String arg1) throws Throwable {

    }
}


