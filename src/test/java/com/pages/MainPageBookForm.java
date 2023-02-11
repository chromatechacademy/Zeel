package com.pages;

import com.web.WebDriverUtils;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPageBookForm {

  /** First Name text box */
  @FindBy(xpath = "//input[@placeholder='Firstname']")
  public WebElement firstNameBookBox;

  /** Last Name text box */
  @FindBy(xpath = "//input[@placeholder='Lastname']")
  public WebElement lastNameBookBox;

  /** Email text box */
  @FindBy(xpath = "//input[@placeholder='Email']")
  public WebElement emailBookBox;

  /** Phone text box */
  @FindBy(xpath = "//input[@placeholder='Phone']")
  public WebElement phoneBookBox;

  /** Book button */
  @FindBy(xpath = "//button[normalize-space()='Book']")
  public WebElement bookButton;

  /** Before first day at booking calendar 3 should be 5*/
  @FindBy(xpath = "(((//div[@class='rbc-month-view']/div)[5]/div)[1]/div)[1]")
  public WebElement beforeFirstDayBox;

  /** Last day at booking calendar */
  @FindBy(xpath = "(((//div[@class='rbc-month-view']/div)[5]/div)[1]/div)[3]")
  public WebElement lastDayBox;

  /** Booking success text */
  @FindBy(xpath="//div/br/following-sibling::h3")
  public WebElement bookingSuccessText;

  /** Booking success confirmation text */
  @FindBy(xpath="(//div/br/following-sibling::p)[1]")
  public WebElement bookingConfirmedText;

  /** Booking success dates text */
  @FindBy(xpath = "(//div/br/following-sibling::p)[2]")
  public WebElement bookingDatesText;

  /** Booking success close button */
  @FindBy(xpath = "//button[contains(text(),'Close')]")
  public WebElement bookingConfirmationCloseButton;

  public MainPageBookForm() {
    PageFactory.initElements(WebDriverUtils.driver, this);
  }

}