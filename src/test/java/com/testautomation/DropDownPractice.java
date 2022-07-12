package com.testautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

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

        driver.quit();

    }

}
