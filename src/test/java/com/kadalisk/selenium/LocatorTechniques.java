package com.kadalisk.selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LocatorTechniques {


    private WebDriver driver;

    @Test
    public void locatorTechniques() {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\SURESH\\Google Drive\\Workspace\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();

        driver.get("http://demo.guru99.com/v4/");

//        Get Title and print
        System.out.println("Current Page Title: " + driver.getTitle());

//        Get Current URL and print
        System.out.println("Current Page URL: " + driver.getCurrentUrl());

//        By name
        driver.findElement(By.name("uid")).sendKeys("rstech");

//        By xpath
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("password");

//        By cssSelector
        driver.findElement(By.cssSelector("input[type='submit']")).click();


        Alert alert = driver.switchTo().alert();
        alert.dismiss();

        driver.switchTo().parentFrame();


        driver.navigate().to("https://www.rediff.com/");

//                Get Title and print
        System.out.println("Current Page Title: " + driver.getTitle());

//        Get Current URL and print
        System.out.println("Current Page URL: " + driver.getCurrentUrl());


//        click Sign in link
        driver.findElement(By.cssSelector("a[title*='Sign in']")).click();

//        Enter Password
        driver.findElement(By.xpath("//input[contains(@id, 'log')]")).sendKeys("rstech");

        driver.findElement(By.cssSelector("input[name*='pass']")).sendKeys("password");

        driver.findElement(By.xpath("//input[contains(@title,'Sign')]")).click();


//        close Driver
//        driver.close();

    }
}