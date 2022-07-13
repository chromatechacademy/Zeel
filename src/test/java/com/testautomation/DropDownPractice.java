package com.testautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownPractice {

    public static void main(String[] args) throws InterruptedException {
        /**
         * TOPIC: Drop downs
         */

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().deleteAllCookies();

        String url = "https://chroma.mexil.it/site/login";

        driver.get(url);

        // Entering username in username textbox
        driver.findElement(By.cssSelector("input[id='form-username']")).sendKeys("general@teacher.com");

        // Entering password in password textbox
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("123456");

        // Clicking on 'Sign In' button
        driver.findElement(By.xpath("//form/button")).click();

        // Clicking on 'Student Information' link
        driver.findElement(By.xpath("//span[contains(text(),'Student Information')]")).click();

        // Adding 2 second sleep
        Thread.sleep(2000);

        // Clicking on 'Student details'
        driver.findElement(By.partialLinkText("Student Details")).click();

        // Storing class drop down into classDropDown variable
        WebElement classDropDown = driver.findElement(By.xpath("//select[@name='class_id']"));

        // Creating an object of Select class to get handle of the static drop down
        Select dropDown = new Select(classDropDown);

        // Selecting by visible text
        dropDown.selectByVisibleText("SDET");

        dropDown.selectByIndex(0);

        dropDown.selectByValue("11");

        // Commenting out driver.quit so you can see drop down values changing
        // driver.quit();

    }

}
