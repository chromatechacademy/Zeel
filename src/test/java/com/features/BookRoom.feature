Feature: Book the room for single night

    Description: This feature file contains booking a room from calendar for single night

    Background:
        Given a user navigate to the URL
        And a user clicks on Let me hack! button if the page title "Restful-booker-platform demo"

    @Zeel @TC2 @Smoke
    Scenario Outline: Book a single room for one night
        When a user scrolls down to the book this room section
        And the user clicks on Book this room button
        And the  user selects single night
        And the user fills out the following fields "<Firstname>", "<Lastname>", "<Email>", "<Phone>"
        And the user clicks on Book button
        Then  the message is displayed on the confirmation modal "Booking Successful!", 'Congratulations! Your booking has been confirmed for:', "<Booked dates>"

        Examples:
            | Firstname | Lastname | Email                 | Phone        |
            | Grace     | Hopper   | grace.hopper@zeel.com | 347-555-9898 |



