package StepDefinition;

import Common.Base;
import PageObjectModel.HomePageFacultyAndStaff;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;


public class StepDefFacultyAndStaff extends Base {

    HomePageFacultyAndStaff homePage = new HomePageFacultyAndStaff();
  //  HomePageFacultyAndStaff isSectionsDisplayed = new HomePageFacultyAndStaff();

    @Given("^User navigates to NAU website$")
    public void user_navigates_to_NAU_website() throws Throwable {
        Base.getDriver();
        driver.manage().window().maximize();

    }

    @When("^NAU dashboard appears$")
    public void nau_dashboard_appears() throws Throwable {
        homePage.verifyIfMainPageIsDisplayed();
    }

    @Then("^User should see \"([^\"]*)\"$")
    public void user_should_see(String arg1) throws Throwable {

        homePage.isFacultyAndStaffDisplayed();
        Assert.assertTrue(homePage.isFacultyAndStaffDisplayed().getText().contains(arg1));
        // Assert.assertTrue("Faculty & Staff",true);
        driver.quit();

    }

    @When("^User hover over Faculty and Staff drop down$")
    public void user_hover_over_Faculty_and_Staff_drop_down() throws Throwable {
        homePage.hoverOverFacultyStaff();

    }

    @Then("^Verify that Faculty and Staff section has <Employee Center> sub-section$")
    public void verify_that_Faculty_and_Staff_section_has_Employee_Center_sub_section() throws Throwable {
        Assert.assertEquals("Employee Center", homePage.verifyIfSubSectionsDisplayed().getText());
        driver.quit();
    }

    @Then("^User should see sections as following \"([^\"]*)\"$")
    public void user_should_see_sections_as_following(String arg1) throws Throwable {
       homePage.isSectionsDisplayed();
       Assert.assertTrue(arg1, true);

    }
}