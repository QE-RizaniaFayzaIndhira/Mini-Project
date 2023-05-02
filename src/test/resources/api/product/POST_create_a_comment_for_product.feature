Feature: POST - Create a comment for product
  As a user
  I want to see list of products
  So that i can create a comment for product

  Background:
    Given user set authentication endpoint
    And user send authentication endpoint

  @TCP7.1
  Scenario: POST - as a user i want to create a comment for product with valid endpoint
    When user set POST valid endpoint for create comment product
    And user send POST HTTP request for create comment product
    Then user received HTTP response code 200 for create comment product

  @TCP7.2
  Scenario: POST - as a user i want to create a comment for product with invalid endpoint
    When user set POST invalid endpoint for create comment product
    And user send POST HTTP request with invalid endpoint for create comment product
    Then user received POST HTTP response code 404 for create comment product

  @TCP7.3
  Scenario: POST - as a user i want to create a comment for product with empty request body
    When user set POST valid endpoint for create comment product
    And user send POST HTTP request for create comment product with empty request body
    Then user received HTTP response code 500 Internal Server Error for create comment product

  @TCP7.4
  Scenario: POST - as a user i want to create a comment for product with input valid content
    When user set POST valid endpoint for create comment product
    And user send POST HTTP request for create comment product
    Then user received HTTP response code 200 for create comment product
    And user received valid data for create comment product