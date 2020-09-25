package com.hrm.testbase;


import com.hrm.pages.DashboardPageElements;
import com.hrm.pages.LoginPageElements;


public class PageInitializer extends BaseClass{
	public static LoginPageElements login;
	protected static DashboardPageElements dash;
	//protected static AddEmployeePageElements addEmp;
	//protected static PersonalDetailsPageElements persDetails;

	public static void initializePageObjects() {
		login = new LoginPageElements();
		dash = new DashboardPageElements();
		//addEmp = new AddEmployeePageElements();
		//persDetails=new PersonalDetailsPageElements();
	}
}
