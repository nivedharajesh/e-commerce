package com.ecommerce.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class HomePageTest extends BaseTest {

    @Test
        public void HomePageTest() {

            OpenBrowser();

          
            WebElement pagesMenu = driver.findElement(By.linkText("Pages"));

    
            Actions actions = new Actions(driver);
            actions.moveToElement(pagesMenu).perform();
            
            WebElement contactLink = driver.findElement(By.linkText("Contact"));
            contactLink.click();
        }
    }

