package com.kadalisk.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TraversingXpath {

    private WebDriver driver;

    @Test
    public void DriverBasicMethods() {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\SURESH\\Google Drive\\Workspace\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();

        driver.get("http://demo.guru99.com/v4/");

//        Get Title and print
        System.out.println("Current Page Title: " + driver.getTitle());

//        Get Current URL and print
        System.out.println("Current Page URL: " + driver.getCurrentUrl());

//        Traversing using following-sibling
        driver.findElement(By.xpath(".//*[@id='navbar-brand-centered']/ul/li[1]/following-sibling::li[2]/a")).click();

//        Identifying the parent Element using child's xpath
        driver.findElement(By.xpath(".//*[@id='navbar-brand-centered']/ul/li[4]/parent::ul/li[5]/a")).click();

//        close browser
        driver.close();

    }
}
