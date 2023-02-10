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

  /** First day at booking calendar */
  @FindBy(xpath = "//body[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[2]/div[2]/div[1]/div[2]/div[5]/div[2]/div[1]/div[2]")
  public WebElement firstDay;

  /** Last day at booking calendar */
  @FindBy(xpath = "//*[@id='root']/div/div/div[4]/div/div[2]/div[2]/div/div[2]/div[5]/div[2]/div/div[3]")
  public WebElement lastDay;

  public MainPageBookForm() {
    PageFactory.initElements(WebDriverUtils.driver, this);
  }

}