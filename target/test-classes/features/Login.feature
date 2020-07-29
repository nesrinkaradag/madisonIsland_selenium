@login
Feature: login functionality
  Background:
    Given the user is on the home page

  Scenario: Login with invalid credentials
  When the user navigates to login page
    When the user navigates to login page
    When the user login with invalid credentials
    Then the user should be able to see the error message

    Scenario: Login without credentials
      Given the user navigates to login page
      When the user login without credentials
      Then the user should be able to see validation appears
  @wip
  Scenario: Login with valid credentials
    Given the user navigates to login page
    When the user login with valid credentials
    Then the should be able to login successfully