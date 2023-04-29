Feature: POST - create a new product
  As a user
  I want to see list of products
  So that i can create new product

  @TCP2.1
  Scenario: POST - as a user i want to create a new product with valid endpoint
    Given user set POST valid endpoint
    When user send POST HTTP request
    Then user received HTTP response code 200

  @TCP2.2
  Scenario: POST - as a user i want to add new product with invalid endpoint
    Given user set POST invalid endpoint
    When user send POST HTTP request with invalid endpoint
    Then user received POST HTTP response code 404

  @TCP2.3
  Scenario: POST - as a user i want to create a new product with input empty request body
    Given user set POST valid endpoint
    When user send POST HTTP request with input empty request body
    Then user received HTTP response code 500 with input empty request body

  @TCP2.4
  Scenario: POST - as a user i want to create a new product with input valid name, description, price, and categories
    Given user set POST valid endpoint
    When user send POST HTTP request
    Then user received HTTP response code 200
    And user received valid data for new product