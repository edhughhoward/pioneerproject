Feature: Add Contact Details

@context
Scenario: Add Employee Contact Details
When login with valid credentials
Then select pim
Then select employee
Then select contact details
Then select edit
Then enter in employee contact details
Then click on save
And verify information is saved