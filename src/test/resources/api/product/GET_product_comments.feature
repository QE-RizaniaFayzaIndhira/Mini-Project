Feature: GET - Product comments
  As a user
  I want to see list of products
  So that i can see product comments

  @TCP8.1
  Scenario: GET - As a user i want to get product comments with valid endpoint
    Given user set GET valid endpoint to get product comments
    When user send GET HTTP request to get product comments with valid endpoint
    Then user received valid GET HTTP response code 200 to get product comments

  @TCP8.2
  Scenario: GET - As a user i want to get product comments with invalid endpoint
    Given user set GET invalid endpoint to get product comments
    When user send GET HTTP request to get product comments with invalid endpoint
    Then user received GET HTTP response code 404 to get product comments