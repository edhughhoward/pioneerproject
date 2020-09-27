@EdsTests
Feature: Add Contact Details

  Background: 
    When login with valid credentials
    Then select pim
    Then select employee

  @ContactDetails
  Scenario Outline: Add Employee Contact Details
    Then select contact details
    Then select edit
    Then enter in "<Street 1>", "<Street 2>", "<City>", "<ZipCode>", "<HomePhone>", "<CellPhone>", "<WorkPhone>", "<WorkEmail>", "<OtherEmail>"
    Then enter in country and state
    Then click on save

    Examples: 
      | Street 1        | Street 2 | City       | ZipCode | HomePhone  | CellPhone  | WorkPhone  | WorkEmail          | OtherEmail        |
      | 5069 Shery Road |          | Washington |   20019 | 2022022213 | 2022022283 | 2022022214 | eddie123@gmail.com | eddie55@gmail.com |

  @EmergencyDetails
  Scenario Outline: Edit Emergency Contact Details
    Then select emergency details
    Then click add
    Then enter in "<Name>", "<Relationship>", "<HomeNumber>", "<CellNumber>", "<WorkNumber>"
    Then click on save button

    Examples: 
      | Name        | Relationship | HomeNumber | CellNumber | WorkNumber |
      | Jack Spicer | brother      | 2022222928 | 2029998987 | 2022221234 |
