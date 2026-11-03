Feature: E-Commerce Website Testing

  Scenario: Add a product to cart and proceed to checkout
    Given I open the e-commerce website
    When I add a product to the cart
    And I proceed to the checkout page
    Then I should see the checkout page