Feature: GET - All orders
  As a user
  I want to see list of orders
  So that i can see all orders

  @TCO2.1
  Scenario: GET - As a user i want to get all orders with valid endpoint
    Given user set GET valid endpoint for all orders
    When user send GET HTTP request with valid endpoint for all orders
    Then user received valid GET HTTP response code 200 for all orders

  @TCO2.2
  Scenario: GET - As a user i want to get all orders with invalid endpoint
    Given user set GET invalid endpoint for all orders
    When user send GET HTTP request with invalid endpoint for all orders
    Then user received GET HTTP response code 404 for all orders