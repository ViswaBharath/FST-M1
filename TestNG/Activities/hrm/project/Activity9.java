package hrm.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class Activity9 {
    private WebDriver driver;
    private WebDriverWait wait;
    public String url = "http://alchemy.hguy.co:8080/orangehrm/symfony/web/index.php/auth/login";
    public String user = "orange";
    public String pwd = "orangepassword123";

    @BeforeClass
    public void setUp(){
        driver = new FirefoxDriver();
        wait =new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get(url);
    }

    @Test
    public void emergencyContactTest() throws InterruptedException {
        //login to site
        WebElement username = driver.findElement(By.cssSelector("input#txtUsername"));
        WebElement password = driver.findElement(By.cssSelector("input#txtPassword"));
        WebElement loginButton = driver.findElement(By.cssSelector("#btnLogin"));
        username.sendKeys(user);
        password.sendKeys(pwd);
        loginButton.click();
        Thread.sleep(3000);

        //search for myinfo
        Reporter.log("Click on view details");
        WebElement myinfo = driver.findElement(By.cssSelector("a#menu_pim_viewMyDetails"));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("a#menu_pim_viewMyDetails")));
        myinfo.click();

        driver.findElement(By.cssSelector("a[href*=\"Emergency\"]")).click();
        WebElement table = driver.findElement(By.xpath("//*[@id= \"emgcontact_list\"]"));

        System.out.println("Table values are : ");
        System.out.println(table.getText());
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }

}
