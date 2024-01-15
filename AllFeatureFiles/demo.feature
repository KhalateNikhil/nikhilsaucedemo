Feature: Test Sauce Demo Application

  Scenario: validate login page functionality
    Given user is on login page
    When user enter username password and click on login button
    Then user is on Home page and user validate home page title

  Scenario: validate add to cart functionality
    When user click on Sauce Labs Backpack add to cart
    And user click on Sauce Labs Bike Light add to cart
    And user click on shopping cart button
    And user click on checkout button

  Scenario: validate chekout page functionality
    When user enter firstname lastname and pincode and click on continue button
    And user click on finish button
