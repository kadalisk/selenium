package com.kadalisk.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DriverBasicMethods {

    private WebDriver driver;

    @Test
    public void driverBasicMethods() {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\SURESH\\Google Drive\\Workspace\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();

        driver.get("http://www.yahoo.com");

//        Get Title and print
        System.out.println("Current Page Title: " + driver.getTitle());

//        Get Current URL and print
        System.out.println("Current Page URL: " + driver.getCurrentUrl());

//        Get Page Source and print
//        System.out.println("Current Page Source: " + driver.getPageSource());


        System.out.println("Navigating to page : http://demo.guru99.com/v4/");

        //Navigate to Someother URL
        driver.navigate().to("http://demo.guru99.com/v4/");



//        Get Title and print
        System.out.println("Current Page Title: " + driver.getTitle());

//        Get Current URL and print
        System.out.println("Current Page URL: " + driver.getCurrentUrl());

//        Get Page Source and print
//        System.out.println("Current Page Source: " + driver.getPageSource());


//        Navigating back to previous page
        System.out.println("Navigating to previous page");
        driver.navigate().back();

        //        Get Title and print
        System.out.println("Current Page Title: " + driver.getTitle());

//        Get Current URL and print
        System.out.println("Current Page URL: " + driver.getCurrentUrl());

//        Get Page Source and print
//        System.out.println("Current Page Source: " + driver.getPageSource());


        //close driver
        driver.close();

    }


}
