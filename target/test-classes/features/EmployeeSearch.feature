Feature: US-12345 Employee search

  Background:
    When user is logged in with admin credentials
   # When user enter valid admin username and password
    #And user click on login button
    #Then admin user is successfully logged in
    When use navigate to employee list page

  @test
  Scenario: Search employee by id
    When user enter valid employee id
    And user click on search button
    Then user see employee information is displayed


  @test1
  Scenario: Search employee by name
    When user enter valid employee name
    And user click on search button
    Then user see employee information is displayed


