package com.hrm.pages;


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
	
	@FindBy(id = "contact_city")
	public WebElement city;
	
	@FindBy(id = "contact_emp_zipcode")
	public WebElement zip;
	
	@FindBy(id = "contact_emp_hm_telephone")
	public WebElement homePhone;
	
	@FindBy(id = "contact_province")
	public WebElement state;
	
	@FindBy(id = "contact_country")
	public WebElement country;
	
	@FindBy(id = "contact_emp_mobile")
	public WebElement cellPhone;
	
	@FindBy(id = "contact_emp_work_telephone")
	public WebElement workPhone;
	
	@FindBy(id = "contact_emp_work_email")
	public WebElement workEmail;
	
	@FindBy(id = "contact_emp_oth_email")
	public WebElement otherEmail;
	
	
	
	
	
	public ContactDetails() {
		PageFactory.initElements(driver, this);
	}

}
