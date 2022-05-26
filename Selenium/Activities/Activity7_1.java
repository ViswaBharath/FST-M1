import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity7_1 {

    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();

        driver.get("https://training-support.net/selenium/dynamic-attributes");
        System.out.println("Page title is :  "+ driver.getTitle());

        driver.findElement(By.cssSelector("input[class^='username-']")).sendKeys("admin");
        driver.findElement(By.cssSelector("input[class^='password-']")).sendKeys("password");
        driver.findElement(By.xpath("//button[contains(text(),'Log in')]")).click();
        System.out.println(driver.findElement(By.cssSelector("#action-confirmation")).getText());

        driver.quit();

    }
}
