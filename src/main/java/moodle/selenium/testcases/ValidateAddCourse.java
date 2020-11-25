package moodle.selenium.testcases;

import moodle.selenium.automationsequences.LogInAutomationSequence;
import moodle.selenium.pom.pages.DashboardPage;
import moodle.selenium.pom.pages.SiteAdministratorPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ValidateAddCourse {

    Logger LOGGERS = LoggerFactory.getLogger(LoginWithInvalidCredentialTC.class);
    WebDriver webDriver;

    @BeforeClass
    public void InitiateWebDriver() {
        System.setProperty("webdriver.chrome.driver", "C:/EDU/Software/chromedriver_win32/chromedriver.exe");
        webDriver = new ChromeDriver();


        webDriver.get("https://school.moodledemo.net/");
        webDriver.manage().window().maximize();
        LOGGERS.info("Navigated to moodle page and maximized");
    }


    @Test
    public void addCourse() {
        try {

            //Runs the login sequence. At the end of it the browser will have the dashboard page.
            LogInAutomationSequence logInAutomationSequence = new LogInAutomationSequence();
            logInAutomationSequence.loginSequences(webDriver, "manager", "moodle");

            //click site administrator
            DashboardPage dashboardPage = PageFactory.initElements(webDriver, DashboardPage.class);
            WebDriverWait waitForSiteAdministrator = new WebDriverWait(webDriver, 10);
            waitForSiteAdministrator.until(ExpectedConditions.elementToBeClickable(dashboardPage.getSiteAdministrator()));
            dashboardPage.getSiteAdministrator().click();
            LOGGERS.info("clicked on side administrator link");

            //click Course tab
            SiteAdministratorPage siteAdministratorPage = PageFactory.initElements(webDriver, SiteAdministratorPage.class);
            WebDriverWait waitForCourseTab = new WebDriverWait(webDriver, 10);
            waitForCourseTab.until(ExpectedConditions.elementToBeClickable(siteAdministratorPage.getCourseTab()));
            siteAdministratorPage.getCourseTab().click();
            LOGGERS.info("clicked on Course tab");

            siteAdministratorPage.getAddNewCourse().click();
            LOGGERS.info("clicked on Add new course link");

        } catch (Exception e) {
            LOGGERS.info("Error Occurred!", e);
        }

    }

    @AfterMethod
    public void CloseWebDriver() {
        webDriver.close();
        webDriver.quit();
        LOGGERS.info("Browser close successfully!");

    }
}
