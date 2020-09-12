package moodle.selenium.automationsequences;

import moodle.selenium.pom.pages.HomePage;
import moodle.selenium.pom.pages.LoginPage;
import moodle.selenium.testcases.LogoutTC;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogInAutomationSequence {

    private Logger LOGGERS = LoggerFactory.getLogger(LogoutTC.class);

    public void loginSequences(WebDriver webDriver, String userName, String password) {

        try {
            HomePage moodleHomePage = PageFactory.initElements(webDriver, HomePage.class);
            moodleHomePage.getLoginLink().click();
            LOGGERS.info("Click log In button ");

            LoginPage moodleLoginPage = PageFactory.initElements(webDriver, LoginPage.class);
            moodleLoginPage.getUsernameTextBox().sendKeys(userName);
            LOGGERS.info("Send username");

            moodleLoginPage.getPwdTextBox().sendKeys(password);
            LOGGERS.info("SendPassword");

            moodleLoginPage.getRememberUserCheckBox().isSelected();
            LOGGERS.info("Checked check box");

            moodleLoginPage.getLoginButton().click();
            LOGGERS.info("Clicked on login button");

        } catch (Exception e) {
            LOGGERS.info("Error Occurred!", e);
        }
    }

}


