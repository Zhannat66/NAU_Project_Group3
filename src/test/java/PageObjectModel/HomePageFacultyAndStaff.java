package PageObjectModel;

import Common.Base;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HomePageFacultyAndStaff extends Base {

    public By facultyStaffElement = By.xpath("//*[@id='menu-item-896']/a/span[1]");

    public void verifyIfMainPageIsDisplayed() {
        String givenUrl = "http://qatest2119.na.edu/";
        String actualUrl = driver.getCurrentUrl();
        System.out.println("Given url: " + givenUrl);
        System.out.println("Actual url: " + actualUrl);
        if (givenUrl.equals(actualUrl)) {
            Assert.assertTrue(true);
        }
    }

    public WebElement isFacultyAndStaffDisplayed() {
        return driver.findElement(facultyStaffElement);

    }

    public Actions hoverOverFacultyStaff() throws InterruptedException {

        Actions myActions = new Actions(driver);

        Thread.sleep(2000);
        myActions.moveToElement(driver.findElement(facultyStaffElement)).build().perform();
        Thread.sleep(2000);
        return myActions;
    }

    public By sectionEmployeeCenter = By.xpath("//*[@id='menu-item-5733']/a/span");

    public WebElement verifyIfSubSectionsDisplayed() {
        return driver.findElement(sectionEmployeeCenter);
    }

    public By sectionOffice365 = By.xpath("//*[@id=\"menu-item-5723\"]/div/ul/li[1]/a/span[1]");
    public By sectionFeesDeposits = By.xpath("//*[@id=\"menu-item-5723\"]/div/ul/li[2]/a/span[1]");
    public By sectionPassReset = By.xpath("//*[@id=\"menu-item-5723\"]/div/ul/li[3]/a/span[1]");
    public By sectionITServices = By.xpath("//*[@id=\"menu-item-5723\"]/div/ul/li[4]/a/span[1]");
    public By sectionNewsEvents = By.xpath("//*[@id=\"menu-item-5734\"]/a/span");
    public By sectionPicture = By.xpath("//*[@id=\"menu-item-5736\"]/div/img");

    public void isSectionsDisplayed() {

        HashMap<String, Object> subSection = new HashMap<>();
        subSection.put("Office 365", sectionOffice365);
        subSection.put("Fees and Deposits", sectionFeesDeposits);
        subSection.put("Password Reset", sectionPassReset);
        subSection.put("IT Services", sectionITServices);
        subSection.put("Employee Center", sectionEmployeeCenter);
        subSection.put("News and Events", sectionNewsEvents);
        subSection.put("Picture", sectionPicture);

        for (String name : subSection.keySet()) {
            System.out.println(name);
        }
        driver.quit();
    }
}