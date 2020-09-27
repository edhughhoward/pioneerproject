package com.hrm.stepDefinitions;

import org.openqa.selenium.support.ui.Select;

import com.hrm.utils.CommonMethods;

import io.cucumber.java.en.Then;

public class ContactDetailsStepDefinitions extends CommonMethods {

	@Then("select pim")
	public void select_pim() {
		waitForClickability(contactDet.pimLinkBtn);
		click(contactDet.pimLinkBtn);

	}

	@Then("select employee")
	public void select_employee() {
		click(contactDet.employeeList);
		waitForClickability(contactDet.firstEmployee);
		jsClick(contactDet.firstEmployee);

	}

	@Then("select contact details")
	public void select_contact_details() {
		click(contactDet.contactDetails);
	}

	@Then("select edit")
	public void select_edit() {
		click(contactDet.editButton);

	}

	@Then("enter in {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}")
	public void enter_in(String Address1, String Address2, String City, String ZipCode, String homephone,
			String cellphone, String workphone, String workemail, String otheremail) {
		sendText(contactDet.contactStreet1, Address1);
		sendText(contactDet.contactStreet2, Address2);
		sendText(contactDet.city, City);
		sendText(contactDet.zip, ZipCode);
		sendText(contactDet.homePhone, homephone);
		sendText(contactDet.cellPhone, cellphone);
		sendText(contactDet.workPhone, workphone);
		sendText(contactDet.workEmail, workemail);
		sendText(contactDet.otherEmail, otheremail);
	}

	@Then("enter in country and state")
	public void enter_in_country_and_state() throws InterruptedException {
		Select ddState = new Select(contactDet.stateDD);
		ddState.selectByValue("VA");
	}

	@Then("click on save")
	public void click_on_save() {
		jsClick(contactDet.save);

	}
	@Then("select emergency details")
	public void select_emergency_details() {
		click(contactDet.emergencyButton);
	}
	@Then("click add")
	public void click_add() {
		click(contactDet.emergAdd);
	}

	@Then("enter in {string}, {string}, {string}, {string}, {string}")
	public void enter_in(String Name, String Relationship, String HomeNumber, String CellNumber, String WorkNumber) {
		sendText(contactDet.emergName, Name);
		sendText(contactDet.emergRelation, Relationship);
		sendText(contactDet.emergHome, HomeNumber);
		sendText(contactDet.emergCell, CellNumber);
		sendText(contactDet.emergWork, WorkNumber);
		
	}
	@Then("click on save button")
	public void click_on_save_button() {
		click(contactDet.emergSave);
	}

}
