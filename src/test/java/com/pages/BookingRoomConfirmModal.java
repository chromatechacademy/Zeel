package com.pages;

import com.web.WebDriverUtils;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingRoomConfirmModal {
   
    /**Successful Booking Box */
    @FindBy(css = "body > div.ReactModalPortal > div > div > div:nth-child(1) > div.col-sm-6.text-center")
    public WebElement phoneBookBox;

    /** Close button */
    @FindBy(xpath = "//button[@class='btn btn-outline-primary']")
    public WebElement closeBookingSuccessButton;

    public BookingRoomConfirmModal() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }

}
