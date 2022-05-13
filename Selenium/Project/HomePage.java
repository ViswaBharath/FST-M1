package com.weathershopper.objectrepositorylib;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.weathershopper.genericlib.BaseClass;

public class HomePage extends BaseClass {

	String expectedTitle = "OrangeHRM";

	@FindBy(xpath = "//*[@id=\"menu_pim_viewMyDetails\"]")
	WebElement myInfoTab;

	@FindBy(xpath = "//a[normalize-space()='Emergency Contacts']")
	WebElement emergencyContacts;

	@FindBy(xpath = "//a[@id=\"menu_dashboard_index\"]")
	WebElement dashboardLink;

	@FindBy(xpath = "//a[@id=\"menu_pim_viewPimModule\"]")
	WebElement pimLink;

	public void getTitleAndVerify() {
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		Assert.assertEquals(expectedTitle, actualTitle);
	}

	public void NavigateToMyInfoAndClickOnEmergencyContacts() {
		myInfoTab.click();
		emergencyContacts.click();
	}

	public void RetriveEmergencyContacts() {
		// Grab the table
		WebElement table = driver.findElement(By.id("emgcontact_list"));
		// Now get all the TR elements from the table
		List<WebElement> allRows = table.findElements(By.tagName("tr"));
		// And iterate over them, getting the cells
		for (WebElement row : allRows) {
			List<WebElement> cells = row.findElements(By.tagName("td"));
			for (WebElement cell : cells) {
				System.out.println("content >>   " + cell.getText());
			}
		}
	}

	public void dashboardIsDisplayed() {
		System.out.println("Home Page Dashboard is displayed : " + dashboardLink.isDisplayed());
	}

	public void ClickOnPIMTab() {
		pimLink.click();
	}

	public void ClickOnDashboardTab() {
		dashboardLink.click();
	}

	public void VerifyDirectoryTab() {

		WebElement element = driver.findElement(By.xpath("//a[@id='menu_directory_viewDirectory']"));
		if (element.isDisplayed() && element.isEnabled()) {
			element.click();
		}
	}

}
