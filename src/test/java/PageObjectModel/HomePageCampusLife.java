package PageObjectModel;

import Common.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageCampusLife extends Base {
    public By search=By.xpath("//span[text()='Campus Life']");
    public WebElement getSearchCamp(){
        return driver.findElement(search);
    }
    public By campusLife=By.xpath("//a[text()='Student Services']");
    public WebElement getCampusLife(){
        return driver.findElement(campusLife);
    }
    public By studentOrganizat=By.xpath("//a[text()='Student Organizations']");
    public WebElement getOrganizat(){
        return driver.findElement(studentOrganizat);
    }
    public By calenderOfEvents=By.xpath("//a[text()='Calendar of Events']");
    public WebElement getEvents(){
        return driver.findElement(calenderOfEvents);
    }
    @FindBy(xpath = "//a[text()='Health Services']")
    public WebElement healthServices;
    public void  getHealthServices(){
        healthServices.click();
    }
    @FindBy(xpath = "//a[text()='Dining at NAU']")
    public WebElement diningatNau;
    public void getDiningatNau(){
        diningatNau.click();
    }
    public By parkingTrans=By.xpath("//a[text()='Parking & Transportation']");
    public WebElement getParkingTrans(){
        return driver.findElement(parkingTrans);
    }
    public By emergencyGuide=By.xpath("//a[text()='Emergency Guide']");
    public WebElement getEmergency(){
        return driver.findElement(emergencyGuide);
    }
    @FindBy(xpath = "//a[text()='Campus Security']")
    public WebElement campusSecurity;
    public void getCampusSecurity(){
        campusSecurity.click();
    }
    /*@FindBy(xpath ="//a[text()='Serviv=ce Request']")
    public WebElement serviceRequest;
    public void getServiceRequest(){
        serviceRequest.click();
    }*/
    public By serviceRequest=By.xpath("//a[text()='Service Request']");
    public WebElement getServiceRequest(){
        return driver.findElement(serviceRequest);
    }
    @FindBy(xpath = "//a[text()='Housing']")
    public WebElement housingPart;
    public void getHousingPart(){
        housingPart.click();
    }

   }

