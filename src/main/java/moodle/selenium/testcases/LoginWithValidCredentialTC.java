package moodle.selenium.testcases;

import moodle.selenium.automationsequences.LogInAutomationSequence;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class LoginWithValidCredentialTC {

    Logger LOGGERS = LoggerFactory.getLogger(LoginWithValidCredentialTC.class);
    WebDriver webDriver;

    @BeforeClass
    public void InitiateWebDriver() {
        System.setProperty("webdriver.chrome.driver","C:/EDU/Software/chromedriver_win32/chromedriver.exe");
        webDriver = new ChromeDriver();
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }


    @Test
    public void LoginWithInvalidPWDTestCase() {
        try {

            webDriver.get("https://school.moodledemo.net/");
            webDriver.manage().window().maximize();
            LOGGERS.info("Navigated to moodle page and maximized");

            //Runs the login sequence. At the end of it the browser will have the dashboard page.
            LogInAutomationSequence logInAutomationSequence = new LogInAutomationSequence();
            logInAutomationSequence.loginSequences(webDriver,"student", "moodle");

            String actualResult = webDriver.getTitle();
            String expectedResult = "Dashboard";
            LOGGERS.info("Actual : " + actualResult + " Expected : " + expectedResult);
            Assert.assertEquals(actualResult,expectedResult);

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
