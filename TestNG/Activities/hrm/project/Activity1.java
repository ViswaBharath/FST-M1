package hrm.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.*;

public class Activity1 {
    private WebDriver driver;
    public String url = "http://alchemy.hguy.co:8080/orangehrm/symfony/web/index.php/auth/login";

    @BeforeClass
    public void setUp(){
        driver = new FirefoxDriver();
        driver.get(url);
    }

    @Test
    public void verifyTitle(){
        //Get title
        String fetchedTitle = driver.getTitle();
        Reporter.log("Title is fetched");
        System.out.println("Title is : "+fetchedTitle);
        String actualTitle = "OrangeHRM";
        Assert.assertEquals(actualTitle,fetchedTitle);
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }

}
