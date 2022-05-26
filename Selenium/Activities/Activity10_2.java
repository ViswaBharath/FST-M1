import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Activity10_2 {

    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        Actions action = new Actions(driver);
        String keyPressText;

        driver.get("https://www.training-support.net/selenium/input-events");
        System.out.println("Page title is :  "+ driver.getTitle());

        WebElement pressedKey = driver.findElement(By.cssSelector("#keyPressed"));
        Action action1 = action.sendKeys("A").build();
        action1.perform();
        keyPressText = pressedKey.getText();
        System.out.println("Pressed key is : "+keyPressText);

        Action action2 = action.keyDown(Keys.CONTROL).sendKeys("a").sendKeys("c")
                        .keyUp(Keys.CONTROL).build();
        action2.perform();
        keyPressText = pressedKey.getText();
        System.out.println("Pressed key is : "+keyPressText);
        driver.quit();

    }
}
