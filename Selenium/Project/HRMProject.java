package com.weathershopper.moduletest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.weathershopper.genericlib.BaseClass;
import com.weathershopper.genericlib.FileDataLib;
import com.weathershopper.objectrepositorylib.DashboardPage;
import com.weathershopper.objectrepositorylib.DirectoryPage;
import com.weathershopper.objectrepositorylib.HomePage;
import com.weathershopper.objectrepositorylib.LoginPage;
import com.weathershopper.objectrepositorylib.MyInfoPage;
import com.weathershopper.objectrepositorylib.PimPage;

public class HRMProject extends BaseClass {

	FileDataLib fLib = new FileDataLib();

	@Test(priority = 1)
	public void VerifyTheWebsiteTitle() throws Throwable {

		LoginPage lPage = PageFactory.initElements(driver, LoginPage.class);
		lPage.LoginToOrangeHRM();

		HomePage hPage = PageFactory.initElements(driver, HomePage.class);
		hPage.getTitleAndVerify();
	}

	@Test(priority = 2)
	public void GetTheUrlOfTheHeaderImage() throws Throwable {
		String actualUrl = driver.getCurrentUrl();
		System.out.println(actualUrl);
	}

	@Test(priority = 3)
	public void LoggingIntoTheSite() throws Throwable {
		LoginPage lPage = PageFactory.initElements(driver, LoginPage.class);
		lPage.LoginToOrangeHRM();

		HomePage hPage = PageFactory.initElements(driver, HomePage.class);
		hPage.dashboardIsDisplayed();
	}

	@Test(priority = 4)
	public void AddANewEmployee() throws Throwable {
		LoginPage lPage = PageFactory.initElements(driver, LoginPage.class);
		lPage.LoginToOrangeHRM();

		HomePage hPage = PageFactory.initElements(driver, HomePage.class);
		hPage.dashboardIsDisplayed();
		hPage.ClickOnPIMTab();

		PimPage pimPage = PageFactory.initElements(driver, PimPage.class);
		pimPage.AddNewEmployee();
		pimPage.SearchEmployee();
		pimPage.VerifyEmployeeName();

	}

	@Test(priority = 5)
	public void AddNewEmployee() throws Throwable {
		LoginPage lPage = PageFactory.initElements(driver, LoginPage.class);
		lPage.LoginToOrangeHRM();

		MyInfoPage myInfoPage = PageFactory.initElements(driver, MyInfoPage.class);
		myInfoPage.EdituserInformation();
	}

	@Test(priority = 6)
	public void VerifyThatTheDirectoryMenuItemIsVisibleAndClickable() throws Throwable {
		LoginPage lPage = PageFactory.initElements(driver, LoginPage.class);
		lPage.LoginToOrangeHRM();

		HomePage hPage = PageFactory.initElements(driver, HomePage.class);
		hPage.VerifyDirectoryTab();

		DirectoryPage dPage = PageFactory.initElements(driver, DirectoryPage.class);
		dPage.searchDirectoryHeaderIsDisplayed();
	}

	@Test(priority = 7)
	public void AddingQualifications() throws Throwable {

		LoginPage lPage = PageFactory.initElements(driver, LoginPage.class);
		lPage.LoginToOrangeHRM();

		MyInfoPage myInfoPage = PageFactory.initElements(driver, MyInfoPage.class);
		myInfoPage.ClickOnMyInfoTab();
		myInfoPage.AddWorkExperience();

	}

	@Test(priority = 8)
	public void ApplyingForALeave() throws Throwable {

		LoginPage lPage = PageFactory.initElements(driver, LoginPage.class);
		lPage.LoginToOrangeHRM();

		HomePage hPage = PageFactory.initElements(driver, HomePage.class);
		hPage.ClickOnDashboardTab();

		DashboardPage dashboardPage = PageFactory.initElements(driver, DashboardPage.class);
		dashboardPage.ApplyLeave();
		dashboardPage.myLeaveStaus();

	}

	@Test(priority = 9)
	public void hrmRetriveEmergencyContacts() throws Throwable {
		LoginPage lPage = PageFactory.initElements(driver, LoginPage.class);
		lPage.LoginToOrangeHRM();

		HomePage hPage = PageFactory.initElements(driver, HomePage.class);
		hPage.NavigateToMyInfoAndClickOnEmergencyContacts();
		Thread.sleep(2000);
		hPage.RetriveEmergencyContacts();

	}

}
