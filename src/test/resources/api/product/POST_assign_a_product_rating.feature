Feature: POST - assign a product rating
  As a user
  I want to see list of products
  So that i can assign a product rating

  Background:
    Given user set authentication endpoint
    And user send authentication endpoint

  @TCP5.1
  Scenario: POST - as a user i want to assign a product rating with valid endpoint
    When user set POST valid endpoint for assign product rating
    And user send POST HTTP request for assign product rating
    Then user received HTTP response code 200 for assign product rating

  @TCP5.2
  Scenario: POST - as a user i want to assign a product rating with invalid endpoint
    When user set POST invalid endpoint for assign product rating
    And user send POST HTTP request with invalid endpoint for assign product rating
    Then user received POST HTTP response code 404 for assign product rating

  @TCP5.3
  Scenario: POST - as a user i want to assign a product rating with empty request body
    When user set POST valid endpoint with empty request body for assign product rating
    And user send POST HTTP request with empty request body for assign product rating
    Then user received HTTP response code 200 with empty request body for assign product rating

  @TCP5.4
  Scenario: POST - as a user i want to assign a product rating with input valid count
    When user set POST valid endpoint for assign product rating
    And user send POST HTTP request for assign product rating
    Then user received HTTP response code 200 for assign product rating
    And user received valid data for assign product rating