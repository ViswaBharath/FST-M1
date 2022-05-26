import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity2 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.training-support.net");
        System.out.println("Page title is :  "+ driver.getTitle());

        WebElement idLocate = driver.findElement(By.id("about-link"));
        WebElement classLocate = driver.findElement(By.className("green"));
        WebElement linkTextLocate = driver.findElement(By.linkText("About Us"));
        WebElement cssLocate = driver.findElement(By.cssSelector("a.green"));

        System.out.println("Button text is -> "+idLocate.getText());
        System.out.println("Button text is -> "+classLocate.getText());
        System.out.println("Button text is -> "+linkTextLocate.getText());
        System.out.println("Button text is -> "+cssLocate.getText());
        driver.quit();

    }
}
