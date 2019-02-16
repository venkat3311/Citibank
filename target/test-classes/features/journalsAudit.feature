@wip
Feature: As an invoicing manager user should be able to generate(print)Journal Audit report

  Background:
    When user logs in as an invoicing manager
    Then user should be able to click on invoicing link
    And user should be able to click PDF report
    When user clicks on Journals Audit


  Scenario: Verify the selected default values on Journals Audit Report window
    Then user should see the default values
    And user should be able to add journal from drop down
    And user should be able delete it
    Then user should be able to click print button
    And user should be able to close popup window
    And user should be able to logout


  Scenario: Verify that the start and end date are empty by default
    Then start and end dates should be empty by default
    Then user should be able to click print button
    And user should be able to close popup window
    And user should be able to logout

  Scenario: Verify that user able to click cancel button
    Then user able to click cancel button

  Scenario: Verify that user able to click x icon to close the window
    Then user able to click x icon


