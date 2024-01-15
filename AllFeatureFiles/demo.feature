Feature: Test Sauce Demo Application

  Scenario: validate login page functionality
    Given user is on login page
    When user enter username password and click on login button
    Then user is on Home page and user validate home page title
