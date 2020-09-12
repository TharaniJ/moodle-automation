package moodle.selenium.testcases;

import moodle.selenium.automationsequences.LogInAutomationSequence;
import moodle.selenium.pom.pages.HomePage;
import moodle.selenium.pom.pages.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class LoginWithInvalidCredentialTC {

    Logger LOGGERS = LoggerFactory.getLogger(LoginWithInvalidCredentialTC.class);
    WebDriver webDriver;

    @BeforeClass
    public void InitiateWebDriver() {
        System.setProperty("webdriver.chrome.driver","C:/EDU/Software/chromedriver_win32/chromedriver.exe");
        webDriver = new ChromeDriver();
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        webDriver.get("https://school.moodledemo.net/");
        webDriver.manage().window().maximize();
        LOGGERS.info("Navigated to moodle page and maximized");
    }


    @Test
    public void loginWithInvalidPWDTestCase() {
        try {

            //Runs the login sequence. At the end of it the browser will have the dashboard page.
            LogInAutomationSequence logInAutomationSequence = new LogInAutomationSequence();
            logInAutomationSequence.loginSequences(webDriver,"student", "moodle");


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
