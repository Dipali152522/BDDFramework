Feature: Verify form authentication

  Background:
    Given the user navigate to the home page
    And the user follows "Form Authentication" link


  Scenario: 1. Verify form authentication with a valid credentials


    When the user enters "tomsmith" in Username field
    And the user enters "SuperSecretPassword!" in password field
    And the user clicks on the login button
    Then the user should see "Secure Area" text on the page
    And the user should see "Welcome to the Secure Area. When you are done click logout below." text on the page

  Scenario: 2. Verify form authentication with a invalid credentials


    When the user enters "tomsmitn" in Username field
    And the user enters "SuperSecretPassword!" in password field
    And the user clicks on the login button
    Then the user should see "Your username is invalid!" text on the page


  Scenario: 3. Verify form Authentication with  valid credentials and single set to login

    When the user login with "tomsmith" username and "SuperSecretPassword!" password
    Then the user should see "Secure Area" text on the page
    And the user should see "Welcome to the Secure Area. When you are done click logout below." text on the page


  Scenario Outline: 4. Verify form authentication with data driven

    When the user login with "<username>" username and "<password>" password
    Then the user should see "<expectedData>" text on the page

    Examples:
      | username | password             | expectedData              |
      | tomsmith | SuperSecretPassword! | Secure Area               |
      | tomsmitn | SuperSecretPassword? | Your username is invalid! |