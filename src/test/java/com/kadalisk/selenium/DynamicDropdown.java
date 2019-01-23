package com.kadalisk.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DynamicDropdown {


    private WebDriver driver;

    @Test
    public void dynamicDropdown() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\SURESH\\Google Drive\\Workspace\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();

        driver.get("https://www.kayak.com/flights");

//        Get Title and print
        System.out.println("Current Page Title: " + driver.getTitle());

//        Get Current URL and print
        System.out.println("Current Page URL: " + driver.getCurrentUrl());

        //Click on From Airport Element - which has dynamic ID
        driver.findElement(By.cssSelector("[id*='origin-airport-display']")).click();

        Thread.sleep(250);
        driver.findElement(By.xpath("//input[contains(@id,'origin-airport')]")).sendKeys("ATL ");

        WebElement dropdown = driver.findElement(By.cssSelector("div[id*='origin-airport-smartbox-dropdown'"));

        dropdown.findElement(By.cssSelector("li[data-apicode='ATL']")).click();

        Thread.sleep(250);
        driver.findElement(By.xpath("//input[contains(@id,'destination-airport')]")).sendKeys("NYC ");




    }
    }
