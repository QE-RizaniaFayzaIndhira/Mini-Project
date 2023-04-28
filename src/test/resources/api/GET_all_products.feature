Feature: GET - All products
  As a user
  I want to see list of products
  So that i can see all products

  @TCP1.1
  Scenario: GET - As a user i want to get all products with valid endpoint
    Given user set GET valid endpoint
    When user send GET HTTP request with valid endpoint
    Then user received valid GET HTTP response code 200

  @TCP1.2
  Scenario: GET - As a user i want to get all products with invalid endpoint
    Given user set GET invalid endpoint
    When user send GET HTTP request with invalid endpoint
    Then user received GET HTTP response code 404