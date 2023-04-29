Feature: POST - create a category
  As a user
  I want to see list of categories
  So that i can create a category

  @TCC1.1
  Scenario: POST - as a user i want to create a category with valid endpoint
    Given user set POST valid endpoint for create a category
    When user send POST HTTP request for create a category
    Then user received HTTP response code 200 for create a category

  @TCC1.2
  Scenario: POST - as a user i want to create a category with invalid endpoint
    Given user set POST invalid endpoint for create a category
    When user send POST HTTP request with invalid endpoint for create a category
    Then user received POST HTTP response code 404 for create a category

  @TCC1.3
  Scenario: POST - as a user i want to create a category with empty request body
    Given user set POST valid endpoint for create a category
    When user send POST HTTP request for create a category with empty request body
    Then user received HTTP response code 500 for create a category with empty request body

  @TCC1.4
  Scenario: POST - as a user i want to create a category with input valid name and description
    Given user set POST valid endpoint for create a category
    When user send POST HTTP request for create a category
    Then user received HTTP response code 200 for create a category
    And user received valid data for new category