package com.kadalisk.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ActionsSelenium {


    private WebDriver driver;

    @Test
    public void actionsSelenium() {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\SURESH\\Google Drive\\Workspace\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.get("https://www.amazon.com/");

//        Get Title and print
        System.out.println("Current Page Title: " + driver.getTitle());

//        Get Current URL and print
        System.out.println("Current Page URL: " + driver.getCurrentUrl());

        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(By.cssSelector("a#nav-link-accountList"))).build().perform();

    }
    }
