Feature: Login Scenarios

    Description: This feature file contains Chroma Tech School Management System Login Scenarios

    @chroma @Smoke
    Scenario: Login with valid credentials
        Given a teacher is on the CTSMS login page
        When the teacher logs in with username "general@teacher.com" and password "123456"
        Then the teacher should be succesfully logged in and page title is "Chroma Tech Academy"
        




