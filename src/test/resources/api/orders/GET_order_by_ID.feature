Feature: GET - Order by ID
  As a user
  I want to see list of orders
  So that i can see order by ID

  @TCO3.1
  Scenario: GET - As a user i want to get order by ID with valid endpoint
    Given user set GET valid endpoint for order by ID
    When user send GET HTTP request with valid endpoint for order by ID
    Then user received valid GET HTTP response code 200 for order by ID

  @TCO3.2
  Scenario: GET - As a user i want to get order by ID with invalid endpoint
    Given user set GET invalid endpoint for order by ID
    When user send GET HTTP request with invalid endpoint for order by ID
    Then user received GET HTTP response code 404 for order by ID

  @TCO3.3
  Scenario: GET - As a user i want to get order by ID
    Given user set GET valid endpoint for order by ID
    When user send GET HTTP request with valid endpoint for order by ID
    Then user received valid GET HTTP response code 200 for order by ID
    And user received valid data for order by ID