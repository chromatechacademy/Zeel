$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/com/features/login.feature");
formatter.feature({
  "name": "Login Scenarios",
  "description": "    Description: This feature file contains Chroma Tech School Management System Login Scenarios",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Invalid Credentials login attempt",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@chroma"
    },
    {
      "name": "@Progression"
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
  "name": "a user attempts to login with invalid credentials such as username \"test@fakeemail.com\" and password \"fakepassword\"",
  "keyword": "When "
});
formatter.match({
  "location": "LoginStepDef.a_user_attempts_to_login_with_invalid_credentials_such_as_username_and_password(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});