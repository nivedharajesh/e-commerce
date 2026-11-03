package com.ecommerce.cucumber.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ECommerceStepDefinitions {

    WebDriver driver;

    @Given("I open the e-commerce website")
    public void i_open_the_e_commerce_website() {

        driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().deleteAllCookies();

        driver.get("http://localhost/ecomm");
    }

    @When("I add a product to the cart")
    public void i_add_a_product_to_the_cart() {

        driver.get("http://localhost/ecomm/shop.html");

        // Find the first product
        WebElement firstProduct =
                driver.findElement(By.cssSelector(".single-product-wrapper"));

        // Hover over the first product
        Actions actions = new Actions(driver);
        actions.moveToElement(firstProduct).perform();

        // Click Add to Cart
        WebElement addToCart =
                firstProduct.findElement(
                        By.xpath(".//a[normalize-space()='Add to Cart']")
                );

        addToCart.click();
    }

    @And("I proceed to the checkout page")
    public void i_proceed_to_the_checkout_page() {

        driver.get("http://localhost/ecomm/checkout.html");
    }

    @Then("I should see the checkout page")
    public void i_should_see_the_checkout_page() {

        String currentUrl = driver.getCurrentUrl();

        assert currentUrl.contains("checkout.html");
    }
}