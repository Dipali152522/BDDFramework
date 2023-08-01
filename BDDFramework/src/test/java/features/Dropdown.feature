Feature: Verify dropdown box

  Background:
    Given the user navigate to the home page
    And the user follows "Dropdown" link


  Scenario Outline: Verify that the user can select an option from the dropdown list

    When the user selects "<option>" option from the dropdown list
    Then the user should see "<option>" option is selected in the dropdown list

    Examples:
      | option   |
      | Option 1 |
      | Option 2 |

