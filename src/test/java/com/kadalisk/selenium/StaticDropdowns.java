package com.kadalisk.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class StaticDropdowns {

    private WebDriver driver;

    @Test
    public void DriverBasicMethods() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\SURESH\\Google Drive\\Workspace\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();

        driver.get("http://demo.guru99.com/test/guru99home/");

//        Get Title and print
        System.out.println("Current Page Title: " + driver.getTitle());

//        Get Current URL and print
        System.out.println("Current Page URL: " + driver.getCurrentUrl());

        Select select = new Select(driver.findElement(By.cssSelector("#awf_field-91977689")));
        select.selectByValue("saphr");
        select.selectByIndex(2);
        Thread.sleep(200);
        select.selectByValue("saphr");
        Thread.sleep(200);
        select.selectByVisibleText("SAP Payroll");


        highlightElement(driver.findElement(By.cssSelector("#awf_field-91977689")));

    }

    private void highlightElement(WebElement element) throws InterruptedException {
        for (int i = 0; i < 2; i++) {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript(
                    "arguments[0].setAttribute('style', arguments[1]);",
                    element, "color: red; border: 6px solid yellow;");
            Thread.sleep(200);
            js.executeScript(
                    "arguments[0].setAttribute('style', arguments[1]);",
                    element, "");
        }
    }
}
