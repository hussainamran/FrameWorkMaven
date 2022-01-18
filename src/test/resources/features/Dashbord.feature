Feature: Dashbord functionally

  @dashboard
  Scenario: Verify dashboard tabs
    When user enter valid admin username and password
    And user click on login button
    Then  admin user is successfully logged in
    Then verify all the dashboard tabs
    |Admin|PIM|Leave|Time|Recruitment|Performance|Dashboard|Directory|