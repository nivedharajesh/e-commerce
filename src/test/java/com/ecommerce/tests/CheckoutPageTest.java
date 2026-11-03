package com.ecommerce.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class CheckoutPageTest extends BaseTest {
	@Test
	public void CheckoutPageTest() {

	    OpenBrowser();
	    
	    driver.get("http://localhost/ecomm/checkout.html");
	    WebElement firstName = driver.findElement(By.className("form-control"));

	    firstName.sendKeys("Nivedha");
	    
	    WebElement lastName = driver.findElement(By.xpath("//input[@id='last_name']"));

	    lastName.sendKeys("Rajesh");
	    
	    WebElement companyName = driver.findElement(By.id("company"));
	    companyName.sendKeys("Royal NAAFI");
	    
	  
	   
	    WebElement unitedKingdom = driver.findElement(By.cssSelector("li[data-value='uk']"));

	    Actions actions = new Actions(driver);
	    actions.moveToElement(unitedKingdom).click().perform();
	    
	
	    WebElement checkbox = driver.findElement(By.id("customCheck1"));

	    if (!checkbox.isSelected()) {
	        WebElement checkboxLabel =
	                driver.findElement(By.cssSelector("label[for='customCheck1']"));

	        checkboxLabel.click();
	    }

	    assert checkbox.isSelected();

	    System.out.println("Checkbox selected: " + checkbox.isSelected());

	    WebElement placeOrder = driver.findElement(
	            By.xpath("//a[contains(@class,'essence-btn') and normalize-space()='Place Order']")
	    );

	    placeOrder.click();
	    
	}
}