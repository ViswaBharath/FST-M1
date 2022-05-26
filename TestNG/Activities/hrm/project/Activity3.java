package hrm.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity3 {
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
    public void login(){
        Reporter.log("Attempt login to page");
        WebElement username = driver.findElement(By.cssSelector("input#txtUsername"));
        WebElement password = driver.findElement(By.cssSelector("input#txtPassword"));
        WebElement loginButton = driver.findElement(By.cssSelector("#btnLogin"));

        username.sendKeys(user);
        password.sendKeys(pwd);
        loginButton.click();
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }

}
