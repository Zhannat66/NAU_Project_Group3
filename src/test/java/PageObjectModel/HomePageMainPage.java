package PageObjectModel;

import Common.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePageMainPage extends Base {


    public By click = By.xpath ("//*[@id='menu-item-103']/a/span");

    public WebElement getClickPortal() {
        return driver.findElement (click);
    }
    public By clickAply = By.xpath ("//li[@id='menu-item-654']/a/span");

    public WebElement getClickApplyNow() {
        return driver.findElement (clickAply);
    }


    By clickAcademics=By.xpath ("//li[@id='menu-item-645']/a/span");
    public WebElement getClickAcademics(){
        return driver.findElement (clickAcademics);
    }

    By clickAdmission=By.xpath ("//li[@id='menu-item-107']/a/span");
    public WebElement getClickAdmissions(){
        return driver.findElement (clickAdmission);


}
    By clickCampusLife=By.xpath ("//li[@id='menu-item-897']/a/span[1]");
    public WebElement getClickCampusLife(){
        return driver.findElement (clickCampusLife);

}
@FindBy(xpath = "// li[@id='menu-item-898']/a/span")
public WebElement visitStudents;
public  void visitToStudentPage(){
    visitStudents.click ();
}
@FindBy(how= How.XPATH,using= "//span[contains(text(),'About NAU')]")
  WebElement visitNau;

    public void getVisitNau() {
        visitNau.click ();

    }
    @FindBy(xpath = "//*[@id='custom_html-4']/div[1]/a/img")
    public WebElement clickBottom;
    public void clickBottomLogo(){
        clickBottom.click ();
    }

}

