package com.testautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssertionPractice {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        // WebDriverManager.firefoxdriver().setup();

        // WebDriver driver = new FirefoxDriver();

        String url = "https://chroma.mexil.it/site/login";

        driver.get(url);

        // Maximazing window
        driver.manage().window().maximize();

        // Deleting all cookies
        driver.manage().deleteAllCookies();

        // Entering username in username textbox
        driver.findElement(By.cssSelector("input[id='form-username']")).sendKeys("general@teacher.com");

        // Entering password in password textbox
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("123456");

        // Clicking on 'Sign In' button
        driver.findElement(By.xpath("//form/button")).click();

        // Clicking on student information using linkText
        driver.findElement(By.linkText("Student Information")).click();

        // Adding 2 second wait
        Thread.sleep(2000);

        // Clicking on student admission
        driver.findElement(By.linkText("Student Admission")).click();

        //One way to assert
        String admissionNo = driver.findElement(By.xpath("(//div[@class='form-group'])[1]")).getText();

        Assert.assertEquals(admissionNo, "Admission No *");
        
        // Another way to assert
        boolean assertingText = admissionNo.contentEquals("Admission No *");

       // Assert.assertTrue(assertingText);

       // System.out.println("Hello guys");

        Assert.assertTrue(assertingText, "Admission No * ASSERTION FAILED!!!!!!!!");


    }

}
