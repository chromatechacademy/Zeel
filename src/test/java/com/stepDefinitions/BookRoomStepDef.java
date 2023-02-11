package com.stepDefinitions;

import org.openqa.selenium.interactions.Actions;

import com.pages.BookingRoomConfirmModal;
import com.pages.MainPageBookForm;
import com.pages.MainPageContactForm;
import com.web.CommonUtils;
import com.web.JavascriptUtils;
import com.web.WebDriverUtils;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BookRoomStepDef {
    MainPageBookForm mainPageBookForm = new MainPageBookForm();
    MainPageContactForm mainPageContactForm = new MainPageContactForm();

    @When("a user scrolls down to the book this room section")
    public void a_user_scrolls_down_to_the_book_this_room_section() {
        JavascriptUtils.scrollIntoView(mainPageContactForm.bookThisRoomButton);
    }

    @When("the user clicks on Book this room button")
    public void the_user_clicks_on_Book_this_room_button() {
        if (mainPageContactForm.bookThisRoomButton.isDisplayed()) {
            CommonUtils.click(mainPageContactForm.bookThisRoomButton);
        }
    }

    @When("the  user selects single night")
    public void the_user_selects_single_night() {
        Actions actions = new Actions(WebDriverUtils.driver);
        actions.clickAndHold(mainPageBookForm.beforeFirstDayBox).perform();
        actions.moveToElement(mainPageBookForm.lastDayBox).perform();
        actions.moveByOffset(150, 0).perform();
        actions.release().perform();
    }

    @When("the user fills out the following fields {string}, {string}, {string}, {string}")
    public void the_ser_fills_out_the_following_fields(String firstName, String lastName, String email, String phone) {
        CommonUtils.sendKeys(mainPageBookForm.firstNameBookBox, firstName);
        CommonUtils.sendKeys(mainPageBookForm.lastNameBookBox, lastName);
        CommonUtils.sendKeys(mainPageBookForm.emailBookBox, email);
        CommonUtils.sendKeys(mainPageBookForm.phoneBookBox, phone);
    }

    @When("the user clicks on Book button")
    public void the_user_clicks_on_Book_button() {
        CommonUtils.click(mainPageBookForm.bookButton);
    }

    @Then("the message is displayed on the confirmation modal {string}, {string}, {string}")
    public void the_message_is_displayed_on_the_confirmation_modal(String bookingSuccess, String confirmed,
            String bookedDates) {
        String actualBookingSuccess = mainPageBookForm.bookingSuccessText.getText();
        CommonUtils.assertEquals(bookingSuccess, actualBookingSuccess);

        String actualConfirmed = mainPageBookForm.bookingConfirmedText.getText();
        CommonUtils.assertEquals(actualConfirmed, confirmed);

        String actualBookingDates = mainPageBookForm.bookingDatesText.getText();
        CommonUtils.assertEquals(actualBookingDates, bookedDates);

        mainPageBookForm.bookingConfirmationCloseButton.click();
    }

}
