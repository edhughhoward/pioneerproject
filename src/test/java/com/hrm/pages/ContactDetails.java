package com.hrm.pages;


import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrm.testbase.BaseClass;

public class ContactDetails extends BaseClass {
	@FindBy (xpath  = "//table[@id='resultTable']/tbody/tr/td[1]")
	public WebElement employeeSelect;
	
	@FindBy(linkText = "Contact Details")
	public WebElement contactDetails;
	
	@FindBy(id = "contact_street1")
	public WebElement contactStreet1;
	
	@FindBy(id = "contact_street2")
	public WebElement contactStreet2;
	
	@FindBy(id = "city")
	public WebElement city;
	
	
	
	public ContactDetails() {
		PageFactory.initElements(driver, this);
	}

}
