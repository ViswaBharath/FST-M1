import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity10_3 {

    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        Actions action = new Actions(driver);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        driver.get("https://www.training-support.net/selenium/drag-drop");
        System.out.println("Page title is :  "+ driver.getTitle());

        WebElement ball = driver.findElement(By.cssSelector("#draggable"));
        WebElement drop1 = driver.findElement(By.cssSelector("#droppable"));
        WebElement drop2 = driver.findElement(By.cssSelector("#dropzone2"));

        wait.until(ExpectedConditions.elementToBeClickable(ball));
        action.dragAndDrop(ball,drop1).build().perform();
        wait.until(ExpectedConditions.attributeToBeNotEmpty(drop1,"background-color"));
        System.out.println("Drop1 done");

        action.dragAndDrop(ball,drop2).build().perform();
        wait.until(ExpectedConditions.attributeToBeNotEmpty(drop2,"background-color"));
        System.out.println("Drop2 done");
        driver.quit();

    }
}
