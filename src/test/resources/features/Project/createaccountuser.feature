Feature: Create Account User
  As a user
  I want to create account
  So I can access the features in the bookstore

  Scenario: Create account
    Given I set url
    And I set my username and password
    When I request with username and password
    Then I will get status code 200
    And I can verify the detail response