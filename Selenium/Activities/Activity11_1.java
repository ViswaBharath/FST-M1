import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity11_1 {

    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.training-support.net/selenium/javascript-alerts");
        System.out.println("Page title is :  "+ driver.getTitle());

        driver.findElement(By.id("simple")).click();
        Alert simpleAlert = driver.switchTo().alert();
        System.out.println("Simple alert text is : "+simpleAlert.getText());
        simpleAlert.accept();



        driver.quit();

    }
}
