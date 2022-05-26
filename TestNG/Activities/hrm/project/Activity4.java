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
import java.util.concurrent.TimeUnit;

public class Activity4 {
    private WebDriver driver;
    private  WebDriverWait wait;
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
    public void addEmployee() throws InterruptedException {
        //login to site
        WebElement username = driver.findElement(By.cssSelector("input#txtUsername"));
        WebElement password = driver.findElement(By.cssSelector("input#txtPassword"));
        WebElement loginButton = driver.findElement(By.cssSelector("#btnLogin"));
        username.sendKeys(user);
        password.sendKeys(pwd);
        loginButton.click();
        //click on PIM
        Reporter.log("Click on view information");
        WebElement pim = driver.findElement(By.cssSelector("a#menu_pim_viewPimModule"));
        pim.click();
        // click on Add button
        Thread.sleep(2000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input#btnAdd")));
        WebElement addButton = driver.findElement(By.cssSelector("input#btnAdd"));
        addButton.click();
        //Enter emp details to be added
        WebElement firstName = driver.findElement(By.cssSelector("#firstName"));
        WebElement lastName = driver.findElement(By.cssSelector("#lastName"));
        WebElement siginButton = driver.findElement(By.cssSelector("#btnSave"));
        String fName = "Akshay";
        String lName = "Sharma";
        firstName.sendKeys(fName);
        lastName.sendKeys(lName);
        siginButton.click();
        //click on PIM
        pim = driver.findElement(By.cssSelector("a#menu_pim_viewPimModule"));
        pim.click();
        //Search for emp added
        WebElement empNameSearch = driver.findElement(By.cssSelector("input#empsearch_employee_name_empName"));
        WebElement searchButton = driver.findElement(By.xpath("//*[@id=\"searchBtn\"]"));
        empNameSearch.sendKeys(fName+" "+ lName);
        searchButton.click();
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }

}
