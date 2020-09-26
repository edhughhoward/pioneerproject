package com.hrm.testbase;


import com.hrm.pages.AddEmployeePageElements;
import com.hrm.pages.DashboardPageElements;
import com.hrm.pages.LoginPageElements;
import com.hrm.pages.PersonalDetailsPageElements;
import com.hrm.pages.ContactDetails;


public class PageInitializer extends BaseClass{
	public static LoginPageElements login;
	protected static DashboardPageElements dash;
	protected static AddEmployeePageElements addEmp;
	protected static PersonalDetailsPageElements persDetails;
	protected static ContactDetails contactDet;

	public static void initializePageObjects() {
		login = new LoginPageElements();
		dash = new DashboardPageElements();
		contactDet = new ContactDetails();
		//addEmp = new AddEmployeePageElements();
		//persDetails=new PersonalDetailsPageElements();
	}
}
