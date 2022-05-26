package hrm.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Activity8 {
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
    public void applyLeaveTest() throws InterruptedException {
        //login to site
        WebElement username = driver.findElement(By.cssSelector("input#txtUsername"));
        WebElement password = driver.findElement(By.cssSelector("input#txtPassword"));
        WebElement loginButton = driver.findElement(By.cssSelector("#btnLogin"));
        username.sendKeys(user);
        password.sendKeys(pwd);
        loginButton.click();
        Thread.sleep(3000);

        //click on apply leave
        driver.findElement(By.linkText("Apply Leave")).click();
        Select dropDown = new Select(driver.findElement(By.cssSelector("#applyleave_txtLeaveType")));
        dropDown.selectByValue("1");

        WebElement fromDate = driver.findElement(By.xpath("//*[@id=\"frmLeaveApply\"]//li[3]/img"));
        fromDate.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='ui-datepicker-calendar']")));
        WebElement date = driver.findElement(By.xpath("//*[@class='ui-datepicker-calendar']//tr[4]/td[1]"));
        date.click();
        driver.findElement(By.xpath("//*[@id=\"applyBtn\"]")).click();

        driver.findElement(By.cssSelector("#menu_leave_viewMyLeaveList")).click();
        //search for pending leaves
        driver.findElement(By.cssSelector("input[id *= '_allcheck']")).click();
        driver.findElement(By.cssSelector("input[id *= 'chkSearchFilter_1']")).click();
        driver.findElement(By.cssSelector("#btnSearch")).click();
        //verify leave goes in pending state
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("tr.odd:nth-child(1) > td:nth-child(6) > a")));
        WebElement status = driver.findElement(By.cssSelector("tr.odd:nth-child(1) > td:nth-child(6) > a"));
        Reporter.log("Leave status is " + status.getText());
        System.out.println("Leave status is "+ status.getText());

    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }

}
