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


    public WebDriver closingPage() {
        driver.quit();
        return driver;
    }


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

    public WebElement checkingUndergraduate() {

        return driver.findElement(undergraduate);
    }

    public WebElement checkingGraduate() {

        return driver.findElement(graduate);
    }

    public WebElement checkingGulfSchool() {

        return driver.findElement(gulfLanguageSchool);
    }

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
}


