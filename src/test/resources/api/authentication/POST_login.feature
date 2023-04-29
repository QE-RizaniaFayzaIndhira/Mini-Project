Feature: POST - login
  As a user
  I want to login
  So that i can see token data

  @TCA2.1
  Scenario: POST - as a user i want to login with valid endpoint
    Given user set POST valid endpoint for login
    When user send POST HTTP request for login
    Then user received POST HTTP response code 200 for login

  @TCA2.2
  Scenario: POST - as a user i want to login with invalid endpoint
    Given user set POST endpoint with invalid endpoint for login
    When user send POST HTTP request with invalid endpoint for login
    Then user received POST HTTP responses code 404 for login

  @TCA2.3
  Scenario: POST - as a user i want to login with input valid email and password
    Given user set POST valid endpoint for login
    When user send POST HTTP request for login
    Then user received POST HTTP response code 200 for login

  @TCA2.4
  Scenario: POST - as a user i want to login with empty email and password
    Given user set POST valid endpoint for login
    When user send POST HTTP request for login with empty email and password
    Then user received POST HTTP response code 400 bad request for login

  @TCA2.5
  Scenario: POST - as a user i want to login with input invalid email and password
    Given user set POST valid endpoint for login
    When user send POST HTTP request for login with input invalid email and password
    Then user received POST HTTP response code 400 bad request for login