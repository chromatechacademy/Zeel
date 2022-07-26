package com.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = { "html:target/html-reports/cucumber-default-report",
        "json:target/cucumber.json",
        "junit:target/cucumber.xml",
        "rerun:target/failed.txt",
        "pretty" }, 
        features = "src/test/java/com/features", 
        glue = "com.stepDefinitions", 
        tags = "@Progression", 
        dryRun = true, 
        monochrome = true, 
        strict = true)

public class RunSmokeTest {
    // DO NOT WRITE ANYTHING INSIDE THE CLASS
}
