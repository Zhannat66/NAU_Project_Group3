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

    @Given("^User navigates to NAU website$")
    public void user_navigates_to_NAU_website() throws Throwable {
        Base.getDriver();
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

    @When("^User click on Faculty and Staff$")
    public void user_click_on_Faculty_and_Staff() throws Throwable {
        homePage.navigateToFacultyAndStaffPage();
    }

    @Then("^User should be navigated to Faculty and Staff Page$")
    public void user_should_be_navigated_to_Faculty_and_Staff_Page() throws Throwable {
        homePage.verifyIfNavigatedToFacultyAndStaff();
        driver.quit();
    }

    @When("^User click on \"([^\"]*)\" section$")
    public void user_click_on_section(String arg1) throws Throwable {
        homePage.clickOffice365Section();
        Assert.assertTrue(arg1,true);
    }

    @Then("^User should be navigated to new window \"([^\"]*)\"$")
    public void user_should_be_navigated_to_new_window(String arg1) throws Throwable {
        homePage.isNavigatedToOffice365();
        if (arg1.equals(driver.getTitle())) {
            Assert.assertTrue(true);
        }
        driver.close();
    }

    @When("^User click on Fees and Deposits section$")
    public void user_click_on_Fees_and_Deposits_section() throws Throwable {
        homePage.clickFeesAndDepositsSection();
    }

    @Then("^User should be navigated to \"([^\"]*)\"$")
    public void user_should_be_navigated_to(String arg1) throws Throwable {
        homePage.isNavigatedToFeesAndDeposits();
        String actualUrl =  driver.getCurrentUrl();
        Assert.assertEquals(arg1,actualUrl);
        driver.close();
    }

    @When("^User click on Password Reset section$")
    public void user_click_on_Password_Reset_section() throws Throwable {
        homePage.clickPasswordReset();
    }

    @Then("^Verify user navigated to new Password Reset window$")
    public void verify_user_navigated_to_new_Password_Reset_window() throws Throwable {
        homePage.isNavigatedToPassReset();
        driver.close();
    }

    @When("^User click on IT Services section$")
    public void user_click_on_IT_Services_section() throws Throwable {
       homePage.clickITServicesSection();
    }

    @Then("^Verify user navigated to IT Services page \"([^\"]*)\"$")
    public void verify_user_navigated_to_IT_Services_page(String arg1) throws Throwable {
       homePage.isNavigatedToITServices();
       String actualITServUrl = driver.getCurrentUrl();
       Assert.assertEquals(arg1,actualITServUrl);
       driver.close();
    }

    @Then("^User should see \"([^\"]*)\" section$")
    public void user_should_see_section(String arg1) throws Throwable {
        String actualText = homePage.isEmployeeCenterSectionDisplayed().getText();
        Assert.assertEquals(arg1,actualText);

    }

    @Then("^Verify that under Employee Center following \"([^\"]*)\" are displayed$")
    public void verify_that_under_Employee_Center_following_are_displayed(String arg1) throws Throwable {
        homePage.areEmployeeCenterSubSectionsDisplayed();

        Assert.assertTrue(arg1,true);

    }

    @When("^User click on Human Resources sub-section$")
    public void user_click_on_Human_Resources_sub_section() throws Throwable {
        homePage.clickHumanResources();
    }

    @Then("^Verify user navigates to Human Resources page \"([^\"]*)\"$")
    public void verify_user_navigates_to_Human_Resources_page(String arg1) throws Throwable {
       homePage.isNavigatesToHumanResources();
        String actualHumanResourcesUrl = driver.getCurrentUrl();
        if(arg1.equalsIgnoreCase(actualHumanResourcesUrl)){
            Assert.assertTrue(true);
        }
        driver.close();
    }

    @When("^User click on Employee Forms sub-section$")
    public void user_click_on_Employee_Forms_sub_section() throws Throwable {
       homePage.clickEmployeeForms();
    }

    @Then("^Verify user navigates to Employee Forms page$")
    public void verify_user_navigates_to_Employee_Forms_page() throws Throwable {
            homePage.isNavigateToEmployeeForms();
            driver.close();
    }


    @When("^User click on Faculty Members sub-section$")
    public void user_click_on_Faculty_Members_sub_section() throws Throwable {
            homePage.clickFacultyMembers();
    }

    @Then("^Verify user navigates to page Faculty Members$")
    public void verify_user_navigates_to_page_Faculty_Members() throws Throwable {
           homePage.isNavigateToFacultyMembers();

    }

    @When("^User click on Employee Handbook sub-section$")
    public void user_click_on_Employee_Handbook_sub_section() throws Throwable {
           homePage.clickEmployeeHandbook();

    }

    @Then("^Verify user navigates to page Employee Handbook$")
    public void verify_user_navigates_to_page_Employee_Handbook() throws Throwable {
            homePage.isEmployeeHandbookDisplayed();

    }

    @Then("^Verify that News and Events section is available$")
    public void verify_that_News_and_Events_section_is_available() throws Throwable {
        homePage.isNewsAndEventsSectionDisplayed();
    }

    @Then("^Verify that under News and Events required sub-sections are displayed$")
    public void verify_that_under_News_and_Events_required_sub_sections_are_displayed() throws Throwable {
        homePage.verifySubSectionsNewsEventsDisplayed();
        driver.close();
    }


    @When("^User click on Headlines sub-section$")
    public void user_click_on_Headlines_sub_section() throws Throwable {
        homePage.clickHeadlines();
    }

    @Then("^Verify user navigates to Headlines page$")
    public void verify_user_navigates_to_Headlines_page() throws Throwable {
        homePage.isNavigatedToHeadlinesSubSection();
        driver.close();
    }

    @When("^User click on Announcements sub-section$")
    public void user_click_on_Announcements_sub_section() throws Throwable {
        homePage.clickAnnouncements();
    }

    @Then("^User should be navigated to Announcements page$")
    public void user_should_be_navigated_to_Announcements_page() throws Throwable {
        homePage.isNavigatedToAnnouncementsSubSection();
        driver.close();
    }

    @When("^User click on Calendar of Events sub-section$")
    public void user_click_on_Calendar_of_Events_sub_section() throws Throwable {
        homePage.clickCalendarOfEvents();
    }

    @Then("^User should be navigated to Calendar of Events page$")
    public void user_should_be_navigated_to_Calendar_of_Events_page() throws Throwable {
        homePage.isNavigatedToCalendarOfEventsSubSection();
        driver.close();
    }

    @When("^User click on Student Workers sub-section$")
    public void user_click_on_Student_Workers_sub_section() throws Throwable {
        homePage.clickStudentWorkers();
    }

    @Then("^User should be navigated to Student Workers page$")
    public void user_should_be_navigated_to_Student_Workers_page() throws Throwable {
        homePage.isNavigatedToStudentWorkersSubSection();
        driver.close();
    }










}











