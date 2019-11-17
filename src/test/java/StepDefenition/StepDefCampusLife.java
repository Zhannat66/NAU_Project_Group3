package StepDefenition;

import Common.Base;
import PageObjectModel.HomePageCampusLife;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.bytebuddy.asm.Advice;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;

public class StepDefCampusLife extends Base{
    HomePageCampusLife cam;
    @Given("^User will navigate to the website$")
    public void user_will_navigate_to_the_website() throws Throwable {
        Base.getDriver();
    }

    @When("^User searches for Student Services section$")
    public void user_searches_for_Student_Services_section() throws Throwable {
        cam=new HomePageCampusLife();
        cam.getSearchCamp().click();
        Thread.sleep(3000);
    }

    @Then("^The \"([^\"]*)\" menu and pop-up menu displayed$")
    public void the_menu_and_pop_up_menu_displayed(String arg1) throws Throwable {
        Assert.assertTrue(cam.getCampusLife().getText().contains(arg1));
    }

    @When("^User searches for Student Organizations part$")
    public void user_searches_for_Student_Organizations_part() throws Throwable {
        cam=new HomePageCampusLife();
        cam.getOrganizat().click();
        Thread.sleep(2000);
//        driver.manage().window().maximize();
    }

    @Then("^The sub-items of the \"([^\"]*)\" menu will be open$")
    public void the_sub_items_of_the_menu_will_be_open(String arg1) throws Throwable {
       Assert.assertTrue(cam.getOrganizat().getText().contains(arg1));
    }
    @When("^User searches for Calender of Events part$")
    public void user_searches_for_Calender_of_Events_part() throws Throwable {
        cam=new HomePageCampusLife();
        cam.getEvents().click();
    }
    @Then("^The Calender of Events part will be displayed$")
    public void the_Calender_of_Events_part_will_be_displayed() throws Throwable {
        System.out.println("The Calender of Events part is displayed");
    }
    @When("^User searches for Health Services part$")
    public void user_searches_for_Health_Services_part() throws Throwable {
   cam= PageFactory.initElements(Base.driver,HomePageCampusLife.class);
   cam.getHealthServices();
    }
    @Then("^The Health Services part will be open$")
    public void the_Health_Services_part_will_be_open() throws Throwable {
        System.out.println("The Health Services Part will be displayed");

    }
    @When("^User searches for Dining at NAU part$")
    public void user_searches_for_Dining_at_NAU_part() throws Throwable {
        cam=PageFactory.initElements(Base.driver,HomePageCampusLife.class);
        cam.getDiningatNau();
    }
    @Then("^The Dining at Nau part will be appear$")
    public void the_Dining_at_Nau_part_will_be_appear() throws Throwable {
        System.out.println("DINING MENU APPEARED");
    }
    @When("^User searches for Parking and Transportation part$")
    public void user_searches_for_Parking_and_Transportation_part() throws Throwable {
        cam=new HomePageCampusLife();
        cam.getParkingTrans();
    }
    @Then("^The Parking Nad Transportation part will be displayed$")
    public void the_Parking_Nad_Transportation_part_will_be_displayed() throws Throwable {
        System.out.println("Parking and Transportation will be appeared");
    }

    }
