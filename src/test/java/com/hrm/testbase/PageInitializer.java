package com.hrm.testbase;


import com.hrm.pages.LoginPageElements;
import com.hrm.pages.ContactDetails;


public class PageInitializer extends BaseClass{
	public static LoginPageElements login;
	protected static ContactDetails contactDet;

	public static void initializePageObjects() {
		login = new LoginPageElements();
		contactDet = new ContactDetails();

	}
}
