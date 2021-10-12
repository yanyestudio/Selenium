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
  "duration": 566475900,
  "error_message": "java.lang.Exception: Could not find the driver title java.lang.NullPointerException\r\n\tat pom.BasePage.getTitle(BasePage.java:48)\r\n\tat pom.HomePage.homePageIsDisplayed(HomePage.java:21)\r\n\tat seleniumglucode.Test.user_is_on_demo_page(Test.java:15)\r\n\tat ✽.Given User is on demo page(C:/Projects/Selenium/Selenium_Cucumber/src/test/java/features/test.feature:5)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "Test.click_on_Link()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Test.validate_the_message()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 1696800,
  "status": "passed"
});
});