import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Set;

public class Activity12_1 {

    public static void main(String[] args)  {
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        driver.get("https://www.training-support.net/selenium/iframes");
        System.out.println("Page title is :  "+ driver.getTitle());

        for(int i=0 ;i<2;i++){
            driver.switchTo().frame(i);
            WebElement frameHeading = driver.findElement(By.cssSelector("div.ui.header"));
            System.out.println(frameHeading.getText());
            WebElement button = driver.findElement(By.cssSelector("#actionButton"));
            System.out.println(button.getText());
            System.out.println(button.getCssValue("background-color"));
            wait.until(ExpectedConditions.elementToBeClickable(button));
            button.click();
            System.out.println(button.getText());
            System.out.println(button.getCssValue("background-color"));
            driver.switchTo().defaultContent();

        }
//        driver.quit();

    }
}
