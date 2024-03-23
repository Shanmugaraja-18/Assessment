Feature: Searching different products after login

  Scenario Outline: Searching different products after login
    Given I am on the Login page URL "https://tutorialsninja.com/demo"
    Then I click on sign in button and wait for sign in page
    When I enter username and password
    And click on login button
    Then I am logged in
    And I search different "<product>" from the search bar
    
    Examples:
      | product  |
      | laptops  |
      | pendrive |
      | led tv   |
       