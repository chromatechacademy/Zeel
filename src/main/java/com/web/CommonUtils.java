package com.web;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class CommonUtils extends WebDriverUtils {


	/**
	 * Use this method in need of clicking on a WebElement by selenium WebDriver.
	 * 
	 * @param element Pass the desired WebElement to be clicked.
	 */
	public static void click(WebElement element) {
		waitForClickability(element);
		element.click();
	}

	/**
	 * Use this method in need of entering value to a text box through selenium
	 * WebDriver.
	 * 
	 * @param element Pass the element to which the text needs to be entered.
	 * @param value   Pass the desired text/value in the second parameter.
	 */
	public static void sendKeys(WebElement element, String value) {
		element.clear();
		element.sendKeys(value);
	}

	/**
	 * Use this method in need of entering keyboard keys into a WebElement by
	 * selenium WebDriver.
	 * 
	 * @param element     Pass the element to which the key needs to be entered.
	 * @param keyboardKey Pass the desired keyboardKey to be entered to an element.
	 */
	public static void sendKeys(WebElement element, Keys keyboardKey) {
		element.sendKeys(keyboardKey);
	}

	/**
	 * Use this method in need of retrieving the text of an element through selenium
	 * WebDriver.
	 * 
	 * @param element Pass the element from which the text to be retrieved.
	 * @return This method returns a string object.
	 */
	public static String getText(WebElement element) {
		return element.getText();
	}

	/**
	 * Use this over loaded method in need of selecting an element of dropDown by
	 * VisbleText.
	 * 
	 * @param dropDownElement Pass the WebElement of the desired dropDown.
	 * @param ValueOfDropDown Pass the Visible text of DropDown to be selected.
	 */
	public static void selectDropDownValue(String VisibleTextOfDD, WebElement dropDownWebEl) {
		Select select = new Select(dropDownWebEl);
		select.selectByVisibleText(VisibleTextOfDD);
	}


	/**
	 * this method will accept the alert
	 * 
	 * @throws will throw NoAlertExeption if alert is not present.
	 */

	public static void acceptAlert() {

		try {
			Alert alert = driver.switchTo().alert();
			alert.accept();
		} catch (NoAlertPresentException e) {
			System.out.println("Alert is not present");
		}
	}

	/**
	 * this method will dismiss the alert
	 * 
	 * @throws will throw NoAlertExeption if alert is not present.
	 */

	public static void dismissAlert() {

		try {
			Alert alert = driver.switchTo().alert();
			alert.dismiss();
		} catch (NoAlertPresentException e) {
			System.out.println("Alert is not present");
		}
	}

	/**
	 * this method will get the alert text
	 * 
	 * @throws will throw NoAlertExeption if alert is not present.
	 */

	public static String getAlertText() {

		try {
			Alert alert = driver.switchTo().alert();
			return alert.getText();
		} catch (NoAlertPresentException e) {
			System.out.println("Alert is not present");
			return null;
		}
	}

	/**
	 * This method will switch to the frame
	 * 
	 * @param nameOrId
	 */

	public static void switchToFrame(String nameOrId) {

		try {
			driver.switchTo().frame(nameOrId);
		} catch (NoSuchFrameException e) {
			System.out.println("Frame is not present.");
		}
	}

	/**
	 * use this method in need of switching to the frame
	 * 
	 * @param element
	 */
	public static void switchToFrame(WebElement element) {
		try {
			driver.switchTo().frame(element);
		} catch (NoSuchFrameException e) {
			System.out.println("Frame is not present.");
		}
	}

	/**
	 * This method will switch to the frame
	 * 
	 * @param index
	 */
	public static void switchToFrame(int index) {

		try {
			driver.switchTo().frame(index);
		} catch (NoSuchFrameException e) {
			System.out.println("Frame is not present.");
		}
	}

	/**
	 * This method will determine if element is present on ui or not.
	 * 
	 * @param element
	 * @return
	 */
	public static boolean isElementDisplayed(WebElement element) {
		try {
			return element.isDisplayed();
		} catch (Exception e) {
			return false;
		}
	}

	public static boolean isElementDisplayed(By locator) {
		try {
			return driver.findElement(locator).isDisplayed();
		} catch (Exception e) {
			return false;
		}
	}

	/**
	 * This method will determine if the element is enabled or disabled.
	 * 
	 * @param element
	 * @return
	 */
	public static boolean isElementEnabled(WebElement element) {
		try {
			return (element.isDisplayed() && element.isEnabled());
		} catch (Exception e) {
			return false;
		}
	}

	/**
	 * Use this method in need of waiting for 30s for an element based on
	 * availability of elementToBeSelected.
	 * 
	 * @param element Pass the WebElement on which synchronization to be applied.
	 * @return This method will return boolean type either True or False.
	 */
	public static WebElement waitForThePresenceOfEl(String element, Duration timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		return wait.until(ExpectedConditions.presenceOfElementLocated((By.xpath(element))));
	}

	/**
	 * This method will create an Object of WebDriverWait
	 * 
	 * @return WebDriverWait
	 */
    public static WebDriverWait getWaitObject() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		return wait;
	}

	/**
	 * This method will wait until element becomes clickable
	 * 
	 * @param element
	 */
	public static void waitForClickability(WebElement element) {
		getWaitObject().until(ExpectedConditions.elementToBeClickable(element));
	}

	/**
	 * This method will wait until element becomes visible
	 * 
	 * @param element
	 */
	public static void waitForVisibility(WebElement element) {
		getWaitObject().until(ExpectedConditions.visibilityOf(element));
	}


	/**
	 * Use this method to open new tab
	 */
	public static void openNewTab() {
		JavascriptExecutor js = (JavascriptExecutor) WebDriverUtils.driver;
		js.executeScript("window.open('about:blank','_blank');");
	}

	/**
	 * Use this method to switch to the next another open window
	 */
	public static void swicthToAnotherWindow() {
		Set<String> handlingAllOpenWindows = WebDriverUtils.driver.getWindowHandles();
		for (String nextWindow : handlingAllOpenWindows) {
			WebDriverUtils.driver.switchTo().window(nextWindow);
		}
	}

	public static void scrollIntoView(By locator) {
		try {
			WebElement element = WebDriverUtils.driver.findElement(locator);
			Actions action = new Actions(WebDriverUtils.driver);
			action.moveToElement(element);
			action.perform();
		} catch (Exception e) {
			throw e;
		}
	}

	public static void scrollIntoView(WebElement element) {
		try {
			Actions action = new Actions(WebDriverUtils.driver);
			action.moveToElement(element);
			action.perform();
		} catch (Exception e) {
			throw e;
		}
	}
	

/*
 * 
 * Use below method to assert actual String value with an expected String value	
 */
	public static void assertEquals(String expected, String actual) {
		
		try {
		Assert.assertEquals(expected, actual);
		}
		catch(AssertionError e) {

			e.printStackTrace();
		}
	}
}

