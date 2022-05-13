package com.weathershopper.objectrepositorylib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.weathershopper.genericlib.BaseClass;

public class MyInfoPage extends BaseClass {

	@FindBy(xpath = "//a[@id=\"menu_pim_viewMyDetails\"]")
	WebElement myInfoTab;

	@FindBy(xpath = "//input[@value='Edit']")
	WebElement myInfoEditButton;

	@FindBy(xpath = "// input[@id='personal_txtEmpFirstName']")
	WebElement myInfoInputFirstName;

	@FindBy(xpath = "// input[@id='personal_txtEmpLastName']")
	WebElement myInfoInputLastName;

	@FindBy(xpath = "// input[@id='personal_optGender_1']")
	WebElement myInfoGender;

	@FindBy(xpath = "//input[@id='btnSave']")
	WebElement myInfoSave;

	@FindBy(xpath = "//ul[@id='sidenav']//a[contains(text(),'Qualifications')]")
	WebElement qualifications;

	@FindBy(xpath = "//input[@id='addWorkExperience']")
	WebElement addWorkExperience;

	@FindBy(xpath = "//input[@id='experience_employer']")
	WebElement inputCompany;

	@FindBy(xpath = "//input[@id='experience_jobtitle']")
	WebElement inputJobTitle;

	@FindBy(xpath = "//input[@id='btnWorkExpSave']")
	WebElement workExpSaveBtn;

	public void ClickOnMyInfoTab() {
		myInfoTab.click();
	}

	public void EdituserInformation() {

		myInfoTab.click();
		myInfoEditButton.click();
		myInfoInputFirstName.sendKeys("FirstNameEdit");
		myInfoInputLastName.sendKeys("LastNameEdit");
		myInfoGender.click();
		Select drpNationality = new Select(driver.findElement(By.id("personal_cmbNation")));
		drpNationality.selectByVisibleText("Indian");
		myInfoSave.click();

	}

	public void AddWorkExperience() {
		qualifications.click();
		addWorkExperience.click();
		inputCompany.sendKeys("Google");
		inputJobTitle.sendKeys("SDET");
		workExpSaveBtn.click();

	}

}
