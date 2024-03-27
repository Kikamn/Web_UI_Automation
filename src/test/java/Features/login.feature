@Login
Feature: Login

  @Login-valid
  Scenario: Login using valid username and password
    Given user is on login page
    And user input username with "standard_user"
    And user input password with "secret_sauce"
    When user click login button

  @Login-invalid1
  Scenario: Login using invalid username and password
    Given user is on login page
    And user input username with "kika_mn"
    And user input password with "kika123"
    When user click login button
    Then user able to see error message "Epic sadface: Username and password do not match any user in this service"

    @Login-invalid2
    Scenario: Login using invalid username
      Given user is on login page
      And user input username with "kika_mn"
      And user input password with "secret_sauce"
      When user click login button
      Then user able to see error message "Epic sadface: Username and password do not match any user in this service"

    @Login-invalid3
    Scenario: Login using invalid password
      Given user is on login page
      And user input username with "standard_user"
      And user input password with "123456"
      When user click login button
      Then user able to see error message "Epic sadface: Username and password do not match any user in this service"

    @Login-invalid4
    Scenario: Login using valid username and password blank
      Given user is on login page
      And user input username with "standard_user"
      And user input password with ""
      When user click login button
      Then user able to see error message "Epic sadface: Password is required"

    @Login-invalid5
    Scenario: Login using valid username and password blank
      Given user is on login page
      And user input username with ""
      And user input password with "secret_sauce"
      When user click login button
      Then user able to see error message "Epic sadface: Username is required"

    @Login-invalid6
      Scenario: Login using blank Username and password
       Given User is on login page
        And user input username with ""
        And user input password with ""
        When user click login button
        Then user able to see error message "Epic sadface: Username is required"









