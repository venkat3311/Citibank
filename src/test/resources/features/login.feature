Feature: Login functionality
@login
  Scenario: user login
 Given user is already on Login Page
 And title should be "BriteErp"
 Then user selects BriteErpDemo
 Then user enters "Lunch_Invoicing_User3@info.com" and "LD686gfX24"
 Then user clicks on Log in button
 Then channel_inbox page should be displayed

  Scenario: manager login
    Given user is already on Login Page
    And title should be "BriteErp"
    Then user selects BriteErpDemo
    Then user enters "Lunch_InvoicingManager3@info.com" and "LD686gfX24"
    Then user clicks on Log in button
    Then channel_inbox page should be displayed

  Scenario Outline: BriteERP Login Test Scenario
Examples:
|    username                     | password   |
|Lunch_InvoicingManager3@info.com | LD686gfX24 |
|Lunch_Invoicing_User@info.com    | LD686gfX26 |