package com.weathershopper.genericlib;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	public static WebDriver driver;
	FileDataLib fileLib = new FileDataLib();
	Properties pObj;

	@BeforeClass
	public void configBC() throws Throwable {
		pObj = fileLib.getPropertyObj();
		String browserNAme = pObj.getProperty("browser");
		if (browserNAme.equals("firefox")) {
			driver = new FirefoxDriver();
		} else if (browserNAme.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./resource/chromedriver.exe");
			driver = new ChromeDriver();
		}
		driver.get("http://alchemy.hguy.co:8080/orangehrm/symfony/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@AfterClass
	public void configAC() {
		driver.close();
	}

}
