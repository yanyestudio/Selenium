$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Projects/Selenium/Selenium_Cucumber/src/test/java/features/test.feature");
formatter.feature({
  "line": 1,
  "name": "Verify Menu Page.",
  "description": "",
  "id": "verify-menu-page.",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Test page title",
  "description": "",
  "id": "verify-menu-page.;test-page-title",
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
  "name": "click on Link",
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
  "duration": 5124188400,
  "status": "passed"
});
formatter.match({
  "location": "Test.click_on_Link()"
});
formatter.result({
  "duration": 2137152100,
  "status": "passed"
});
formatter.match({
  "location": "Test.validate_the_message()"
});
formatter.result({
  "duration": 912816800,
  "status": "passed"
});
formatter.after({
  "duration": 171000,
  "status": "passed"
});
});