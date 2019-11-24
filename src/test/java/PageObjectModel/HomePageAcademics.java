package PageObjectModel;

import Common.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePageAcademics  extends Base {

    public By search = By.xpath("//span[text()='Academics']");

    public WebElement getSearchAacademics() {
        return driver.findElement(search);
    }

    public By courseSchedule = By.xpath("//*[@id=\"sidebar\"]/ul/li[2]/a");

    public WebElement getCourseSchedule() {
        return driver.findElement(courseSchedule);
    }


    public By finalSchedule = By.xpath("//*[@id='sidebar']/ul/li[3]/a");

    public WebElement getFinalSchedule() {
        return driver.findElement(finalSchedule);
    }


    public By degreePrograms = By.xpath("//*[@id=\"sidebar\"]/ul/li[4]/a");

    public WebElement getDegreePrograms() {
        return driver.findElement(degreePrograms);
    }

    public By HoveroverAcademics = By.xpath("//span[text()='Academics']");

    public WebElement getHoveroverAcademics() {
        driver.get("http://qatest2119.na.edu/");
        WebDriverWait wait = new WebDriverWait(driver, 10);
        Actions myAction = new Actions(driver);
        WebElement myWebElement = driver.findElement(By.xpath("//span[text()='Academics']"));
        myAction.moveToElement(myWebElement);
        myAction.moveToElement(myWebElement).build().perform();
        return driver.findElement(HoveroverAcademics);
    }

}