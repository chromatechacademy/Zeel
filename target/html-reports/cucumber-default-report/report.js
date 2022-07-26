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
formatter.scenario({
  "name": "Invalid Credentials login attempt",
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
  "name": "a user attempts to login with invalid credentials such as username \"test@fakeemail.com\" and password \"fakepassword\"",
  "keyword": "When "
});
formatter.match({
  "location": "LoginStepDef.a_user_attempts_to_login_with_invalid_credentials_such_as_username_and_password(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should see message \"Invalid Username or Password\"",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDef.user_should_see_message(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Invalid login with multiple credentials",
  "description": "",
  "keyword": "Scenario Outline",
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
  "name": "a teacher is on the CTSMS login page",
  "keyword": "Given "
});
formatter.step({
  "name": "a user attempts to login with invalid credentials with username \"\u003cinvalidUsername\u003e\" and password \"\u003cinvalidPassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "user should see message \"Invalid Username or Password\"",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "invalidUsername",
        "invalidPassword"
      ]
    },
    {
      "cells": [
        "test@email.com",
        "123456"
      ]
    },
    {
      "cells": [
        "test1@email.com",
        "123456"
      ]
    },
    {
      "cells": [
        "test2@email.com",
        "123456"
      ]
    },
    {
      "cells": [
        "testingFakeusername",
        "scadsadsdc"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Invalid login with multiple credentials",
  "description": "",
  "keyword": "Scenario Outline",
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
  "name": "a user attempts to login with invalid credentials with username \"test@email.com\" and password \"123456\"",
  "keyword": "When "
});
formatter.match({
  "location": "LoginStepDef.a_user_attempts_to_login_with_invalid_credentials_with_username_and_password(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should see message \"Invalid Username or Password\"",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDef.user_should_see_message(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Invalid login with multiple credentials",
  "description": "",
  "keyword": "Scenario Outline",
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
  "name": "a user attempts to login with invalid credentials with username \"test1@email.com\" and password \"123456\"",
  "keyword": "When "
});
formatter.match({
  "location": "LoginStepDef.a_user_attempts_to_login_with_invalid_credentials_with_username_and_password(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should see message \"Invalid Username or Password\"",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDef.user_should_see_message(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Invalid login with multiple credentials",
  "description": "",
  "keyword": "Scenario Outline",
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
  "name": "a user attempts to login with invalid credentials with username \"test2@email.com\" and password \"123456\"",
  "keyword": "When "
});
formatter.match({
  "location": "LoginStepDef.a_user_attempts_to_login_with_invalid_credentials_with_username_and_password(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should see message \"Invalid Username or Password\"",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDef.user_should_see_message(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Invalid login with multiple credentials",
  "description": "",
  "keyword": "Scenario Outline",
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
  "name": "a user attempts to login with invalid credentials with username \"testingFakeusername\" and password \"scadsadsdc\"",
  "keyword": "When "
});
formatter.match({
  "location": "LoginStepDef.a_user_attempts_to_login_with_invalid_credentials_with_username_and_password(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should see message \"Invalid Username or Password\"",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDef.user_should_see_message(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});