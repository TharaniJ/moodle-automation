package moodle.selenium.pom.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
    @FindBy(id="username")
    @CacheLookup
    private WebElement usernameTextBox;

    @FindBy(id="password")
    @CacheLookup
    private WebElement pwdTextBox;

    @FindBy(id = "rememberusername")
    @CacheLookup
    private WebElement rememberUserCheckBox;

    @FindBy(id="loginbtn")
    @CacheLookup
    private WebElement loginButton;

    @FindBy(id = "loginerrormessage")
    @CacheLookup
    private WebElement loginErrorMessage;

    public WebElement getUsernameTextBox() { return usernameTextBox; }

    public WebElement getPwdTextBox() { return pwdTextBox; }

    public WebElement getLoginButton() { return loginButton; }

    public WebElement getLoginErrorMessage() { return loginErrorMessage; }

    public WebElement getRememberUserCheckBox() { return rememberUserCheckBox; }

}
