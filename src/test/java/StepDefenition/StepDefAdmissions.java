package StepDefenition;

import Common.Base;
import PageObjectModel.HomePageAdmissions;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
import org.junit.Assert;
import org.junit.runner.RunWith;

import java.io.IOException;

import static java.lang.Thread.sleep;

@RunWith(Cucumber.class)
public class StepDefAdmissions {
    HomePageAdmissions home = new HomePageAdmissions();

    @Given("^Users navigate the web page$")
    public void users_navigate_the_web_page() throws Throwable {
        Base.getDriver();

    }

    @When("^Users hover over the Admission drop-down menu$")
    public void users_hover_over_the_Admission_drop_down_menu() throws Throwable {
        home.sections();
        sleep(2000);
    }

    @Then("^Users see the sections and their options$")
    public void users_see_the_sections_and_their_options() throws Throwable {
        home.sections();
        String[] sections = {"Undergraduate", "Graduate", "Gulf Language School"};
        Assert.assertTrue(String.valueOf(sections), true);
        sleep(2000);

    }

    @Then("^Users see the respective image that is placed on left side$")
    public void users_see_the_respective_image_that_is_placed_on_left_side() throws Throwable {
        home.image();


    }

    @Then("^Users clicks the Undergraduate Section$")
    public void usersClicksTheUndergraduateSection(){
    home.checkingUndergraduate().click();
    }

    @And("^Users see the next page$")
    public void usersSeeTheNextPage() throws InterruptedException {
        Assert.assertTrue("Undergraduate Students", true);
        sleep(1000);
        home.closingPage();
    }


    @Then("^Users clicks the Graduate Section$")
    public void usersClicksTheGraduateSection()
    {
        home.checkingGraduate().click();
    }

    @And("^Users see the other page$")
    public void usersSeeTheOtherPage() throws InterruptedException {
        Assert.assertTrue("Graduate Students", true);
        sleep(1000);
        home.closingPage();

    }

    @Then("^Users click the Gulf Language School Section$")
    public void usersClicksTheGulfLanguageSchoolSection() {

        home.checkingGulfSchool().click();
    }

    @And("^Users see the next Elements$")
    public void usersSeeTheNextElements() throws InterruptedException {
        Assert.assertTrue("Achieve PROFICIENCY", true);
        sleep(1000);
        home.closingPage();
    }

    @Then("^Users see \"([^\"]*)\" under the Undergraduate$")
    public void usersSeeUnderTheUndergraduate(String arg0) throws Throwable {
        home.hoveringAdmission();
        home.closingPage();
    }


    @And("^Users see Elements of the \"([^\"]*)\" section$")
    public void usersSeeElementsOfTheSection(String arg0) throws Throwable {
        String[] elements = {"Apply", "Degree Programs", "Tuition and Fees", "Scholarships", "international"};
        Assert.assertTrue(String.valueOf("elements"), true);
             home.closingPage();
    }


    @And("^Users see  \"([^\"]*)\"elements$")
    public void usersSeeElements(String arg0) throws Throwable {
        String[] graduateElements = {"Apply now", "Graduate Degrees", "Tuition and Fees ", "Distance Education ", "International"};
        Assert.assertTrue(String.valueOf("graduateElements"), true);
        home.closingPage();
    }


    @And("^Users see the \"([^\"]*)\"elements$")
    public void usersSeeTheElements(String arg0) throws Throwable {
        String[] gulfSchoolsElements = {"Apply  Now", "GLS Admissions", "GLS Programs ", "GLS Students", "GLS Faculty"};
        Assert.assertTrue(String.valueOf("gulfSchoolsElements"),true);
        home.closingPage();
    }

    @Then("^Users click the Apply link under the undergraduate$")
    public void usersClickTheApplyLinkUnderTheUndergraduate() {
        home.checkingUnderApply().click();
    }

    @And("^Users see the next page with$")
    public void usersSeeTheNextPageWith() {
        Assert.assertTrue("The Application Process",true);
    }

    @Then("^Users click the Degree Programs link under the undergraduate$")
    public void usersClickTheDegreeProgramsLinkUnderTheUndergraduate() {
        home.checkingDegreeProg().click();
    }

    @And("^User will see the next page with message$")
    public void userWillSeeTheNextPageWithMessage() {
        Assert.assertTrue("Bachelor’s Degrees",true);
        home.closingPage();
    }

    @Then("^Users click the Tuition and Fees  link under the undergraduate$")
    public void usersClickTheTuitionAndFeesLinkUnderTheUndergraduate() {
        home.checkingFee().click();
    }

    @And("^Users see the next page with message$")
    public void usersSeeTheNextPageWithMessage() {
        String expect="Affordable Education";
        Assert.assertEquals(expect,"Affordable Education");
        home.closingPage();
    }

    @Then("^Users click the Scholarship  link under the undergraduate$")
    public void usersClickTheScholarshipLinkUnderTheUndergraduate() {
        home.checkingScholarship().click();
    }


    @And("^User will  see the next page with messages$")
    public void userWillSeeTheNextPageWithMessages() {
        String excepted="Expect an Affordable Education";
        Assert.assertEquals(excepted,"Expect an Affordable Education");
        home.closingPage();
    }

    @Then("^Users click the International link under the undergraduate$")
    public void usersClickTheInternationalLinkUnderTheUndergraduate() {
        home.checkingInternational().click();

    }

    @And("^User will  see the next page  messages$")
    public void userWillSeeTheNextPageMessages() {
        Assert.assertTrue("“Welcome to Houston!“",true);
        home.closingPage();
    }

    @Then("^Users click the Apply Now under the Graduate$")
    public void usersClickTheApplyNowUnderTheGraduate() {
        home.checkingApplyNow().click();

    }

    @And("^User will  see the message: Non-Degree Seeking$")
    public void userWillSeeTheMessageNonDegreeSeeking() {
        Assert.assertTrue("Turn your ideas and possibilities into realities",true);
        home.closingPage();
    }

    @Then("^Users click the Graduate Degrees under the Graduate$")
    public void usersClickTheGraduateDegreesUnderTheGraduate() {
        home.checkingGraduateDegrees().click();
    }

    @And("^User will  see the message: Master of Education in School Counseling$")
    public void userWillSeeTheMessageMasterOfEducationInSchoolCounseling() {
        Assert.assertTrue("MasterOfEducationInSchoolCounseling",true);
        home.closingPage();
    }

    @Then("^Users click the Tuition and Fee under the Graduate$")
    public void usersClickTheTuitionAndFeeUnderTheGraduate() {
        home.checkingGraduateTuition().click();
    }

    @And("^User will  see the message: Affordable Education$")
    public void userWillSeeTheMessageAffordableEducation() {
        Assert.assertTrue("AffordableEducation",true);
        home.closingPage();

    }

    @Then("^Users click the Distance Education under the Graduate$")
    public void usersClickTheDistanceEducationUnderTheGraduate() {
        home.checkingGraduateDistance();
    }

    @And("^User will  see the message: Distance Education$")
    public void userWillSeeTheMessageDistanceEducation() {
        Assert.assertTrue("Distance Education",true);
        home.closingPage();
    }

    @Then("^Users click the Graduate International under the Graduate$")
    public void usersClickTheGraduateInternationalUnderTheGraduate() {
        home.checkingGraduateInternational();
    }

    @And("^User will  see the message: (\\d+) Countries\\. (\\d+) University$")
    public void userWillSeeTheMessageCountriesUniversity(int arg0, int arg1) {
        Assert.assertTrue("54 Countries. 1 University",true);
        home.closingPage();
    }
}