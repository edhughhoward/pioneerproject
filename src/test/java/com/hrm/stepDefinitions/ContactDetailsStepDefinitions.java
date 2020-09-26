package com.hrm.stepDefinitions;

import org.openqa.selenium.support.ui.Select;

import com.hrm.utils.CommonMethods;

import io.cucumber.java.en.Then;

public class ContactDetailsStepDefinitions extends CommonMethods {

	@Then("select pim")
	public void select_pim() {
		waitForClickability(dash.pimLinkBtn);
		click(dash.pimLinkBtn);

	}

	@Then("select employee")
	public void select_employee() {
		click(dash.employeeList);
		waitForClickability(dash.firstEmployee);
		jsClick(dash.firstEmployee);

	}

	@Then("select contact details")
	public void select_contact_details() {
		click(dash.contactDetails);
	}

	@Then("select edit")
	public void select_edit() {
		click(dash.editButton);

	}

	@Then("enter in {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}")
	public void enter_in(String Address1, String Address2, String City, String State, String ZipCode, String homephone,
			String cellphone, String workphone, String workemail, String otheremail) {
		sendText(contactDet.contactStreet1, Address1);
		sendText(contactDet.contactStreet2, Address2);
		sendText(contactDet.city, City);
		sendText(contactDet.state, State);
		sendText(contactDet.zip, ZipCode);
		sendText(contactDet.homePhone, homephone);
		sendText(contactDet.cellPhone, cellphone);
		sendText(contactDet.workPhone, workphone);
		sendText(contactDet.workEmail, workemail);
		sendText(contactDet.otherEmail, otheremail);
	}

	@Then("enter in country")
	public void enter_in_country() {
		Select selectdd = new Select(dash.countryDD);
		selectdd.selectByValue("AF");
	}

	@Then("click on save")
	public void click_on_save() {
		click(dash.editButton);

	}

}
