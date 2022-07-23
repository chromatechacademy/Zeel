$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/com/features/login.feature");
formatter.feature({
  "name": "Login Scenarios",
  "description": "    Description: This feature file contains Chroma Tech School Management System Login Scenarios",
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
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "a teacher is on the CTSMS login page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDef.a_teacher_is_on_the_CTSMS_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the teacher logs in with username \"general@teacher.com\" and password \"123456\"",
  "keyword": "When "
});
formatter.match({
  "location": "LoginStepDef.the_teacher_logs_in_with_username_and_password(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the teacher should be succesfully logged in and page title is \"Chroma Tech Academy\"",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDef.the_teacher_should_be_succesfully_logged_in_and_page_title_is(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});