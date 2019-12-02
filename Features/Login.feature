Feature: Login Actions for both admin and advisor

  Scenario: Validating the Login action with valid email and valid password
    Given the user is in Login page
    When the user enters the valid email and valid password
    Then the user should be in the Portfolio Valutaion page
   