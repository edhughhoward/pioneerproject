package com.hrm.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrm.testbase.BaseClass;

public class ContactDetails extends BaseClass {
	@FindBy(id = "menu_pim_viewPimModule")
	public WebElement pimLinkBtn;

	@FindBy (id = "menu_pim_viewEmployeeList")
	public WebElement employeeList;
	
	@FindBy (xpath = "//*[@id=\"resultTable\"]/tbody/tr[1]/td[2]/a")
	public WebElement firstEmployee;
	
	@FindBy (id = "btnSave")
	public WebElement editButton;
	
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
	
	@FindBy(id = "contact_state")
	public WebElement stateDD;
	
	@FindBy(id = "contact_country")
	public WebElement countryDD;
	
	@FindBy(id = "contact_emp_mobile")
	public WebElement cellPhone;
	
	@FindBy(id = "contact_emp_work_telephone")
	public WebElement workPhone;
	
	@FindBy(id = "contact_emp_work_email")
	public WebElement workEmail;
	
	@FindBy(id = "contact_emp_oth_email")
	public WebElement otherEmail;
	
	@FindBy(id = "btnSave")
	public WebElement save;
	
	@FindBy(xpath = "//*[@id=\"sidenav\"]/li[3]/a")
	public WebElement emergencyButton;
	
	@FindBy(id = "btnAddContact")
	public WebElement emergAdd;
	
	@FindBy(id = "emgcontacts_name")
	public WebElement emergName;
	
	@FindBy(id = "emgcontacts_relationship")
	public WebElement emergRelation;
	
	@FindBy(id = "emgcontacts_homePhone")
	public WebElement emergHome;
	
	@FindBy(id = "emgcontacts_mobilePhone")
	public WebElement emergCell;
	
	@FindBy(id = "emgcontacts_workPhone")
	public WebElement emergWork;
	
	@FindBy(id = "btnSaveEContact")
	public WebElement emergSave;
	
	
	
	
	public ContactDetails() {
		PageFactory.initElements(driver, this);
	}

}
