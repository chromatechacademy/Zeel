package com.testautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromaTest {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://chroma.mexil.it/site/login");

        driver.findElement(By.cssSelector("input[id='form-username']")).sendKeys("admin@admin.com");

        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("123456");

        driver.findElement(By.xpath("//button[@class='btn']")).click();

    }

}
