$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Projects/Selenium/Selenium_Cucumber/src/test/java/features/test.feature");
formatter.feature({
  "line": 1,
  "name": "Verify Alert message.",
  "description": "",
  "id": "verify-alert-message.",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Test Alert scenario 2",
  "description": "",
  "id": "verify-alert-message.;test-alert-scenario-2",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@Search"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "User is on demo page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "click on Alerts and Modals",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Validate the message",
  "keyword": "Then "
});
formatter.match({
  "location": "Test.user_is_on_demo_page()"
});
formatter.result({
  "duration": 5042717800,
  "status": "passed"
});
formatter.match({
  "location": "Test.click_on_Alerts_and_Modals()"
});
formatter.result({
  "duration": 990104200,
  "status": "passed"
});
formatter.match({
  "location": "Test.validate_the_message()"
});
formatter.result({
  "duration": 85882600,
  "status": "passed"
});
});