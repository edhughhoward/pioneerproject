Feature: Add Contact Details

@regression
Scenario: Add Employee Contact Details
When login with valid credentials
Then select employee
Then select contact details
Then select edit
Then enter in employee contact details
Then click on save
And verify information is saved

