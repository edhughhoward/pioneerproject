package com.hrm.stepDefinitions;

import org.junit.Assert;

import com.hrm.utils.CommonMethods;
import com.hrm.utils.ConfigsReader;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinitions extends CommonMethods{

	@When("login with valid credentials")
	public void login_with_valid_credentials() {
		sendText(login.userNametextBox, ConfigsReader.getPropValue("username"));
		sendText(login.passwordTextBox, ConfigsReader.getPropValue("password"));
		click(login.btnLogin);
	}

	

	
	@When("login with invalid credentials")
	public void login_with_invalid_credentials() {
		login.loginToHrms("Admin1", "Hum@nhrm1231");
	}

	@Then("verify the error message")
	public void verify_the_error_message() {
		Assert.assertTrue(login.spanMessage.isDisplayed());
	}
}
