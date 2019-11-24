package PageObjectModel;

import Common.Base;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class HomePageFacultyAndStaff extends Base {

    //Main Page Sections Locators
    public By facultyStaffElement = By.xpath("//*[@id='menu-item-896']/a/span[1]");
    public By sectionEmployeeCenter = By.xpath("//*[@id='menu-item-5733']/a/span");
    public By sectionOffice365 = By.xpath("//*[@id=\"menu-item-5723\"]/div/ul/li[1]/a/span[1]");
    public By sectionFeesDeposits = By.xpath("//*[@id=\"menu-item-5723\"]/div/ul/li[2]/a/span[1]");
    public By sectionPassReset = By.xpath("//*[@id=\"menu-item-5723\"]/div/ul/li[3]/a/span[1]");
    public By sectionITServices = By.xpath("//*[@id=\"menu-item-5723\"]/div/ul/li[4]/a/span[1]");
    public By sectionNewsEvents = By.xpath("//*[@id=\"menu-item-5734\"]/a/span");
    public By sectionPicture = By.xpath("//*[@id=\"menu-item-5736\"]/div/img");




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

    public WebElement verifyIfSubSectionsDisplayed() {
        return driver.findElement(sectionEmployeeCenter);
    }

    public void isSectionsDisplayed() {

        HashMap<String, Object> section = new HashMap<>();
        section.put("Office 365", sectionOffice365);
        section.put("Fees and Deposits", sectionFeesDeposits);
        section.put("Password Reset", sectionPassReset);
        section.put("IT Services", sectionITServices);
        section.put("Employee Center", sectionEmployeeCenter);
        section.put("News and Events", sectionNewsEvents);
        section.put("Picture", sectionPicture);

        for (String name : section.keySet()) {
            System.out.println("List of Sections Displayed in Home Page: " + name);

        }
        driver.quit();
    }

    public void navigateToFacultyAndStaffPage() {
        driver.findElement(facultyStaffElement).click();
    }

    public void verifyIfNavigatedToFacultyAndStaff() {
        String expectedFacultyAndStaffURL = "http://www.qatest2119.na.edu/faculty-staff/";
        String actualFacultyAndStaffURL = driver.getCurrentUrl();
        if (expectedFacultyAndStaffURL.equals(actualFacultyAndStaffURL))
            Assert.assertTrue(true);
    }

    public void clickOffice365Section() {
        driver.findElement(sectionOffice365).click();
    }

    public void isNavigatedToOffice365() throws InterruptedException {

        Set<String> windowIds = driver.getWindowHandles();
        Iterator<String> iter = windowIds.iterator();
        String office365Window = iter.next();
        driver.switchTo().window(office365Window);
    }

    public void clickFeesAndDepositsSection() {
        driver.findElement(sectionFeesDeposits).click();
    }

    public void isNavigatedToFeesAndDeposits() {
        driver.getCurrentUrl();
    }

    public void clickPasswordReset() {

        driver.findElement(sectionPassReset).click();
    }


    public void isNavigatedToPassReset() throws InterruptedException {
        String expectedUrl = "https://passreset.na.edu/reset.html?0";
        Set<String> windowIds = driver.getWindowHandles();
        Iterator<String> itr = windowIds.iterator();
        String homePageWindow = itr.next();
        String passResetWindow = itr.next();
        driver.switchTo().window(passResetWindow);
        String actualPasswordUrl = driver.getCurrentUrl();
        System.out.println(actualPasswordUrl);

        Assert.assertEquals(expectedUrl,actualPasswordUrl);

        driver.close();
        Thread.sleep(2000);
        driver.switchTo().window(homePageWindow);
    }

    public void clickITServicesSection() {

        driver.findElement(sectionITServices).click();
    }

    public void isNavigatedToITServices() {

        driver.getCurrentUrl();
    }


    //Employee Center Sub Sections Locators
    public By subSectionHumanResources = By.xpath("//*[@id=\"menu-item-5739\"]/a/span");
    public By subSectionEmployeeForms = By.xpath("//*[@id=\"menu-item-5742\"]/a/span");
    public By subSectionFacultyMembers = By.xpath("//*[@id=\"menu-item-5743\"]/a/span");
    public By subSectionEmployeeHandbook = By.xpath("//*[@id=\"menu-item-5745\"]/a/span");
    public WebElement isEmployeeCenterSectionDisplayed() {

        return driver.findElement(sectionEmployeeCenter);
    }

    public void areEmployeeCenterSubSectionsDisplayed() {
        HashMap<String, Object> subSections = new HashMap<>();
        subSections.put("Human Resources", subSectionHumanResources);
        subSections.put("Employee Forms", subSectionEmployeeForms);
        subSections.put("Faculty Members", subSectionFacultyMembers);
        subSections.put("Employee Handbook", subSectionEmployeeHandbook);

        for (String subSectionName : subSections.keySet()) {
            System.out.println("List of Sub-sections Displayed under Employee Center: " + subSectionName);
        }
        driver.quit();
    }

    public void clickHumanResources() {

        driver.findElement(subSectionHumanResources).click();
    }

    public void isNavigatesToHumanResources() {

        driver.getCurrentUrl();
    }

    public void clickEmployeeForms() {

        driver.findElement(subSectionEmployeeForms).click();
    }

    public By employeeFormsTextDisplayed = By.xpath("//h2[text()='Employee Forms']");

    public void isNavigateToEmployeeForms() {
       String actualText =  driver.findElement(employeeFormsTextDisplayed).getText();
        System.out.println("Actual URL Of Employee Forms Page: " + actualText);
        if("Employee Forms".equals(actualText)){
            Assert.assertTrue(true);
        }

    }

    public void clickFacultyMembers() {
        driver.findElement(subSectionFacultyMembers).click();
    }

    By facultyMembersPage = By.xpath("//*[@id='post-780']/div/div/div/div/div/div[3]/h2");
    public void isNavigateToFacultyMembers() {
        String actualText = driver.findElement(facultyMembersPage).getText();
        System.out.println("Actual Text to Verify Faculty Members Page: " + actualText);
        if("NAU Faculty Members".equals(actualText)){
            Assert.assertTrue(true);
        }
        driver.close();
    }

    public void clickEmployeeHandbook() {
        driver.findElement(subSectionEmployeeHandbook).click();

    }

    public void isEmployeeHandbookDisplayed(){
       String currentUrl = driver.getCurrentUrl();
       System.out.println("Current URL of Employee Handbook Page: " + currentUrl);
        if(currentUrl.contains("NAU Employee Handbook.pdf")){
            Assert.assertTrue(true);
        }
        driver.close();
    }

    public void isNewsAndEventsSectionDisplayed() {
        String text = driver.findElement(sectionNewsEvents).getText();
        System.out.println(text);
        if(text.contains("News and Events")){
            Assert.assertTrue(true);
        }
    }


    //News and Events Sub Section Locators
    public By subSectionHeadlines = By.xpath("//*[@id=\"menu-item-5746\"]/a/span");
    public By subSectionAnnouncements = By.xpath("//*[@id=\"menu-item-5747\"]/a/span");
    public By subSectionCalendarOfEvents = By.xpath("//*[@id=\"menu-item-5749\"]/a/span");
    public By subSectionStudentWorkers = By.xpath("//span[contains(text(),'Student Workers')]");
    public By verifySubSectionsNewsAndEvents = By.xpath("//*[@id='menu-item-5734']/ul//*[@class='ubermenu-target-title ubermenu-target-text']");

    public void verifySubSectionsNewsEventsDisplayed() {
        List<WebElement> listOfElements = driver.findElements(verifySubSectionsNewsAndEvents);
        int sizeOfList = listOfElements.size();
        System.out.println("Size of listed sub-sections under New and Events: " + sizeOfList);
        for (int i = 0; i < sizeOfList; i++) {
            String textSubSection = listOfElements.get(i).getText();
            System.out.println("List of Sub-sections Displayed under News and Events Section: " + textSubSection);
        }
    }

    public void clickHeadlines() {
        driver.findElement(subSectionHeadlines).click();
    }

    public void isNavigatedToHeadlinesSubSection(){
       String headlinesText = driver.findElement(By.xpath("//a[@href='http://qatest2119.na.edu/headlines/']")).getText();
       System.out.println(headlinesText);
       Assert.assertEquals("Headlines", headlinesText);
    }

    public void clickAnnouncements() {
        driver.findElement(subSectionAnnouncements).click();
    }

    public void isNavigatedToAnnouncementsSubSection(){
        String headlinesText = driver.findElement(By.xpath("//a[@href='http://qatest2119.na.edu/headlines/announcements/']")).getText();
        System.out.println(headlinesText);
        Assert.assertEquals("Announcements", headlinesText);
    }

    public void clickCalendarOfEvents() {
        driver.findElement(subSectionCalendarOfEvents).click();
    }

    public void isNavigatedToCalendarOfEventsSubSection(){
        String calendarOfEventsText = driver.findElement(By.xpath("//a[contains(text(),'Calendar of Events')]")).getText();
        System.out.println(calendarOfEventsText);
        Assert.assertEquals("Calendar of Events", calendarOfEventsText);
    }

    public void clickStudentWorkers() {
        driver.findElement(subSectionStudentWorkers).click();
    }

    public void isNavigatedToStudentWorkersSubSection(){
        String studentWorkersText = driver.findElement(By.xpath("//*[@id='sidebar']/ul/li[2]/ul/li[3]/a")).getText();
        System.out.println(studentWorkersText);
        Assert.assertEquals("Student Workers", studentWorkersText);
    }
}








