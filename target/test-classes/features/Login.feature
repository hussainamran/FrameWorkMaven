Feature: Login feature

  Background:
    #Given user is navigated to HRMS application

  @smoke  @mvn
  Scenario Outline: Valid admin login
    When user enters different "<username>" and "<password>"
    And user click on login button
    Then "<admin>" user is successfully logged in
    Examples:
      | username | password    | admin |
      | admin    | Hum@nhrm123 | Admin |


  @apple @batch11
  Scenario: Valid ess login
    When user enter valid ess admin username and password
    And user click on login button
    Then admin user is successfully logged in

  @login @batch11
  Scenario Outline: negative login test
    When user enters different "<username>" and "<password>" and verify the "<error>" for all the combinations
    Examples:
      | username | password    | error                    |
      | admin    | xyz         | Invalid credentials      |
      | adminw   | Hum@nhrm123 | Invalid credentials      |
      |          | Hum@nhrm123 | Username cannot be empty |
      | adminw   |             | Password cannot be empty |







