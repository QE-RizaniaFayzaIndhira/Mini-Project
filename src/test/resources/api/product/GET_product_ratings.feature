Feature: GET - Product ratings
  As a user
  I want to see list of products
  So that i can see product ratings

  @TCP6.1
  Scenario: GET - As a user i want to get product ratings with valid endpoint
    Given user set GET valid endpoint to get product ratings
    When user send GET HTTP request to get product ratings with valid endpoint
    Then user received valid GET HTTP response code 200 to get product ratings

  @TCP6.2
  Scenario: GET - As a user i want to get product ratings with invalid endpoint
    Given user set GET invalid endpoint to get product ratings
    When user send GET HTTP request to get product ratings with invalid endpoint
    Then user received GET HTTP response code 404 to get product ratings

  @TCP6.3
  Scenario: GET - As a user i want to get product ratings
    Given user set GET valid endpoint to get product ratings
    When user send GET HTTP request to get product ratings with valid endpoint
    Then user received valid GET HTTP response code 200 to get product ratings
    And user received valid data for product ratings