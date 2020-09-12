package moodle.selenium.pom.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class HomePage {

    @FindBy(xpath = "//*[@id='page-wrapper']/nav//a[text()='Log in']")
    @CacheLookup
    private WebElement loginLink;

    @FindBy(id = "id_q_5f4dcdcc1a0b3")
    @CacheLookup
    private  WebElement search;

    @FindBy(xpath = "//nav//ul/li/a[@class = \"dropdown-toggle nav-link\"]")
    @CacheLookup
    private WebElement websiteLanguage;

    @FindBy(xpath = "//nav/ul//li/a[@data-key = 'home']")
    @CacheLookup
    private WebElement home;

    @FindBy(xpath = "//nav/ul//li/a[@data-key = 'calendar']")
    @CacheLookup
    private WebElement Calendar;

    public WebElement getLoginLink() { return loginLink; }

    public WebElement getSearch() { return search; }

    public WebElement getWebsiteLanguage() { return websiteLanguage; }

    public WebElement getHome() { return home; }

    public WebElement getCalendar() { return Calendar; }
}
