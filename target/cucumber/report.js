$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src\\test\\resources\\features\\login.feature");
formatter.feature({
  "name": "Login functionality",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Test WebApplication is up and running",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@wip"
    }
  ]
});
formatter.step({
  "name": "the user opens the browser",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "the user goes to the website",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "the title should be displayed",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "the page should contain links to databases",
  "rows": [
    {
      "cells": [
        "BriteErp"
      ]
    },
    {
      "cells": [
        "BriteErpDemo"
      ]
    },
    {
      "cells": [
        "Test"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenarioOutline({
  "name": "Login",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@wip"
    }
  ]
});
formatter.step({
  "name": "the user opens the browser",
  "keyword": "Given "
});
formatter.step({
  "name": "the user clicks on BriteErpDemo",
  "keyword": "When "
});
formatter.step({
  "name": "the user enters valid \u003cemail\u003e and \u003cpassword\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "the user clicks on Login button",
  "keyword": "And "
});
formatter.step({
  "name": "the url is correct",
  "keyword": "Then "
});
formatter.step({
  "name": "the title should be displayed",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "Lunch_InvoicingManager3@info.com",
        "LD686gfX24"
      ]
    },
    {
      "cells": [
        "Lunch_Invoicing_User@info.com",
        "LD686gfX26"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Login",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@wip"
    }
  ]
});
formatter.step({
  "name": "the user opens the browser",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "the user clicks on BriteErpDemo",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "the user enters valid \u003cemail\u003e and LD686gfX24",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "the user clicks on Login button",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "the url is correct",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "the title should be displayed",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "name": "Login",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@wip"
    }
  ]
});
formatter.step({
  "name": "the user opens the browser",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "the user clicks on BriteErpDemo",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "the user enters valid \u003cemail\u003e and LD686gfX26",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "the user clicks on Login button",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "the url is correct",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "the title should be displayed",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});