Feature: Personal detialPage

  @Homework
  Scenario: Modify personal detial page
    When user is logged in with admin credentials
    When user click on Pim Option
   # When user enter valid employee id
    #And user click on search button
    And user click on employee ID
    When user click on edit button
    Then verify the Personal Details page
    And  user can able to edit all personal detial fields
    When user click on the personal detial save button
    Then all the detial personal information is saved
