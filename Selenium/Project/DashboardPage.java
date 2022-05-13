package com.weathershopper.objectrepositorylib;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.weathershopper.genericlib.BaseClass;

public class DashboardPage extends BaseClass {

	@FindBy(xpath = "//span[normalize-space()='Apply Leave']")
	WebElement applyLeave;

	@FindBy(xpath = "//input[@id='applyleave_txtFromDate']")
	WebElement inputFromDate;

	@FindBy(xpath = "//input[@id='applyleave_txtToDate']")
	WebElement inputToDate;

	@FindBy(xpath = "//input[@id='applyBtn']")
	WebElement leaveApplyButton;

	@FindBy(xpath = "//a[@id='menu_leave_viewMyLeaveList']")
	WebElement myLeave;

	@FindBy(xpath = "//input[@id='calFromDate']")
	WebElement inputMyLeaveFromDate;

	@FindBy(xpath = "//input[@id='calToDate']")
	WebElement inputMyLeaveToDate;

	@FindBy(xpath = "//input[@id='btnSearch']")
	WebElement myLeaveSearchButton;

	@FindBy(xpath = "//*[@id=\"resultTable\"]/tbody/tr/td[6]/a")
	WebElement myLeaveStatus;

	public void ApplyLeave() throws Throwable {
		applyLeave.click();
		Select drpNationality = new Select(driver.findElement(By.id("applyleave_txtLeaveType")));
		drpNationality.selectByVisibleText("DayOff");
		Thread.sleep(5000);
		inputFromDate.clear();
		inputFromDate.sendKeys("2022-07-04");
		Thread.sleep(5000);
		inputToDate.clear();
		inputToDate.sendKeys("2022-07-08");
		Thread.sleep(5000);
		Actions action = new Actions(driver);
		action.sendKeys(Keys.ESCAPE).perform();
		leaveApplyButton.click();
	}

	public void myLeaveStaus() throws Throwable {
		myLeave.click();
		inputMyLeaveFromDate.clear();
		inputMyLeaveFromDate.sendKeys("2022-07-04");
		Thread.sleep(5000);
		inputMyLeaveToDate.clear();
		inputMyLeaveToDate.sendKeys("2022-07-08");
		Thread.sleep(5000);
		Actions action = new Actions(driver);
		action.sendKeys(Keys.ESCAPE).perform();
		myLeaveSearchButton.click();
		String leaveStatus = myLeaveStatus.getText();
		System.out.println(leaveStatus);

	}

}
