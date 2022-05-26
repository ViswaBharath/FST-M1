import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;

public class Activity6_1 {

    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://training-support.net/selenium/dynamic-controls");
        System.out.println("Page title is :  "+ driver.getTitle());

        WebElement checkbox =  driver.findElement(By.cssSelector(".ui.willDisappear>input"));
        WebElement toggle = driver.findElement(By.cssSelector("#toggleCheckbox"));

        toggle.click();
        wait.until(ExpectedConditions.invisibilityOf(checkbox));
        toggle.click();
        wait.until(ExpectedConditions.visibilityOf(checkbox));
        checkbox.click();
        driver.quit();

    }
}
