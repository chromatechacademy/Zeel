package com.testautomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirefoxTest {

    public static void main(String[] args) {
        
        // Setting up firefox driver using WebDriverManager
        WebDriverManager.firefoxdriver().setup();

        // Initializing WebDriver and FirefoxDriver
        WebDriver driver = new FirefoxDriver();

        // Navigating to google on firefox browser
        driver.get("https://www.google.com/");

        // Printing out title of the webpage using getTitle() method
        System.out.println(driver.getTitle());

        // Printing out current URL using getCurrentUrl() method
        System.out.println(driver.getCurrentUrl());

        // Using quit() method to close all windows opened by selenium
        driver.quit();

    }
    
}
