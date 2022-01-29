Feature: Add employee

  Background:
    When user enter valid admin username and password
    And user click on login button
    Then  admin user is successfully logged in
    When user click on Pim Option
    And user click on Add employee button

  @regression
  Scenario: Adding one employee from feature file
    And user enter firstname and lastname
    And user click on save button
    Then employee added successfully

  @ddt @regression
  Scenario Outline: Add employee
    And user enter "<firstName>" "<middleName>" and "<lastName>"
    And user click on save button
    Then employee added successfully
# this is called example table
    Examples:
      | firstName | middleName | lastName |
      | test123   | MS         | test456  |
      | test157   | MS         | test573  |
      | test132   | MS         | test968  |

  @cucumber @regression
  Scenario: Adding one employee using cucumber feature
    And user enter direct data "<Amran>" "<Ruhul>" and "<Malik>"
    And user click on save button
    Then employee added successfully


  @datatable
    #this the way we use loop to add many data and this is called normal table
  Scenario: Add employee
    When user add multiple employees and verify they are added
      | firstName | middleName | lastName |
      | test123   | MS         | test456  |
      | test157   | MS         | test573  |
      | test132   | MS         | test968  |

  @excel
  Scenario: Adding employee from excel file
    When user add multiple employees from excel file using "EmployeeData" sheet and verify and added employee