package com.pages;

import com.web.WebDriverUtils;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    /** Username text box */
    @FindBy(xpath = "//input[@placeholder='Username']") 
    public WebElement usernameTextBox;

    /** Password text box */
    @FindBy(xpath = "//input[@placeholder='Password']")
    public WebElement passwordTextBox;

    @FindBy(xpath = "//button[normalize-space()='Sign In']")
    public WebElement signInButton;

    public LoginPage() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }

}
