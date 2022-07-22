Feature: Login Scenarios

Description: This feature file contains Chroma Tech School Management System Login Scenarios


@chroma @Smoke
Scenario: Login with valid credentials
Given user is on the login page
When user logs in with valid credentials
Then user is directed to home page


