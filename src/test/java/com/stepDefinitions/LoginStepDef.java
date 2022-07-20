package com.stepDefinitions;

import com.web.WebDriverUtils;

public class LoginStepDef {

    public static void main(String[] args) {
        
        WebDriverUtils.setUp();
        WebDriverUtils.driver.get("https://chroma.mexil.it/site/login");

    }
    
    
}
