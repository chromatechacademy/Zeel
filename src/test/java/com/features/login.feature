Feature: Login Scenarios

    Description: This feature file contains Chroma Tech School Management System Login Scenarios

    @chroma @Smoke
    Scenario: Login with valid credentials
        Given a teacher is on the CTSMS login page
        When the teacher logs in with username "general@teacher.com" and password "123456"
        Then the teacher should be succesfully logged in and page title is "Chroma Tech Academy"


    @chroma @Smoke
    Scenario: Invalid Credentials login attempt
        Given a teacher is on the CTSMS login page
        When a user attempts to login with invalid credentials such as username "test@fakeemail.com" and password "fakepassword"
        Then user should see message "Invalid Username or Password"

    @chroma @Smoke
    Scenario Outline: Invalid login with multiple credentials
        Given a teacher is on the CTSMS login page
        When a user attempts to login with invalid credentials with username "<invalidUsername>" and password "<invalidPassword>"
        Then user should see message "Invalid Username or Password"

        Examples:
            | invalidUsername     | invalidPassword |
            | test@email.com      | 123456          |
            | test1@email.com     | 123456          |
            | test2@email.com     | 123456          |
            | testingFakeusername | scadsadsdc      |



