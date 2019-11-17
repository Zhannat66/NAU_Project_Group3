package StepDefenition;

import Common.Base;
import PageObjectModel.HomePageMainPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gherkin.lexer.Pa;
import org.junit.Assert;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class StepDefMainPage {

    HomePageMainPage hmp = new HomePageMainPage ();


    @Given("^User will navigate to the website$")
    public void user_will_navigate_to_the_website() throws Throwable {
        Base.getDriver ();
        Thread.sleep (1000);
    }

    @When("^User will click to  Portal$")
    public void user_will_click_to_portal() throws Throwable {
        hmp=new HomePageMainPage ();
        hmp.getClickPortal ().click ();
        Thread.sleep (1000);

    }

    @Then("^email page is displayed$")
    public void email_page_is_displayed() throws Throwable {
        System.out.println ("email page is displayed ");

    }
    @Given("^will navigate to the website$")
    public void will_navigate_to_the_website() throws Throwable {
        Base.getDriver ();
        Thread.sleep (2000);


    }
    @When("^User will click to Apply Now portal$")
    public void user_will_click_to_apply_now_portal() throws Throwable {
        hmp=new HomePageMainPage ();
        hmp.getClickApplyNow ().click ();
        Thread.sleep (1000);

    }

    @Then("^users will adjourn Apply page$")
    public void users_will_adjourn_apply_page() throws Throwable {
        System.out.println ("Apply page is displayed");

    }

    @When("^users will click to Academics page$")
    public void users_will_click_to_Academics_page() throws Throwable {
        hmp.getClickAcademics ().click ();

    }

    @Then("^users will adjourn Academics page$")
    public void users_will_adjourn_Academics_page() throws Throwable {
        System.out.println ("Academics page is displayed");

}
    @When("^Users will click to Admission page$")
    public void users_will_click_to_Admission_page() throws Throwable {
        hmp.getClickAdmissions ().click ();

    }

    @Then("^Users will visit to Admission page$")
    public void users_will_visit_to_Admission_page() throws Throwable {
        System.out.println ("Admission is displayed");

}
    @When("^Users will click to Campus life page$")
    public void users_will_click_to_Campus_life_page() throws Throwable {
        hmp.getClickCampusLife ().click ();

    }

    @Then("^Users will visit to Campus life page$")
    public void users_will_visit_to_Campus_life_page() throws Throwable {
        System.out.println ("Campus life page is displayed");
    }
    @When("^Users will click to Students page$")
    public void users_will_click_to_Students_page() throws Throwable {
        hmp=PageFactory.initElements (Base.driver,HomePageMainPage.class);
        hmp.visitToStudentPage ();

    }

    @Then("^Users will visit to Students page$")
    public void users_will_visit_to_Students_page() throws Throwable {
        System.out.println ("Students page is displayed");
    }
    @When("^Users will click to about page$")
    public void users_will_click_to_about_page() throws Throwable {

        hmp= PageFactory.initElements (Base.driver,HomePageMainPage.class);
        hmp.getVisitNau ();
    }

    @Then("^Users will visit to about page$")
    public void users_will_visit_to_about_page() throws Throwable {
        System.out.println ("About NAU page is displayed");
    }
    @When("^Users will click to  click at the bottom of the page$")
    public void users_will_click_to_click_at_the_bottom_of_the_page() throws Throwable {
        hmp=PageFactory.initElements (Base.driver,HomePageMainPage.class);

    }

    @Then("^Users will visit to main page$")
    public void users_will_visit_to_main_page() throws Throwable {
        System.out.println ("Back to Home ");
    }

}
