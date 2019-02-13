Feature: Amazon title
  @amazon
  Scenario: Amazon title verification
    When user goes to amazon application
    Then user should see proper title
