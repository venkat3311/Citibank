@wip
Feature: As an invoicing manager user should be able to generate(print) Aged Partner Balance

  Background:
    When user logs in as an invoicing manager
    Then user should be able to click on invoicing link
    And user should be able to click PDF report
    When user clicks on Aged Partner Balance

  Scenario: Verify the selected default values on Aged Partner Balance
    Then user should be able to see selected default values
    And user should be able to click print button

  Scenario: Verify the error message when date is empty
    And user clear the date box
    Then user should be able to click print button
    And user should see error message "You must set a start date."

  Scenario: Verify the text on Aged Partner Balance window
    Then user should be able to see text "Aged Partner Balance is a more detailed report of your receivables by intervals. Odoo calculates a table of credit balance by start Date. So if you request an interval of 30 days Odoo generates an analysis of creditors for the past month, past two months, and so on."

  Scenario: Verify that the user able to click on x icon to close the window
    Then user should be able to click x icon to close the window