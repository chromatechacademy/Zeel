package com.testautomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EdgeTest {

    public static void main(String[] args) {
        
        // Setting up Edge driver
        WebDriverManager.edgedriver().setup();

        // Initializing WebDriver and EdgeDriver
        WebDriver driver = new EdgeDriver();

        driver.get("https://www.google.com/");

        System.out.println(driver.getTitle());

        System.out.println(driver.getCurrentUrl());

        driver.quit();

    }
    
}
