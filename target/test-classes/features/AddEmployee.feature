Feature: Add employee

  Background:
    * user enter valid admin username and password
    * user click on login button
    *  admin user is successfully logged in
    * user click on Pim Option
    * user click on Add employee button

  @regression
  Scenario: Adding one employee from feature file
    * user enter firstname and lastname
    * user click on save button
    * employee added successfully

  @ddt
  Scenario Outline: Add employee
    * user enter "<firstName>" "<middleName>" and "<lastName>"
    * user click on save button
    * employee added successfully
# this is called example table
    Examples:
      | firstName | middleName | lastName |
      | test123   | MS         | test456  |
      | test157   | MS         | test573  |
      | test132   | MS         | test968  |

  @cucumber
  Scenario: Adding one employee using cucumber feature
    * user enter direct data "<Amran>" "<Ruhul>" and "<Malik>"
    * user click on save button
    * employee added successfully


  @datatable
    #this the way we use loop to add many data and this is called normal table
  Scenario: Add employee
    When user add multiple employees and verify they are added
      | firstName | middleName | lastName |
      | test123   | MS         | test456  |
      | test157   | MS         | test573  |
      | test132   | MS         | test968  |
