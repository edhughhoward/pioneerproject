package com.hrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrm.testbase.BaseClass;

public class PersonalDetailsPageElements extends BaseClass {

	@FindBy(xpath = "//div[@id='profile-pic']/h1")
	public WebElement profileName;

	public PersonalDetailsPageElements() {
		PageFactory.initElements(driver, this);
	}
}
