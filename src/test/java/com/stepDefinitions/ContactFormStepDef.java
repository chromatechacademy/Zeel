package com.stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import com.constants.ApplicationConstants;
import com.pages.MainPageContactForm;
import com.web.CommonUtils;
import com.web.JavascriptUtils;
import com.web.WebDriverUtils;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ContactFormStepDef {

    MainPageContactForm mainPageContactForm = new MainPageContactForm();

    @Given("a user navigate to the URL")
    public void a_user_navigate_to_the_URL() {
        WebDriverUtils.driver.get(ApplicationConstants.APPLICATION_URL);
    }

    @Given("a user clicks on Let me hack! button if the page title {string}")
    public void a_user_clicks_on_Let_me_hack_button_if_the_page_title(String expectedTitlePage) {
        String actualTitlePage = WebDriverUtils.driver.getTitle();
        if (actualTitlePage.equals(expectedTitlePage)) {
            CommonUtils.click(mainPageContactForm.letMeHackButton);
        }
    }

    @When("a user scrolls down to the contact form section")
    public void a_user_scrolls_down_to_the_contact_form_section() throws InterruptedException {
        JavascriptUtils.scrollIntoView(mainPageContactForm.nameTextBox);
        Thread.sleep(5000);
    }

    @When("a user fills out the following fields {string}, {string}, {string}, {string}, {string}")
    public void a_user_fills_out_the_following_fields(String name, String email, String phone, String subject,
            String message) throws InterruptedException {
        CommonUtils.sendKeys(mainPageContactForm.nameTextBox, name);
        CommonUtils.sendKeys(mainPageContactForm.emailTextBox, email);
        CommonUtils.sendKeys(mainPageContactForm.phoneTextBox, phone);
        CommonUtils.sendKeys(mainPageContactForm.subjectTextBox, subject);
        CommonUtils.sendKeys(mainPageContactForm.messageTextBox, message);

        Thread.sleep(9000);
    }

    @When("a user clicks on the Submit button")
    public void a_user_clicks_on_the_Submit_button() throws InterruptedException {
        CommonUtils.click(mainPageContactForm.submitButton);

        Thread.sleep(9000);
    }

    @Then("the message is displayed {string}, {string}, {string}, {string}")
    public void the_message_is_displayed(String textRow1, String textRow2, String textRow3, String textRow4) {
        String actualTextRow1 = CommonUtils.getText(mainPageContactForm.thanksForGetingInTouchTextBox);
        System.out.println(actualTextRow1);

    }

}
