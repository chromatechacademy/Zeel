package com.stepDefinitions;

import com.constants.ApplicationConstants;
import com.pages.LoginPage;
import com.web.WebDriverUtils;

public class LoginStepDef {

    public static void main(String[] args) {

        /** Calling setUp() method from WebDriverUtils class */
        WebDriverUtils.setUp();

        /** Initializing LoginPage class */
        LoginPage obj = new LoginPage();

        /** Navigating to the Chrome Tech URL */
        WebDriverUtils.driver.get(ApplicationConstants.APPLICATION_URL);

        /** Sending username to username text box */
        obj.usernameTextBox.sendKeys(ApplicationConstants.USERNAME);

        /** Sending password to password text box */
        obj.passwordTextBox.sendKeys(ApplicationConstants.PASSWORD);

        /** Clicking on Sign In button */
        obj.signInButton.click();

        /** Quitting browser session */
        WebDriverUtils.driver.quit();

    }

}
