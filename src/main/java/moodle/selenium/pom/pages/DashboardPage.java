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

    @FindBy(xpath = "//*[@id='nav-drawer']/nav[2]/ul/li/a/div/div/span[2]")
    @CacheLookup
    private WebElement siteAdministrator;

    public WebElement getSiteAdministrator() { return siteAdministrator; }
    public WebElement getProfileLink() { return profileLink; }
    public WebElement getDashboardLink() { return dashboardLink; }
    public WebElement getLogoutLink() { return logoutLink; }
}
