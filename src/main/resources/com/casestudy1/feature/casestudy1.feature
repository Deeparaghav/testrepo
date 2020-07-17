Feature: to signup
Scenario: to check user is able to signup
    Given to signup
    When clicking on signup user should move to Registration page
    And  on entering mandatory fields like firstname, lastname, e-mail, Username, pass, Confirm password in Registration page 
    And clicking on Register button in Registration page 
    Then user should move to confirmation page 
    And verify whether firstame and last name displayed with the confirmation messgae on confirmation page 
    And verify whether dropdown is shown upon clicking it  
    And  validate  By clicking Compose,   a new windows is opened, and tester entered as shown below
    When another email id is entered 
    And subject is entered 
    And composed message 
    When clicking on send 
    Then acknowledgement message should be displayed