Feature: Login functionality
@wip
  Scenario: Test WebApplication is up and running
  Given the user opens the browser
  When the user goes to the website
  Then the title should be displayed
  And the page should contain links to databases
  |BriteErp    |
  |BriteErpDemo|
  |Test        |
@wip
  Scenario Outline: Login
    Given the user opens the browser
    When the user clicks on BriteErpDemo
    And the user enters valid <email> and <password>
    And the user clicks on Login button
    Then the url is correct
    And the title should be displayed


    Examples:
|    username                     | password   |
|Lunch_InvoicingManager3@info.com | LD686gfX24 |
|Lunch_Invoicing_User@info.com    | LD686gfX26 |