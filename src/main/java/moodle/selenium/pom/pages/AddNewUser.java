package moodle.selenium.pom.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class AddNewUser {

    @FindBy(id = "id_username")
    @CacheLookup
    private WebElement userName;

    @FindBy(id = "id_firstname")
    @CacheLookup
    private WebElement firstName;

    @FindBy(id = "id_lastname")
    @CacheLookup
    private WebElement surName;

    @FindBy(id = "id_email")
    @CacheLookup
    private WebElement emailAddress;

    @FindBy(xpath = "//em[contains(text(),'Click to enter text')]")
    @CacheLookup
    private WebElement editPasswordLink;

    @FindBy(id = "id_newpassword")
    @CacheLookup
    private WebElement newPassword;

    @FindBy(id = "id_submitbutton")
    @CacheLookup
    private WebElement createUser;

    @FindBy(id = "id_realname")
    @CacheLookup
    private WebElement validateUser;

    @FindBy(id = "id_addfilter")
    @CacheLookup
    private WebElement addFilterButton;

    public WebElement getAddFilterButton() { return addFilterButton; }

    public WebElement getValidateUser() { return validateUser; }

    public WebElement getCreateUser() { return createUser; }

    public WebElement getUserName() { return userName; }

    public WebElement getFirstName() { return firstName; }

    public WebElement getSurName() { return surName; }

    public WebElement getEmailAddress() { return emailAddress; }

    public WebElement getEditPasswordLink() { return editPasswordLink; }

    public WebElement getNewPassword() { return newPassword; }
}
