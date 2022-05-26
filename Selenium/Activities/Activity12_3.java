import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity12_3 {

    public static void main(String[] args)  {
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        Actions actions = new Actions(driver);

        driver.get("https://www.training-support.net/selenium/popups");
        System.out.println("Page title is :  "+ driver.getTitle());

        WebElement signInButton = driver.findElement(By.cssSelector("button.orange"));

        actions.moveToElement(signInButton).pause(Duration.ofSeconds(2)).build().perform();
        String tooltipText = signInButton.getAttribute("data-tooltip");
        System.out.println("Tooltip message : "+tooltipText);
        signInButton.click();

        driver.findElement(By.id("username")).sendKeys("admin");
        driver.findElement(By.id("password")).sendKeys("password");
        driver.findElement(By.cssSelector("#dynamic-attributes-form button")).click();

        WebElement message = driver.findElement(By.cssSelector("#action-confirmation"));
        wait.until(ExpectedConditions.visibilityOf(message));
        System.out.println("Message : "+message.getText());

        driver.quit();
    }
}
