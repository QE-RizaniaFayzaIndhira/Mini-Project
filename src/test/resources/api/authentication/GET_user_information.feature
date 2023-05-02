Feature: GET - User information
  As a user
  I want to see list user
  So that i can see user information

  Background:
    Given user set authentication endpoint
    And user send authentication endpoint

  @TCA3.1
  Scenario: GET - As a user i want to get user information with valid endpoint
    When user set GET valid endpoint for user information
    And user send GET HTTP request with valid endpoint for user information
    Then user received valid GET HTTP response code 200 for user information

  @TCA3.2
  Scenario: GET - As a user i want to get user information with invalid endpoint
    When user set GET invalid endpoint for user information
    And user send GET HTTP request with invalid endpoint for user information
    Then user received GET HTTP response code 404 for user information

  @TCA3.3
  Scenario: GET - As a user i want to get user information
    When user set GET valid endpoint for user information
    And user send GET HTTP request with valid endpoint for user information
    Then user received valid GET HTTP response code 200 for user information
    And user received valid data for user information