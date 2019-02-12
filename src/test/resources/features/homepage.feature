Feature: Home page
  Scenario: User clicks the link
    Given user is on the homepage
    When user clicks on sign in button
    Then login page should be displayed

  Scenario: login as user
    When user logs in as a user
    Then homepage should be displayed
    And the title should be correct

  Scenario: login as manager
    When user logs in as manager
    Then homepage should be displayed
    And the title should be correct


