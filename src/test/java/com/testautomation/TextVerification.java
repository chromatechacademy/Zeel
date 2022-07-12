package com.testautomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TextVerification {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        String url = "https://chroma.mexil.it/site/login";

        driver.get(url);

        // Maximazing window
        driver.manage().window().maximize();

        // Deleting all cookies
        driver.manage().deleteAllCookies();

        System.out.println(driver.getTitle());

        // Asserting title of login page
        Assert.assertEquals(driver.getTitle(), "Login : Chroma Tech Academy");

        // Entering username in username textbox
        driver.findElement(By.cssSelector("input[id='form-username']")).sendKeys("general@teacher.com");

        // Entering password in password textbox
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("123456");

        // Clicking on 'Sign In' button
        driver.findElement(By.xpath("//form/button")).click();

        // Retrieving text using getText() method
        String actualHomePageName = driver.findElement(By.xpath("//nav/div/span")).getText();

        System.out.println(actualHomePageName);

        // Asserting home page name using assertEquals() method
        Assert.assertEquals(actualHomePageName, "Chroma Tech Academy");

        // creating boolean statement using contains() method from String class
        actualHomePageName.contains("Chroma Tech Academy");

        // Asserting using assertTrue() method
        Assert.assertTrue(actualHomePageName.contains("Chroma Tech"));

        // Asserting using contentEquals() method from String class
        Assert.assertTrue(actualHomePageName.contentEquals("Chroma Tech Academy"));

        // Clicking on student information using linkText
        driver.findElement(By.linkText("Student Information")).click();

        // Adding 2 second wait
        Thread.sleep(2000);

        // Clicking on student admission
        driver.findElement(By.linkText("Student Admission")).click();

        // Sending admission number
        driver.findElement(By.xpath("//input[@id='admission_no']")).sendKeys("123456");

      
    }

}
