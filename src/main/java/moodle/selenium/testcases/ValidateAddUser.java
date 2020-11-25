package moodle.selenium.testcases;

import moodle.selenium.automationsequences.LogInAutomationSequence;
import moodle.selenium.pom.pages.AddNewUser;
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

import java.util.concurrent.TimeUnit;

public class ValidateAddUser {
    Logger LOGGERS = LoggerFactory.getLogger(LoginWithInvalidCredentialTC.class);
    WebDriver webDriver;

    @BeforeClass
    public void InitiateWebDriver() {
        System.setProperty("webdriver.chrome.driver","C:/EDU/Software/chromedriver_win32/chromedriver.exe");
        webDriver = new ChromeDriver();


        webDriver.get("https://school.moodledemo.net/");
        webDriver.manage().window().maximize();
        LOGGERS.info("Navigated to moodle page and maximized");
    }


    @Test
    public void addUser() {
        try {

            //Runs the login sequence. At the end of it the browser will have the dashboard page.
            LogInAutomationSequence logInAutomationSequence = new LogInAutomationSequence();
            logInAutomationSequence.loginSequences(webDriver,"manager", "moodle");

            //click site administrator
            DashboardPage dashboardPage = PageFactory.initElements(webDriver,DashboardPage.class);
            WebDriverWait waitForSiteAdministrator = new WebDriverWait(webDriver,10);
            waitForSiteAdministrator.until(ExpectedConditions.elementToBeClickable(dashboardPage.getSiteAdministrator()));
            dashboardPage.getSiteAdministrator().click();
            LOGGERS.info("clicked on side administrator link");

            //click user tab
            SiteAdministratorPage siteAdministratorPage = PageFactory.initElements(webDriver,SiteAdministratorPage.class);
            WebDriverWait waitForUserTab = new WebDriverWait(webDriver,10);
            waitForUserTab.until(ExpectedConditions.elementToBeClickable(siteAdministratorPage.getUserTab()));
            siteAdministratorPage.getUserTab().click();
            LOGGERS.info("clicked on user tab");

            siteAdministratorPage.getAddNewUser().click();
            LOGGERS.info("clicked on add new user link");

            AddNewUser addNewUser = PageFactory.initElements(webDriver,AddNewUser.class);
            WebDriverWait waitAddNewUser = new WebDriverWait(webDriver,10);
            waitAddNewUser.until(ExpectedConditions.elementToBeClickable(addNewUser.getUserName()));
            addNewUser.getUserName().sendKeys("thara");
            LOGGERS.info("Added Username");

            addNewUser.getFirstName().sendKeys("thara");
            addNewUser.getSurName().sendKeys("jeya");
            addNewUser.getEmailAddress().sendKeys("tharaj@gmail.com");
            LOGGERS.info("Added name, surname and  email address");

            addNewUser.getEditPasswordLink().click();
            LOGGERS.info("clicked on password edit link");
            addNewUser.getNewPassword().sendKeys("thara");
            LOGGERS.info("Entered new password");

            addNewUser.getCreateUser().click();
            LOGGERS.info("Created a user");
/*
            //Validating the added user
            addNewUser.getValidateUser().sendKeys("thara jeya");
            addNewUser.getEditPasswordLink().click();
            Thread.sleep(3000);

*/
        } catch(Exception e) {
            LOGGERS.info("Error Occurred!",e);
        }
    }


    @AfterMethod
    public void CloseWebDriver() {
        webDriver.close();
        webDriver.quit();
        LOGGERS.info("Browser close successfully!");

    }

}
