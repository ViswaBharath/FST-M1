package com.weathershopper.objectrepositorylib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.weathershopper.genericlib.BaseClass;

public class PimPage extends BaseClass {

	String expectedEmployeeName = "Tourist";

	@FindBy(xpath = "//a[@id='menu_pim_viewEmployeeList']")
	WebElement employeeListTb;

	@FindBy(xpath = "//input[@id=\"btnAdd\"]")
	WebElement addButton;

	@FindBy(xpath = "//input[@id=\"firstName\"]")
	WebElement inputFirstName;

	@FindBy(xpath = "//input[@id='lastName']")
	WebElement inputLastName;

	@FindBy(xpath = "//input[@id='btnSave']")
	WebElement save;

	@FindBy(xpath = "//input[@id='searchBtn']")
	WebElement searchButton;

	@FindBy(xpath = "//input[@id='empsearch_employee_name_empName']")
	WebElement inputEmployeeName;

	@FindBy(xpath = "//*[@id=\"resultTable\"]/tbody/tr[1]/td[3]/a[text()]")
	WebElement actualEmployeeName;

	public void AddNewEmployee() {
		employeeListTb.click();
		addButton.click();
		inputFirstName.sendKeys("Tourist");
		inputLastName.sendKeys("Hi");
		save.click();
	}

	public void SearchEmployee() {
		employeeListTb.click();
		inputEmployeeName.sendKeys("Tourist");
		searchButton.click();
	}

	public void VerifyEmployeeName() {
		String employeeName = actualEmployeeName.getText();
		Assert.assertEquals(expectedEmployeeName, employeeName);
	}

}
