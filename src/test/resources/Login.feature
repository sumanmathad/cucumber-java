Feature: Login Functionality Feature
  In order to do Internet Banking for valid customer
  I want to login

  Scenario: Verify Login functionality
    Given I am in Login page of Bank application
    When I Login with valid credentials
    Then I should be navigated to Home page
