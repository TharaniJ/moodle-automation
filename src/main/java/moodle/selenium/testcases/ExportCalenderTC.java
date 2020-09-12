package moodle.selenium.testcases;
import moodle.selenium.pom.pages.CalenderPage;
import moodle.selenium.pom.pages.HomePage;
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

public class ExportCalenderTC {

    Logger LOGGERS = LoggerFactory.getLogger(ExportCalenderTC.class);
    WebDriver webDriver;

    @BeforeClass
    public void InitiateWebDriver() {
        System.setProperty("webdriver.chrome.driver", "C:/EDU/Software/chromedriver_win32/chromedriver.exe");
        webDriver = new ChromeDriver();

    }

    @Test
    public void ExportCalender() {
        try {
            webDriver.get("https://school.moodledemo.net/");
            webDriver.manage().window().maximize();
            LOGGERS.info("Navigated to moodle page and maximized");

            HomePage homePage = PageFactory.initElements(webDriver, HomePage.class);
            WebDriverWait waitForCalenderLink = new WebDriverWait(webDriver,10);
            waitForCalenderLink.until(ExpectedConditions.elementToBeClickable(homePage.getCalendar()));
            homePage.getCalendar().click();
            LOGGERS.info("Clicked on calender");
/*
            CalenderPage calenderPage = PageFactory.initElements(webDriver, CalenderPage.class);
            WebDriverWait waitToSelectCalender = new WebDriverWait(webDriver,10);
            waitToSelectCalender.until(ExpectedConditions.elementToBeClickable(calenderPage.getSelectCalender()));
            calenderPage.getSelectCalender().click();

            WebDriverWait waitToSelectCalenderOption = new WebDriverWait(webDriver,10);
            waitToSelectCalenderOption.until(ExpectedConditions.elementToBeClickable(calenderPage.getSelectCalenderOption()));
            calenderPage.getSelectCalenderOption().click();
            LOGGERS.info("Select month from drop down");
            Thread.sleep(4000);
*/
            CalenderPage calenderPage = PageFactory.initElements(webDriver, CalenderPage.class);
            WebDriverWait waitToClickExportCalender = new WebDriverWait(webDriver,10);
            waitToClickExportCalender.until(ExpectedConditions.elementToBeClickable(calenderPage.getSubmitExportButton()));
            calenderPage.getSubmitExportButton().click();
            LOGGERS.info("Clicked on export button");

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
