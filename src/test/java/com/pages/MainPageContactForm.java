package com.pages;

import com.web.WebDriverUtils;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPageContactForm {

    /** Let me hack! button */
    @FindBy(xpath = "//button[normalize-space()='Let me hack!']")
    public WebElement letMeHackButton;

    /** Name text box */
    @FindBy(xpath = "//input[@id='name']")
    public WebElement nameTextBox;

    /** E-mail text box */
    @FindBy(xpath = "//input[@id='email']")
    public WebElement emailTextBox;

    /** Phone text box */
    @FindBy(xpath = "//input[@id='phone']")
    public WebElement phoneTextBox;

    /** Subject text box */
    @FindBy(xpath = "//input[@id='subject']")
    public WebElement subjectTextBox;

    /** Message text box */
    @FindBy(xpath = "//textarea[@id='description']")
    public WebElement messageTextBox;

    /** Submit button */
    @FindBy(xpath = "//button[@id='submitContact']")
    public WebElement submitButton;

    /** Thanks text box */
    @FindBy(xpath = "//*[@id='root']/div[2]/div/div[5]/div[2]/div/h2/text()[1]")
    public WebElement thanksForGetingInTouchTextBox;

    /** Will get back text box */
    @FindBy(xpath = "/html/body/div/div[2]/div/div[5]/div[2]/div/p[1]")
    public WebElement willGetBackTextBox;

    /** Subject string text box */
    @FindBy(xpath = "/html/body/div/div[2]/div/div[5]/div[2]/div/p[2]")
    public WebElement subjectStringTextBox;

    /** ASAP Text box */
    @FindBy(xpath = "/html/body/div/div[2]/div/div[5]/div[2]/div/p[3]")
    public WebElement asapTextBox;

    /** Room section */
    @FindBy(xpath = "//h2[normalize-space()='Rooms']")
    public WebElement roomSection;

    /** Book this room button */
    @FindBy(xpath = "//button[normalize-space()='Book this room']")
    public WebElement bookThisRoomButton;

    public MainPageContactForm() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }

}
