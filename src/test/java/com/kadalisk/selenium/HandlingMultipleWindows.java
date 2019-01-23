package com.kadalisk.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class HandlingMultipleWindows {


    private WebDriver driver;

    @Test
    public void handlingMultipleWindows() {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\SURESH\\Google Drive\\Workspace\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.get("https://accounts.google.com/signup");

//        Get Title and print
        System.out.println("Current Page Title: " + driver.getTitle());

//        Get Current URL and print
        System.out.println("Current Page URL: " + driver.getCurrentUrl());

        driver.findElement(By.xpath("//a[text()='Help']")).click();

//        Get Title and print
        System.out.println("Current Page Title: " + driver.getTitle());

//        Get window handles
        Set<String> s = driver.getWindowHandles();

        System.out.println("Window Handles: " + s);

    }
}
