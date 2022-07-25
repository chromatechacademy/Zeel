package com.stepDefinitions;

import org.testng.Assert;

import com.constants.ApplicationConstants;
import com.pages.LoginPage;
import com.web.WebDriverUtils;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDef {

    LoginPage loginPage = new LoginPage();

    @Given("a teacher is on the CTSMS login page")
    public void a_teacher_is_on_the_CTSMS_login_page() {

        WebDriverUtils.driver.get(ApplicationConstants.APPLICATION_URL);

    }

    @When("the teacher logs in with username {string} and password {string}")
    public void the_teacher_logs_in_with_username_and_password(String username, String password) {

        loginPage.usernameTextBox.sendKeys(username);
        loginPage.passwordTextBox.sendKeys(password);
        loginPage.signInButton.click();

    }

    @Then("the teacher should be succesfully logged in and page title is {string}")
    public void the_teacher_should_be_succesfully_logged_in_and_page_title_is(String expectedPageTitle) {

        String actualPageTitle = WebDriverUtils.driver.getTitle();

        Assert.assertTrue(expectedPageTitle.contentEquals(actualPageTitle));

    }

    @When("a user attempts to login with invalid credentials such as username {string} and password {string}")
    public void a_user_attempts_to_login_with_invalid_credentials_such_as_username_and_password(String invalidUsername,
            String invalidPassword) {

        loginPage.usernameTextBox.sendKeys(invalidUsername);
        loginPage.passwordTextBox.sendKeys(invalidPassword);
        loginPage.signInButton.click();

    }

}
