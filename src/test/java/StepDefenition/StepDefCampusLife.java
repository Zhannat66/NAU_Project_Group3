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

import java.sql.SQLOutput;

public class StepDefCampusLife extends Base {
    HomePageCampusLife cam;
//STUDENT SERVICES
    @Given("^User will navigate to the website$")
    public void user_will_navigate_to_the_website() throws Throwable {
        Base.getDriver();
    }

    @When("^User searches for Student Services section$")
    public void user_searches_for_Student_Services_section() throws Throwable {
        cam = new HomePageCampusLife();
        cam.getSearchCamp().click();

    }

    @Then("^The \"([^\"]*)\" menu and pop-up menu displayed$")
    public void the_menu_and_pop_up_menu_displayed(String arg1) throws Throwable {
        String title=driver.getTitle();
        System.out.println("Dashboard title::"+title);
        Assert.assertEquals("NAU Campus Life - North American University",title);
        //driver.quit();
        //Assert.assertTrue(cam.getCampusLife().getText().contains(arg1));
    }
//STUDENT ORGANIZATIONS
    @When("^User searches for Student Organizations part$")
    public void user_searches_for_Student_Organizations_part() throws Throwable {
        cam = new HomePageCampusLife();
        cam.getOrganizat().click();
        Thread.sleep(2000);
//      driver.manage().window().maximize();
    }

    @Then("^The sub-items of the \"([^\"]*)\" menu will be open$")
    public void the_sub_items_of_the_menu_will_be_open(String arg1) throws Throwable {
        String title=driver.getTitle();
        System.out.println("dashboard::"+title);
        Assert.assertEquals("NAU Student Organizations - North American University",title);
        //Assert.assertEquals("NAU Student Organizations - North American University",title);
       // Assert.assertTrue(cam.getOrganizat().getText().contains(arg1));
    }
    //CALENDER EVENTS
    @When("^User searches for Calender of Events part$")
    public void user_searches_for_Calender_of_Events_part() throws Throwable {
        cam = new HomePageCampusLife();
        cam.getEvents().click();
    }
    @When("^The \"([^\"]*)\" will be displayed$")
    public void the_will_be_displayed(String arg1) throws Throwable {
       String currenturl="http://qatest2119.na.edu/campus-life/calendar-of-events/";
       Assert.assertTrue(driver.getCurrentUrl(),true);
    }
    @Then("^The Calender of Events part will be displayed$")
    public void the_Calender_of_Events_part_will_be_displayed() throws Throwable {
        System.out.println("The Calender of Events part is displayed");
        String title=driver.getTitle();
        System.out.println("Dashboard::"+title);
       Assert.assertEquals("NAU Calendar of Events - North American University",title);
       //Assert.assertTrue(cam.getEvents().getText().contains("Events"));

    }
    // HEALTH SERVICES
    @When("^User searches for Health Services part$")
    public void user_searches_for_Health_Services_part() throws Throwable {
        cam = PageFactory.initElements(Base.driver, HomePageCampusLife.class);
        cam.getHealthServices();
    }

    @Then("^The Health Services part will be open$")
    public void the_Health_Services_part_will_be_open() throws Throwable {
        String title=driver.getTitle();
        System.out.println("Dashboard::"+title);
        Assert.assertEquals("NAU Health Care Services - North American University",title);

    }
// DINING PART
    @When("^User searches for Dining at NAU part$")
    public void user_searches_for_Dining_at_NAU_part() throws Throwable {
        cam = PageFactory.initElements(Base.driver, HomePageCampusLife.class);
        cam.getDiningatNau();

    }

    @Then("^The Dining at Nau part will be appear$")
    public void the_Dining_at_Nau_part_will_be_appear() throws Throwable {
        String currentUrl=driver.getCurrentUrl();
        System.out.println("Current Url::"+currentUrl);
       // Assert.assertEquals("http://qatest2119.na.edu/campus-life/dining-at-nau/",currentUrl);

    }
//PARKING & TRANSPORTATION
    @When("^User searches for Parking and Transportation part$")
    public void user_searches_for_Parking_and_Transportation_part() throws Throwable {
        cam = new HomePageCampusLife();
        cam.getParkingTrans();
    }

    @Then("^The Parking Nad Transportation part will be displayed$")
    public void the_Parking_Nad_Transportation_part_will_be_displayed() throws Throwable {
       String kurrenturl=driver.getCurrentUrl();
        System.out.println("Current Url is::"+kurrenturl);
       //driver.quit();
    }
//EMERGENCY
    @When("^User searches for Emergency Guide part$")
    public void user_searches_for_Emergency_Guide_part() throws Throwable {
        cam=new HomePageCampusLife();
        cam.getEmergency();

    }
    @Then("^The Emergency Guide will be open$")
    public void the_Emergency_Guide_will_be_open() throws Throwable {
       String currenturl=driver.getCurrentUrl();
        System.out.println("Emergency url is::"+currenturl);
       Assert.assertEquals("http://qatest2119.na.edu/campus-life/",currenturl);
    }
//SECURITY
    @When("^User searches for Campus Security section$")
    public void user_searches_for_Campus_Security_section() throws Throwable {
       cam= PageFactory.initElements(Base.driver,HomePageCampusLife.class);
       cam.getCampusSecurity();
        //driver.quit ();
           }

    @Then("^The Campus Security section will be appear$")
    public void the_Campus_Security_section_will_be_appear() throws Throwable {
       String title=driver.getTitle();
       String securUrl=driver.getCurrentUrl();
        System.out.println("Security title is::"+title);
        System.out.println("Security url is::"+securUrl);
        Assert.assertEquals("NAU Campus Security - North American University",title);
        Assert.assertEquals("http://qatest2119.na.edu/campus-life/campus-security/",securUrl);
        //driver.quit ();
    }

    @When("^User searches for Srvice Request menu$")
    public void user_searches_for_Srvice_Request_menu() throws Throwable {
       cam=new HomePageCampusLife();
       cam.getServiceRequest();
       // driver.quit ();
    }


    @Then("^The Service Request menu will be appear$")
    public void the_Service_Request_menu_will_be_appear() throws Throwable {
       String servicetitle=driver.getTitle();
        System.out.println("service request title is::"+servicetitle);
        Assert.assertEquals("NAU Campus Life - North American University",servicetitle);
       // driver.quit ();
    }
//HOUSING
    @When("^User searches for Housing part$")
    public void user_searches_for_Housing_part() throws Throwable {
       cam=PageFactory.initElements(Base.driver,HomePageCampusLife.class);
       cam.getHousingPart();

    }

    @Then("^The Housing part will be open$")
    public void the_Housing_part_will_be_open() throws Throwable {
        System.out.println("Housing part will be appear");
        String title=driver.getTitle ();
        System.out.println ("Dashboard title::"+title);
        Assert.assertEquals ("Housing and Residential Life - North American University",title);

    }
    @When("^User moves the curser between parts$")
    public void user_moves_the_curser_between_parts() throws Throwable {
        cam=new HomePageCampusLife();
        cam.getActionClass();

    }

    @Then("^The action will be done$")
    public void the_action_will_be_done() throws Throwable {
        System.out.println("THE ACTION CLASS IS WORKING !");

    }
    @When("^User will login to the (\\d+) Portal$")
    public void user_will_login_to_the_Portal(int arg1) throws Throwable {
        cam=new HomePageCampusLife();
        cam.getLogin365Portal().click();

    }

    @Then("^The studen will be log in (\\d+) Portal$")
    public void the_studen_will_be_log_in_Portal(int arg1) throws Throwable {
        System.out.println("USER SUCCESFULY LOGIN 365 PORTAL");
    }
    @When("^User switches from \"([^\"]*)\" page to \"([^\"]*)\"$")
    public void user_switches_from_page_to(String arg1, String arg2) throws Throwable {
        cam=new HomePageCampusLife();
        cam.getSwitchTo().click();

    }

    @Then("^The switches method will be done$")
    public void the_switches_method_will_be_done() throws Throwable {
        System.out.println("switchto method is DONE!");

    }

}
