package com.testautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SoftAssertPractice {

    public static void main(String[] args) {

        /*
         * Soft Assert Practice
         */

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().deleteAllCookies();

        String url = "https://chroma.mexil.it/site/login";

        driver.get(url);

        SoftAssert softAssert = new SoftAssert();

        String loginPageText = driver.findElement(By.xpath("//h3[normalize-space()='Admin Login']")).getText();

        softAssert.assertEquals(loginPageText, "Admin");

        String usernameText = driver.findElement(By.xpath("//input[@placeholder='Username']")).getText();

        softAssert.assertEquals(usernameText, "User");

        String passwordText = driver.findElement(By.xpath("//input[@placeholder='Password']")).getText();

        softAssert.assertEquals(passwordText, "Pass");

        String signInButtonText = driver.findElement(By.xpath("//button[normalize-space()='Sign In']")).getText();

        softAssert.assertEquals(signInButtonText, "Sign");

        String forgotPasswordLinkText = driver.findElement(By.xpath("//a[normalize-space()='Forgot Password?']")).getText();

        softAssert.assertEquals(forgotPasswordLinkText, "Forgot");

        softAssert.assertAll();

        driver.quit();


    }

}
