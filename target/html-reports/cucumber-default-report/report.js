$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/com/features/login.feature");
formatter.feature({
  "name": "Login Scenarios",
  "description": "Description: This feature file contains Chroma Tech School Management System Login Scenarios",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Login with valid credentials",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@chroma"
    },
    {
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "name": "user is on the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDef.user_is_on_the_login_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user logs in with valid credentials",
  "keyword": "When "
});
formatter.match({
  "location": "LoginStepDef.user_logs_in_with_valid_credentials()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user is directed to home page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDef.user_is_directed_to_home_page()"
});
formatter.result({
  "status": "skipped"
});
});