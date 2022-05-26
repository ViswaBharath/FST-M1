import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Activity10_1 {

    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        Actions action = new Actions(driver);

        driver.get("https://www.training-support.net/selenium/input-events");
        System.out.println("Page title is :  "+ driver.getTitle());

        WebElement cube = driver.findElement(By.cssSelector("#wrapD3Cube"));
        action.click(cube);
        WebElement value = driver.findElement(By.cssSelector(".active"));
        System.out.println("Left click value : "+value.getText());

        action.doubleClick(cube).perform();
        value = driver.findElement(By.cssSelector(".active"));
        System.out.println("Double click value : "+value.getText());

        action.contextClick(cube).perform();
        value = driver.findElement(By.cssSelector(".active"));
        System.out.println("Right click value : "+value.getText());
        driver.quit();

    }
}
