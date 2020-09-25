package com.hrm.stepDefinitions;

import com.hrm.utils.CommonMethods;

import io.cucumber.java.en.Then;

public class ContactDetailsStepDefinitions extends CommonMethods{
	@Then("select pim")
	public void select_pim() {
		waitForClickability(dash.pimLinkBtn);
		click(dash.pimLinkBtn);

	}
	
	@Then("select employee")
	public void select_employee() {
		click(dash.employeeList);
		waitForClickability(dash.firstEmployee);
		click(dash.firstEmployee);

	}

	@Then("select contact details")
	public void select_contact_details() {

	}

	@Then("select edit")
	public void select_edit() {

	}

	@Then("enter in employee contact details")
	public void enter_in_employee_contact_details() {

	}

	@Then("click on save")
	public void click_on_save() {

	}

	@Then("verify information is saved")
	public void verify_information_is_saved() {

	}
	
}
