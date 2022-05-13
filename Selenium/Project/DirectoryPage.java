package com.weathershopper.objectrepositorylib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.weathershopper.genericlib.BaseClass;

public class DirectoryPage extends BaseClass {

	@FindBy(xpath = "//a[@class='toggle tiptip']")
	WebElement searchDirectoryHeader;

	public void searchDirectoryHeaderIsDisplayed() {

		System.out.println(searchDirectoryHeader.isDisplayed());

	}

}
