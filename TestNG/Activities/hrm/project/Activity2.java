package hrm.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity2 {
    private WebDriver driver;
    public String url = "http://alchemy.hguy.co:8080/orangehrm/symfony/web/index.php/auth/login";

    @BeforeClass
    public void setUp(){
        driver = new FirefoxDriver();
        driver.get(url);
    }

    @Test
    public void getHeaderURL(){
        //Get Image url
        WebElement header = driver.findElement(By.cssSelector("#divLogo img"));
        Reporter.log("Verify header image url");
        String headerURL = header.getAttribute("src");
        System.out.println("Image URL is:  "+headerURL);
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }

}
