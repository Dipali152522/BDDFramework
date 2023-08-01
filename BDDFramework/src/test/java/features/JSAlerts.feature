Feature: Verify JavaScript Alerts

  Background:
    Given the user navigate to the home page
    And the user follows "JavaScript Alerts" link


  Scenario: 1. Verify that JS Alert works as expected

    When the user clicks on JS Alert button
    Then the user should see "I am a JS Alert" text on the JS Alert
    And the user accepts the JS Alert
    And the user should see "You successfully clicked an alert" text on the page


  Scenario: 2. Verify that JS Confirm works as expected When accepted

    When the user clicks on JS Confirm button
    Then the user should see "I am a JS Confirm" text on the JS Confirm
    And the user accepts the JS Confirm
    And the user should see "You clicked: Ok" text on the page

  @SmokeTest
  Scenario: 3. Verify that JS Confirm works as expected when dismissed

    When the user clicks on JS Confirm button
    Then the user should see "I am a JS Confirm" text on the JS Confirm
    And the user dismisses the JS Confirm
    And the user should see "You clicked: Cancel" text on the page

    Scenario: 4. Verify that JS Prompt works as expected

      When the user clicks on JS Prompt Button
      Then the user should see "I am a JS prompt" text on the JS Prompt
      And the user enters "Dipali" text in the prompt box and accepts the JS Prompt
      And the user should see "You entered: Dipali" text on the page

