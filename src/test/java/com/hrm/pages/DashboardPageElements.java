package com.hrm.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrm.testbase.BaseClass;

public class DashboardPageElements extends BaseClass {
	@FindBy(id = "menu_pim_viewPimModule")
	public WebElement pimLinkBtn;

	@FindBy(id = "menu_admin_viewAdminModule")
	public WebElement adminLinkBtn;
	
	@FindBy(id = "menu_leave_viewLeaveModule")
	public WebElement leaveLinkBtn;

	@FindBy(id = "menu_time_viewTimeModule")
	public WebElement timeLinkBtn;

	@FindBy(id = "menu_recruitment_viewRecruitmentModule")
	public WebElement recruitmentLinkBtn;

	@FindBy(id = "menu_dashboard_index")
	public WebElement dashboardLinkBtn;

	@FindBy(id = "menu_directory_viewDirectory")
	public WebElement directoryLinkBtn;
	
	@FindBy(css = "a#welcome")
	public WebElement welcome;
	
	@FindBy(id = "menu_pim_addEmployee")
	public WebElement addEmpBtn;
	
	@FindBy(xpath = "//div[@class = 'menu']/ul/ui")
	public List<WebElement> dashTabs;
	
	@FindBy(linkText = "Contact Details")
	public WebElement contactDetails;
	
	@FindBy (xpath = "//table[@id='resultTable']/tbody/tr/td[2]")
	public WebElement firstEmployee;
	
	@FindBy (id = "menu_pim_viewEmployeeList")
	public WebElement employeeList;
	


	public DashboardPageElements() {
		PageFactory.initElements(driver, this);
	}
}