package com.web;

import java.time.Duration;

import com.utils.ConfigReader;
import com.utils.FrameworkConstants;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverUtils {

    public static WebDriver driver;

    public static void setUp() {

        /** Reading the properties file we created */
        ConfigReader.readProperties(FrameworkConstants.CONFIGURATION_FILE_PATH);

        if (ConfigReader.getPropertyValue("browser").equalsIgnoreCase("chrome")) {

            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else if (ConfigReader.getPropertyValue("browser").equalsIgnoreCase("firefox")) {

            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        } else if (ConfigReader.getPropertyValue("browser").equalsIgnoreCase("edge")) {

            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
        } else {
            throw new RuntimeException("Invalid browser name");
        }

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        /** Setting an implicit wait */
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

    }

    public static void tearDown() {
        driver.quit();
    }

}
