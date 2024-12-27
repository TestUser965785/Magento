


Feature: Account Creation and Sign-in

Scenario: Create an account on the website
    Given I am on the registration page
    When I enter valid details and submit
    Then I should see a success message

  Scenario: Sign in with the created account
    Given I am on the login page
    When I enter valid credentials
    Then I should be redirected to the dashboard

