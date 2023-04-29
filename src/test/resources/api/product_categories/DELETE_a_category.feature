Feature: DELETE - A category
  As a user
  I want to see list of category
  So that i can delete a category

  @TCC4.1
  Scenario: DELETE - as a user i want to delete a category with valid endpoint
    Given user set DELETE valid endpoint for delete category
    When user send DELETE HTTP request with valid endpoint for delete category
    Then user received DELETE HTTP response code 200 with valid endpoint for delete category

  @TCC4.2
  Scenario: DELETE - as a user i want to delete a category with invalid endpoint
    Given user set DELETE endpoint with invalid endpoint for delete category
    When user send DELETE HTTP request with invalid endpoint for delete category
    Then user received DELETE HTTP response code 404 with invalid endpoint for delete category