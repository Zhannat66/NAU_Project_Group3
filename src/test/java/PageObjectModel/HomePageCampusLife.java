package PageObjectModel;

import Common.Base;
import cucumber.api.java.en_old.Ac;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class HomePageCampusLife extends Base {

    public By search = By.xpath("//span[text()='Campus Life']");

    public WebElement getSearchCamp() {

        return driver.findElement(search);

    }

    public By campusLife = By.xpath("//a[text()='Student Services']");

    public WebElement getCampusLife() {

        return driver.findElement(campusLife);
    }

    public By studentOrganizat = By.xpath("//a[text()='Student Organizations']");

    public WebElement getOrganizat() {

        return driver.findElement(studentOrganizat);

    }

    public By calenderOfEvents = By.xpath("//a[text()='Calendar of Events']");

    public WebElement getEvents() {

        return driver.findElement(calenderOfEvents);
    }

    @FindBy(xpath = "//a[text()='Health Services']")
    public WebElement healthServices;

    public void getHealthServices() {

        healthServices.click();
    }

    @FindBy(xpath = "//a[text()='Dining at NAU']")
    public WebElement diningatNau;

    public void getDiningatNau() {

        diningatNau.click();
    }

    public By parkingTrans = By.xpath("//*[@id='sidebar']/ul/li[6]/a");

    public WebElement getParkingTrans() {

        return driver.findElement(parkingTrans);
    }

    public By emergencyGuide = By.xpath("//a[text()='Emergency Guide']");

    public WebElement getEmergency() {

        return driver.findElement(emergencyGuide);
    }

    @FindBy(xpath = "//a[text()='Campus Security']")
    public WebElement campusSecurity;

    public void getCampusSecurity() {
        campusSecurity.click();
    }

    public By serviceRequest = By.xpath("//a[text()='Service Request']");

    public WebElement getServiceRequest() {
        return driver.findElement(serviceRequest);
    }

    @FindBy(xpath = "//a[text()='Housing']")
    public WebElement housingPart;

    public void getHousingPart() {
        housingPart.click();
    }

    public By myaction = By.xpath("//span[text()='Campus Life']");

    public WebElement getActionClass() {
        driver.get("https://qatest2119.na.edu/");
        WebElement myElement = driver.findElement(By.xpath("//span[text()='Campus Life']"));
        Actions myMouseAction = new Actions(driver);
        myMouseAction.moveToElement(myElement).click().perform();
        driver.manage().window().maximize();
        myMouseAction.moveToElement(driver.findElement(By.xpath("//*[@id='menu-item-103']/a/span"))).click().perform();
        return driver.findElement(myaction);

    }

    public By loginpage = By.xpath("//*[@id='menu-item-103']/a/span");

    public WebElement getLogin365Portal() {
        driver.get("https://qatest2119.na.edu/");
        WebElement myElement = driver.findElement(By.xpath("//*[@id='menu-item-103']/a/span"));
        Actions myAction = new Actions(driver);
        Action actionAccount = myAction.moveToElement(myElement)
                .click()
                .keyDown(myElement, Keys.SHIFT)
                .sendKeys("mkortak@na.edu")
                .keyUp(myElement, Keys.SHIFT)
                .build();
        actionAccount.perform();
        return driver.findElement(loginpage);
    }
    public By switchtomethod=By.xpath("//a[text()='Housing']");
    public WebElement getSwitchTo(){

       driver.get("http://qatest2119.na.edu/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//span[text()='Campus Life']")).click();
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

        Set<String> myWins = driver.getWindowHandles();
        Iterator<String> itr = myWins.iterator();
        String parent = driver.getWindowHandle();
        String child = itr.next();

        driver.switchTo().window(parent);
        System.out.println("parent:" + driver.getTitle());
        driver.switchTo().window(child);
        System.out.println("child:" + driver.getTitle());

        return driver.findElement(switchtomethod);
    }

}




