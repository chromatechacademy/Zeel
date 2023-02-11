Feature: Submit contact form

    Description: This feature file contains submission contact form scenario

    Background:
        Given a user navigate to the URL
        And a user clicks on Let me hack! button if the page title "Restful-booker-platform demo"

    @Zeel @TC1 @Smoke
    Scenario Outline: Submit contact form
        When a user scrolls down to the contact form section
        And a user fills out the following fields "<Name>", "<Email>", "<Phone>", "<Subject>", "<Message>"
        And a user clicks on the Submit button
        Then the message is displayed "Thanks for getting in touch <Name>!", "We'll get back to you about", "<Subject>", "as soon as possible."

        Examples:
            | Name         | Email                 | Phone        | Subject        | Message               |
            | Ada Lovelace | ada.lovelace@zeel.com | 347-555-1212 | Booking a room | Hello. My name is Ada |



