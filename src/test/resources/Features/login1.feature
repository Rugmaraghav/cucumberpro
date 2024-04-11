
Feature: login functionality

   Scenario: check login is successful with valid credentials
    Given user is on the login page
    When user enter username and password
    And click login button
    Then user is navigated to the home page

  