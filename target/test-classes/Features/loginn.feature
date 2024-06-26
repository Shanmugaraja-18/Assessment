Feature: Login Action
  Description: This feature will test a LogIn and LogOut functionality

  Scenario Outline: Login with valid and Invalid Credentials
    Given User is on Home Page
    When User navigate to Login Page
    Then User enters "<username>" and "<password>"
    And Keeping case as <Case>
    Then User should get logged in
    And Message displayed Login Successfully
    Then User enters "<username>" and "<password>"
    And Keeping case as <Case>
    Then user will be asked to go back to login page
    And Provide correct credentials

    Examples:
      | username        | password | Case   |
      | abc@gmail.com  | 12345    | Valid  |
      | abc1@gmail.com | dfsd2    | Invalid|






#Author
#Date
#Description
#Feature: feature to test login functionality
#
  #Scenario: Check login is successfully validated
    #Given user is on login page
    #When user enters username and password
    #And clicks on the login button
    #Then user is navigated to the home page
