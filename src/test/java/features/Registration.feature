Feature: Registration on website: codenboxautomationlab.com


  Scenario: Registering a new user.

    Given Open chrome and navigate to codenboxautomationlab.com
    When  Enter First Name and Last Name.
    And   Enter a valid Mobile Number.
    And   Enter a valid E-mail that should be unique for every user.
    And   Select any option from the drop-down list-Course.
    And   Select any option from the drop-down list-Month.
    And   Select any radio button.
    And   Click the Register button.

    Then  Confirm registration is complete