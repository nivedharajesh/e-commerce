package com.ecommerce.tests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

    protected WebDriver driver;

    public void OpenBrowser() {

        driver = new ChromeDriver();

     
        driver.manage().window().maximize();

     
        driver.manage().deleteAllCookies();


        driver.manage().timeouts()
           .pageLoadTimeout(Duration.ofSeconds(30));

        driver.get("http://localhost/ecomm");
    }
}