package hrm.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity5 {
    private WebDriver driver;
    public String url = "http://alchemy.hguy.co:8080/orangehrm/symfony/web/index.php/auth/login";
    public String user = "orange";
    public String pwd = "orangepassword123";

    @BeforeClass
    public void setUp(){
        driver = new FirefoxDriver();
        driver.get(url);
    }

    @Test
    public void editEmployeeDetails() throws InterruptedException {
        //login to site
        WebElement username = driver.findElement(By.cssSelector("input#txtUsername"));
        WebElement password = driver.findElement(By.cssSelector("input#txtPassword"));
        WebElement loginButton = driver.findElement(By.cssSelector("#btnLogin"));
        username.sendKeys(user);
        password.sendKeys(pwd);
        loginButton.click();
        //click on PIM
        Reporter.log("Click on view details");
        WebElement viewDetails = driver.findElement(By.cssSelector("a#menu_pim_viewMyDetails"));
        viewDetails.click();
        // click on edit button
        Thread.sleep(2000);
        WebElement editButton = driver.findElement(By.xpath("//*[@id=\"btnSave\"]"));
        editButton.click();
        //Enter emp details to be edited
        WebElement firstName = driver.findElement(By.cssSelector("#personal_txtEmpFirstName"));
        WebElement lastName = driver.findElement(By.cssSelector("#personal_txtEmpLastName"));
        WebElement maleRadioButton = driver.findElement(By.cssSelector("#personal_optGender_1"));
        WebElement nationality = driver.findElement(By.xpath("//*[@id=\"personal_cmbNation\"]/option[contains(text(),'Canadian')]"));
        WebElement saveButton = driver.findElement(By.xpath("//*[@id=\"btnSave\"]"));
        String fName = "Akshay";
        String lName = "Sharma";
        firstName.clear();
        firstName.sendKeys(fName);
        lastName.clear();
        lastName.sendKeys(lName);
        maleRadioButton.click();
        nationality.click();
        saveButton.click();
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }

}
