package moodle.selenium.pom.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class CalenderPage {


    @FindBy(id = "calendarviewdropdown")
    @CacheLookup
    private WebElement selectCalender;

    @FindBy(xpath = "//*[@id=\"yui_3_17_2_1_1599570413063_226\"]/ul/li[1]/a")
    @CacheLookup
    private WebElement selectCalenderOption;

    @FindBy(id = "single_button5f56f5240f1d910")
    @CacheLookup
    private WebElement submitExportButton;

    @FindBy(id = "id_generateurl")
    @CacheLookup
    private WebElement generateURL;

    @FindBy(id="id_export")
    @CacheLookup
    private  WebElement exportCalender;

//Locating radio button

    @FindBy(id="id_events_exportevents_all")
    @CacheLookup
    private  WebElement RdoBtnAllEvent;

    @FindBy(id="id_events_exportevents_categories")
    @CacheLookup
    private  WebElement RdoBtnRelatedToEventCategory;

    @FindBy(id="id_events_exportevents_courses")
    @CacheLookup
    private  WebElement RdoBtnRelatedToEventCourses;

    @FindBy(id="id_events_exportevents_groups")
    @CacheLookup
    private  WebElement RdoBtnRelatedToEventGroups;

    @FindBy(id="id_events_exportevents_user")
    @CacheLookup
    private  WebElement RdoBtnRelatedToEventUsers;

    @FindBy(id="id_period_timeperiod_weeknow")
    @CacheLookup
    private  WebElement RdoBtnAllTimePeriodWeek;

    @FindBy(id="id_period_timeperiod_monthnow")
    @CacheLookup
    private  WebElement RdoBtnAllTimePeriodMonth;

    @FindBy(id="id_period_timeperiod_recentupcoming")
    @CacheLookup
    private  WebElement RdoBtnAllTimePeriodNxt60Days;

    @FindBy(id="id_events_exportevents_groups")
    @CacheLookup
    private  WebElement id_period_timeperiod_custom;

    public WebElement getSelectCalender() {
        return selectCalender;
    }

    public WebElement getSelectCalenderOption() {
        return selectCalenderOption;
    }

    public WebElement getSubmitExportButton() {
        return submitExportButton;
    }

    public WebElement getGenerateURL() {
        return generateURL;
    }

    public WebElement getExportCalender() {
        return exportCalender;
    }

    public WebElement getRdoBtnAllEvent() {
        return RdoBtnAllEvent;
    }

    public WebElement getRdoBtnRelatedToEventCategory() {
        return RdoBtnRelatedToEventCategory;
    }

    public WebElement getRdoBtnRelatedToEventCourses() {
        return RdoBtnRelatedToEventCourses;
    }

    public WebElement getRdoBtnRelatedToEventGroups() {
        return RdoBtnRelatedToEventGroups;
    }

    public WebElement getRdoBtnRelatedToEventUsers() {
        return RdoBtnRelatedToEventUsers;
    }

    public WebElement getRdoBtnAllTimePeriodWeek() {
        return RdoBtnAllTimePeriodWeek;
    }

    public WebElement getRdoBtnAllTimePeriodMonth() {
        return RdoBtnAllTimePeriodMonth;
    }

    public WebElement getRdoBtnAllTimePeriodNxt60Days() {
        return RdoBtnAllTimePeriodNxt60Days;
    }

    public WebElement getId_period_timeperiod_custom() {
        return id_period_timeperiod_custom;
    }
}
