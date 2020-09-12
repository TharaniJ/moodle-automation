package moodle.selenium.pom.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class DashboardPage {


    @FindBy(id = "action-menu-toggle-1")
    @CacheLookup
    private WebElement dashboardLink;

    @FindBy(id = "actionmenuaction-6")
    @CacheLookup
    private WebElement logoutLink;

    @FindBy(id="actionmenuaction-2")
    @CacheLookup
    private WebElement profileLink;

    public WebElement getProfileLink() {
        return profileLink;
    }
    public WebElement getDashboardLink() { return dashboardLink; }
    public WebElement getLogoutLink() { return logoutLink; }
}
