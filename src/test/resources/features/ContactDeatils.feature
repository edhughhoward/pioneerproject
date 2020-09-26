Feature: Add Contact Details

  @ContactDetails
  Scenario Outline: Add Employee Contact Details
    When login with valid credentials
    Then select pim
    Then select employee
    Then select contact details
    Then select edit
    Then enter in "<Street 1>", "<Street 2>", "<City>", "<State>", "<ZipCode>", "<HomePhone>", "<CellPhone>", "<WorkPhone>", "<WorkEmail>", "<OtherEmail>"
    Then enter in country
    Then click on save

    Examples: 
      | Street 1        | Street 2 | City       | State | ZipCode | HomePhone  | CellPhone  | WorkPhone  | WorkEmail    | OtherEmail   |
      | 5069 Shery Road |          | Washington | DC    |   20019 | 2022022213 | 2022022283 | 2022022214 | eddie123@gmail.com | eddie55@gmail.com |

  @EmergencyDetails
  Scenario: Edit Emergency Contact Details
    When login with valid credentials
    Then select pim
    Then select employee
    Then select emergency details
    Then select edit
    Then enter in employee contact details
    Then click on save
    And verify information is saved
