@wip
Feature: As an invoicing manager user should be able to generate(print) Tax report

  Background:
    When user logs in as an invoicing manager
    Then user should be able to click on invoicing link
    And user should be able to click PDF report
    When user clicks on Tax Reports from the drop down

    Scenario: Verify that the strat and end dates are blank by default
      Then the start and end dates pon Tax Reports window should be blank by dedault
      And user should be able to click print button
      Then user should be able to see error message "The following fields are invalid:"

      Scenario: Verify that user able to logout
        Then user able to click x icon
        And user should be able to logout

