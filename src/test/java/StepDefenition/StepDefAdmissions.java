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
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.management.StringValueExp;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static Common.Base.driver;

import static java.lang.Thread.sleep;

@RunWith(Cucumber.class)
public class StepDefAdmissions {
    HomePageAdmissions home;

    {
        home = new HomePageAdmissions();
    }

    @Given("^Users navigate the web page$")
    public void users_navigate_the_web_page() throws Throwable {
        Base.getDriver();
    }
    @When("^Users hover over the Admission drop-down menu$")
    public void users_hover_over_the_Admission_drop_down_menu() throws Throwable {
        home.sections();
        sleep(2000);
    }

    @Then("^Users see the sections and  \"([^\"]*)\"$")
    public void usersSeeTheSectionsAnd(String options) throws Throwable {
      String sub_sectionsOfAdmission=  driver.findElement(By.xpath("//span[@class ='ubermenu-target-title ubermenu-target-text' and contains(text(), '"+options+"')]")).getText();
      Assert.assertEquals(options,sub_sectionsOfAdmission);
        home.sections();

        sleep(2000);
    }

    @Then("^Users see the respective image that is placed on left side$")
    public void users_see_the_respective_image_that_is_placed_on_left_side() throws Throwable {
        home.image();
    }

    @Then("^Users clicks the Undergraduate Section$")
    public void usersClicksTheUndergraduateSection(){
         WebElement actualImage=driver.findElement( By.xpath("//*[@id='menu-item-1758']/div/img"));
         boolean logoPresent = actualImage.isDisplayed();
        Assert.assertTrue(logoPresent);
        home.checkingUndergraduate().click();
    }

    @And("^Users see the next page$")
    public void usersSeeTheNextPage() throws InterruptedException {

        String expected = "QUICK LINKS";
       String actual = driver.findElement(By.xpath("//p[contains(text(),'QUICK LINKS')]")).getText();
        Assert.assertEquals(expected,actual);
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
      String expectedUrl="https://www.na.edu/admissions/graduate/";
      Assert.assertEquals(expectedUrl,driver.getCurrentUrl());
      sleep(1000);
        home.closingPage();

    }

    @Then("^Users click the Gulf Language School Section$")
    public void usersClicksTheGulfLanguageSchoolSection() {

        home.checkingGulfSchool();
    }

    @And("^Users see the next Elements$")
    public void usersSeeTheNextElements() throws InterruptedException {
        String expectGulfSchool="Gulf Language School";
        String actualGulfSchool=driver.findElement( By.xpath("//span[contains(text(),'Gulf Language School')]")).getText();
        Assert.assertEquals(expectGulfSchool,actualGulfSchool);
        sleep(1000);
        home.closingPage();
    }

    @Then("^Users see \"([^\"]*)\" under the Undergraduate$")
    public void usersSeeUnderTheUndergraduate(String arg0) throws Throwable {
        home.hoveringAdmission();

    }


    @And("^Users see Elements of the \"([^\"]*)\" section$")
    public void usersSeeElementsOfTheSection(String subMenuItem) throws Throwable {
           String actualSubMenu = driver.findElement(By.xpath("//span[@class ='ubermenu-target-title ubermenu-target-text' and contains(text(), '"+subMenuItem+"')]")).getText();

           Assert.assertEquals(subMenuItem,actualSubMenu);
        home.closingPage();

    }

    @And("^Users see the \"([^\"]*)\"elements$")
    public void usersSeeTheElements(String graduateSections) throws Throwable {
       String graduateItems=driver.findElement(By.xpath("//span[@class ='ubermenu-target ubermenu-item-layout-default ubermenu-item-layout-text_only' and contains(text(), '"+graduateSections+"')]")).getText();
        Assert.assertEquals(graduateSections,graduateItems);
       home.closingPage();
    }

    @Then("^Users click the Apply link under the undergraduate$")
    public void usersClickTheApplyLinkUnderTheUndergraduate() {
        home.checkingUnderApply().click();
    }

    @And("^Users see the next page with$")
    public void usersSeeTheNextPageWith() {
        String expectedMessage="The Application Process";
       boolean actualMessage=driver.findElement(By.xpath("//*[@id='menu-item-1772']/a/span")).isDisplayed();
       Assert.assertTrue(true);
}

    @Then("^Users click the Degree Programs link under the undergraduate$")
    public void usersClickTheDegreeProgramsLinkUnderTheUndergraduate() {
        home.checkingDegreeProg().click();
    }

    @And("^User will see the next page with message$")
    public void userWillSeeTheNextPageWithMessage() {
        String expectUrl="http://qatest2119.na.edu/admissions/undergraduate/programs/";
        String actualMessage=driver.getCurrentUrl();
      Assert.assertEquals(expectUrl,actualMessage);
        home.closingPage();
    }

    @Then("^Users click the Tuition and Fees  link under the undergraduate$")
    public void usersClickTheTuitionAndFeesLinkUnderTheUndergraduate() {
        home.checkingFee().click();
    }

    @And("^Users see the next page with message$")
    public void usersSeeTheNextPageWithMessage() {
        String expect="http://qatest2119.na.edu/admissions/undergraduate/tuition-and-fees/";
        Assert.assertEquals(expect,driver.getCurrentUrl());
        home.closingPage();
    }

    @Then("^Users click the Scholarship  link under the undergraduate$")
    public void usersClickTheScholarshipLinkUnderTheUndergraduate() {
        home.checkingScholarship().click();
    }


    @And("^User will  see the next page with messages$")
    public void userWillSeeTheNextPageWithMessages() {
        String excepted="http://qatest2119.na.edu/admissions/undergraduate/scholarships/";
        Assert.assertEquals(excepted,driver.getCurrentUrl());
        home.closingPage();
    }

    @Then("^Users click the International link under the undergraduate$")
    public void usersClickTheInternationalLinkUnderTheUndergraduate() {
        home.checkingInternational().click();

    }

    @And("^User will  see the next page  messages$")
    public void userWillSeeTheNextPageMessages() {
        String excpectingUrl="http://qatest2119.na.edu/admissions/international/";
        Assert.assertEquals(excpectingUrl,driver.getCurrentUrl());
        home.closingPage();
    }

    @Then("^Users click the Apply Now under the Graduate$")
    public void usersClickTheApplyNowUnderTheGraduate() {
        home.checkingApplyNow().click();

    }

    @And("^User will  see the message: Non-Degree Seeking$")
    public void userWillSeeTheMessageNonDegreeSeeking() {
        String expectingUrl="https://apply.na.edu/admission";
        Assert.assertEquals(expectingUrl,driver.getCurrentUrl());
        home.closingPage();
    }

    @Then("^Users click the Graduate Degrees under the Graduate$")
    public void usersClickTheGraduateDegreesUnderTheGraduate() {
        home.checkingGraduateDegrees().click();
    }

    @And("^User will  see the message: Master of Education in School Counseling$")
    public void userWillSeeTheMessageMasterOfEducationInSchoolCounseling() {

        String expectedTitle="Graduate Degrees - North American University";
      String actual=driver.getTitle();
      Assert.assertEquals(expectedTitle,actual);
        home.closingPage();
    }

    @Then("^Users click the Tuition and Fee under the Graduate$")
    public void usersClickTheTuitionAndFeeUnderTheGraduate() {
        home.checkingGraduateTuition().click();
    }

    @And("^User will  see the message: Affordable Education$")
    public void userWillSeeTheMessageAffordableEducation() {
        String expectedPage="Tuition and Fees - North American University";
        String actual=driver.getTitle();
        Assert.assertEquals(expectedPage,actual);
        home.closingPage();

    }

    @Then("^Users click the Distance Education under the Graduate$")
    public void usersClickTheDistanceEducationUnderTheGraduate() {
        home.checkingGraduateDistance();
    }

    @And("^User will  see the message: Distance Education$")
    public void userWillSeeTheMessageDistanceEducation() {
      String expectedTitle="Welcome to North American University | Houston TX";
      String actual=driver.getTitle();
      Assert.assertEquals(expectedTitle,actual);
        home.closingPage();
    }

    @Then("^Users click the Graduate International under the Graduate$")
    public void usersClickTheGraduateInternationalUnderTheGraduate() {
        home.checkingGraduateInternational();
    }

    @And("^User will  see the message: (\\d+) Countries\\. (\\d+) University$")
    public void userWillSeeTheMessageCountriesUniversity(int arg0, int arg1) {
        String expectedTitle="Welcome to North American University | Houston TX";
         String actual=driver.getTitle();
         Assert.assertEquals(expectedTitle,actual);
        home.closingPage();
    }


    @Then("^Users click the Apply Now  under the Gulf Language School$")
    public void usersClickTheApplyNowUnderTheGulfLanguageSchool() {
        home.hoverOverAdmissions();
        home.checkGulfApply().click();
    }

    @And("^User will  see the message: Welcome to North American University$")
    public void userWillSeeTheMessageWelcomeToNorthAmericanUniversity() throws InterruptedException {
        String expectedMessage="Welcome to North American University | Houston TX";
       String actual=driver.getTitle();
       Assert.assertEquals(expectedMessage,actual);
        Thread.sleep(1000);

    }

    @Then("^Users click the GLS Admissions$")
    public void usersClickTheGLSAdmissions() {
        home .gLSAdmission().click();


    }


    @And("^Users see the new option \"([^\"]*)\"$")
    public void usersSeeTheNewOption(String arg0) {
   String expected= "Welcome to North American University | Houston TX";
        String actualOption= driver.getTitle();
        Assert.assertEquals(expected,actualOption);
        home.closingPage();
    }


    @And("^Users see \"([^\"]*)\"elements$")
    public void usersSeeElements(String gulfSchool)  {
        String actualSubMenu = driver.findElement(By.xpath("//span[@class ='ubermenu-target-title ubermenu-target-text' and contains(text(), '"+gulfSchool+"')]")).getText();
        Assert.assertEquals(gulfSchool,actualSubMenu);

    }

    @When("^Users see  \"([^\"]*)\"elements$")
    public void users_see_elements(String ApplyNow) throws InterruptedException {
        String actualSubMenu = driver.findElement(By.xpath("//span[@class ='ubermenu-target-title ubermenu-target-text' and contains(text(), '"+ApplyNow+"')]")).getText();
        Thread.sleep(2000);
        Assert.assertEquals(ApplyNow,actualSubMenu);
        home.closingPage();
    }

    @Then("^Users click the GLS Admission under the Gulf Language School$")
    public void users_click_the_GLS_Admission_under_the_Gulf_Language_School() throws Throwable {
       home.clickingGLSAdmission();
    }

    @Then("^User will  see the message: LEARN ENGLISH As a second language$")
    public void user_will_see_the_message_LEARN_ENGLISH_As_a_second_language() throws Throwable {
        String expectedMessage="Welcome to North American University | Houston TX";
        String actual=driver.getTitle();
        Assert.assertEquals(expectedMessage,actual);
        home.closingPage();
    }









}


