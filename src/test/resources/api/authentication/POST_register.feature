Feature: POST - register
  As a user
  I want to register
  So that i can login

  @TCA1.1
  Scenario: POST - as a user i want to register with valid endpoint
    Given user set POST valid endpoint for register
    When user send POST HTTP request with valid endpoint for register
    Then user received POST HTTP response code 200 for register

  @TCA1.2
  Scenario: POST - as a user i want to register with invalid endpoint
    Given user set POST invalid endpoint for register
    When user send POST HTTP request with invalid endpoint for register
    Then user received POST HTTP responses code 404 for register

  @TCA1.3
  Scenario: POST - as a user i want to register with empty request body
    Given user set POST valid endpoint for register
    When user send POST HTTP request with empty request body for register
    Then user received POST HTTP response code 400 for register with empty request body

  @TCA1.4
  Scenario: POST - as a user i want to register with input valid email, password, and fullname
    Given user set POST valid endpoint for register
    When user send POST HTTP request for register
    Then user received POST HTTP response code 200 for register