package moodle.selenium.pom.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class SiteAdministratorPage {

    @FindBy(xpath = "//*[@id='region-main']/div/ul/li[2]")
    @CacheLookup
    private WebElement userTab;

    @FindBy(xpath = "//*[@id='linkusers']/div/div[2]/div[2]/ul/li[3]/a")
    @CacheLookup
    private WebElement addNewUser;

    @FindBy(xpath = "//a[contains(text(),'Courses')]")
    @CacheLookup
    private WebElement courseTab;

    @FindBy(xpath = "//a[contains(text(),'Add a new course')]")
    @CacheLookup
    private WebElement addNewCourse;

    public WebElement getCourseTab() { return courseTab; }
    public WebElement getUserTab() { return userTab; }
    public WebElement getAddNewUser() { return addNewUser; }
    public WebElement getAddNewCourse() { return addNewCourse; }

}
