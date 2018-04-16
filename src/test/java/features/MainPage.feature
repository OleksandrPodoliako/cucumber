Feature: Main page

  Scenario: Logo is visible
    Given Navigate to new post site
    Then Check that logo is visible

  Scenario Outline: Invalid log in
    Given Navigate to new post site
    Then Click to exit button
    And Log in <login> ,<password>
    Then Check that error message appears
    Examples:
      | login | password |
      | user1 | pass1    |
      | user2 | pass2    |