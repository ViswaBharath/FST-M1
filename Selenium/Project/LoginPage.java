package com.weathershopper.objectrepositorylib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.weathershopper.genericlib.BaseClass;

public class LoginPage extends BaseClass {

	@FindBy(xpath = "//input[@id='txtUsername']")
	WebElement inputUserName;

	@FindBy(xpath = "//input[@id='txtPassword']")
	WebElement inputPassword;

	@FindBy(xpath = "//input[@id='btnLogin']")
	WebElement loginButton;

	public void LoginToOrangeHRM() {
		inputUserName.sendKeys("orange");
		inputPassword.sendKeys("orangepassword123");
		loginButton.click();
	}

}
