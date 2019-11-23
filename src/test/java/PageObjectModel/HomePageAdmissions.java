package PageObjectModel;

import Common.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HomePageAdmissions
        extends Base {

    public By admissionLocator = By.xpath("//*[@id='menu-item-107']/a/span[1]");
    public By hoverAdmission = By.xpath("//*[@id='menu-item-1772']/a");
    public By imageLocator = By.xpath("//*[@id='menu-item-1758']/div/img");
    public By undergraduate = By.xpath("//*[@id='menu-item-1754']/a/span");
    public By graduate = By.xpath("//span[contains(text(),'Graduate')]");
    public By gulfLanguageSchool = By.xpath("//span[contains(text(),'Gulf Language School')]");
    public By graduateUpdate = By.id("oswaldH");
    public By undergraduateApply = By.xpath("//*[@id='menu-item-1772']/a/span");
    public By undergradDegree = By.xpath("//span[contains(text(),'Degree Programs')]");
    public By undergradTuition = By.xpath("//*[@id='menu-item-1774']/a/span");
    public By undergradScholarship = By.xpath("//span[contains(text(),'Scholarships')]");
    public By undergradInternational = By.xpath("//*[@id='menu-item-1776']/a/span");
    public By graduateApplyNow = By.xpath("//*[@id=\"menu-item-2264\"]/a/span");
    public By graduateDegrees = By.xpath("//span[contains(text(),'Graduate Degrees')]");
    public By graduateTuition = By.xpath("//*[@id=\"menu-item-2341\"]/a/span");
    public By graduateDistance = By.xpath("//*[@id=\"menu-item-2341\"]/a/span");
    public By graduateInternational = By.xpath("//*[@id=\"menu-item-2481\"]/a/span");
    public By underGraduateAll = By.xpath("//ul[starts-with(@class,'ubermenu-submenu ubermenu-submenu-id-1754')]");
    public By login365=By.xpath("//*[@id=\"menu-item-103\"]/a/span");
    public By userName=By.xpath("//*[@id='i0116']");
    public By firstSubmit=By.xpath("//*[@id=\"idSIButton9\"]");


    public WebDriver closingPage() {
        driver.quit();
        return driver;
    }


    //////////Scenario-1////////
    public WebElement hoverOverAdmissions() {
        return driver.findElement(admissionLocator);
    }
    public Actions sections() {
        Actions act = new Actions(driver);
        act.moveToElement(driver.findElement(admissionLocator)).build().perform();
        return act;
    }
    public WebElement image() {

        return driver.findElement(imageLocator);
    }
      ////Scenario-2////
    public WebElement checkingUndergraduate() {

        return driver.findElement(undergraduate);
    }
     //////Scenario-3///////
    public WebElement checkingGraduate() {

        return driver.findElement(graduate);
    }
      //////Scenario-4/////////
    public Actions checkingGulfSchool() {

        driver.findElement(gulfLanguageSchool);
        Actions act = new Actions(driver);
      act.moveToElement(driver.findElement(gulfLanguageSchool)).build().perform();
        return  act;
    }
    /////////Scenario-5-A//////////
    public WebElement hoveringAdmission() {

        return driver.findElement(hoverAdmission);
    }

    public WebElement checkingUnderApply() {

        return driver.findElement(undergraduateApply);
    }

    public WebElement checkingDegreeProg() {

        return driver.findElement(undergradDegree);
    }

    public WebElement checkingFee() {
        return driver.findElement(undergradTuition);
    }

    public WebElement checkingScholarship() {
        return driver.findElement(undergradScholarship);
    }

    public WebElement checkingInternational() {
        return driver.findElement(undergradInternational);
    }
 //////Scenario-5-B///////
    public WebElement checkingApplyNow() {
        return driver.findElement(graduateApplyNow);
    }

    public WebElement checkingGraduateDegrees() {
        return driver.findElement(graduateDegrees);
    }

    public WebElement checkingGraduateTuition() {
        return driver.findElement(graduateTuition);

    }

    public WebElement checkingGraduateDistance() {

        return driver.findElement(graduateDistance);
    }

    public WebElement checkingGraduateInternational() {
        return driver.findElement(graduateInternational);
    }
    public  By gulfApply=By.xpath("//*[@id='menu-item-2482']/a/span");
    public WebElement checkGulfApply(){

        return driver.findElement(gulfApply);
    }
    public By GlsAdmin=By.xpath("//*[@id='menu-item-2483']/a/span");
    public WebElement gLSAdmission(){

        return driver.findElement(GlsAdmin);
    }


    public By gulfAdmission=By.xpath("//span[contains(text(),'Admissions')]");
    public Actions hoverOverGulfAdmission(){
        Actions myActions=new  Actions(driver);
        myActions.moveToElement(driver.findElement(gulfAdmission)).build().perform();
        return myActions;
    }
    public WebElement clickingGLSAdmission(){
        return driver.findElement(gulfAdmission);
    }
    public WebElement clickingLogin(){
        return driver.findElement(login365);
    }
    public WebElement writingUsername(){
        return driver.findElement(userName);
    }
    public WebElement submittingParameter(){
        return driver.findElement(firstSubmit);
    }




}


