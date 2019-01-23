package com.kadalisk.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class HandlingFrames {

    private WebDriver driver;

    @Test
    public void DriverBasicMethods() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\SURESH\\Google Drive\\Workspace\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("http://demo.guru99.com/test/drag_drop.html");

//        Get Title and print
        System.out.println("Current Page Title: " + driver.getTitle());

//        Get Current URL and print
        System.out.println("Current Page URL: " + driver.getCurrentUrl());

        driver.findElement(By.xpath("(//li[@id='fourth'])[1]")).click();

        highlightElement(driver.findElement(By.xpath("(//li[@id='fourth'])[1]")));

    }


    private void highlightElement(WebElement element) throws InterruptedException {
        for (int i = 0; i < 2; i++) {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript(
                    "arguments[0].setAttribute('style', arguments[1]);",
                    element, "color: red; border: 6px solid yellow;");
            Thread.sleep(1000);
            js.executeScript(
                    "arguments[0].setAttribute('style', arguments[1]);",
                    element, "");
        }
    }
}
