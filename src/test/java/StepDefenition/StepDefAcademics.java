package StepDefenition;

import Common.Base;
import PageObjectModel.HomePageAcademics;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.xml.transform.Source;

public class StepDefAcademics {
    HomePageAcademics Acad;

    @Given("^User will navigate to NAU website$")
    public void user_will_navigate_to_NAU_website() throws Throwable {
        Base.getDriver();
    }

    @When("^User will click Academics menu$")
    public void user_will_click_Academics_menu() throws Throwable {

        Acad = new HomePageAcademics();
        Acad.getSearchAacademics().click();

    }

    @Then("^User will see the Academics page$")
    public void user_will_see_the_Academics_page() throws Throwable {
        System.out.println("Academics page will appear");

    }

    @Given("^User will navigate to NAU page$")
    public void user_will_navigate_to_NAU_Academics_webpage() throws Throwable {

    }

    @When("^User will click Course Schedule menu$")
    public void user_will_click_Course_Schedule_menu() throws Throwable {
        Acad = new HomePageAcademics();
        Acad.getCourseSchedule().click();
        Thread.sleep(1000);

    }

    @Then("^User will see current semester Course Schedule page$")
    public void user_will_see_current_semester_Course_Schedule_page() throws Throwable {
        System.out.println("Course Schedule page is displayed");
    }

    @When("^User will click Final Schedule menu$")
    public void user_will_click_Final_Schedule_menu() throws Throwable {
        Acad = new HomePageAcademics();
        Acad.getFinalSchedule().click();
        Thread.sleep(1000);
    }

    @Then("^User will see current semester Final Schedule page$")
    public void user_will_see_current_semester_Final_Schedule_page() throws Throwable {
        System.out.println("Final Schedule is displayed");
    }

    @When("^User will click Degree Programs menu$")
    public void user_will_click_Degree_Programs_menu() throws Throwable {
        Acad = new HomePageAcademics();
        Acad.getDegreePrograms().click();
        Thread.sleep(1000);
    }

    @Then("^User will see current semester Degree Progrmas page$")
    public void user_will_see_current_semester_Degree_Progrmas_page() throws Throwable {
        System.out.println("Degree Programs are displayed");
    }

    @When("^User will hover over Academics menu in NAU main page$")
    public void user_will_hover_over_Academics_menu_in_NAU_main_page() throws Throwable {
        Acad = new HomePageAcademics();
        Acad.getHoveroverAcademics();
        Acad.getSearchAacademics();

    }

    @Then("^User will see drop down of Academics menu$")
    public void user_will_see_drop_down_of_Academics_menu() throws Throwable {
        System.out.println("Done hover over");
    }


}