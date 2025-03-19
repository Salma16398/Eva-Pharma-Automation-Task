Feature: User Navigates to opensource site

  Scenario: Login and Navigate
  	Given User Opens application
    When User enters a valid username "Admin"
    And User enters  valid password "admin123"
    And Clicks on the login button
    And Clicks on Admin tab and gets record
    And Add an Admin and select role and status
    And enter an employeename "A"
    And enter a username "Salma"
    And enter a password "Salma@321"
    And confirm password "Salma@321"
    And Click on save button
    Then the record count should increase by one
    And Search by username "Salma"
    And Delete user
    Then the record count should decrease by one
    