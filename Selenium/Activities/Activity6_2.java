import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity6_2 {

    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://www.training-support.net/selenium/ajax");
        System.out.println("Page title is :  "+ driver.getTitle());

        WebElement contentButton =  driver.findElement(By.cssSelector(".violet.button"));
        contentButton.click();

        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("ajax-content"),"HELLO!"));
        System.out.println("Text message is -> "+ driver.findElement(By.cssSelector("#ajax-content>h1")).getText());

        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("ajax-content"), "I'm late!"));
        System.out.println("Text message is -> "+ driver.findElement(By.cssSelector("#ajax-content>h3")).getText());

        driver.quit();

    }
}
