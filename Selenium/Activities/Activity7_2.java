import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity7_2 {

    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();

        driver.get("https://training-support.net/selenium/dynamic-attributes");
        System.out.println("Page title is :  "+ driver.getTitle());

        driver.findElement(By.cssSelector("input[class$='-username']")).sendKeys("admin1");
        driver.findElement(By.cssSelector("input[class$='-password']")).sendKeys("password");
        driver.findElement(By.xpath("//label[text() = 'Confirm Password']/following-sibling::input")).sendKeys("password");
        driver.findElement(By.xpath("///label[text() = 'Email']/following-sibling::input")).sendKeys("password@gmail.com");
        driver.findElement(By.xpath("//button[contains(text(), 'Sign Up')]")).click();
        System.out.println(driver.findElement(By.id("action-confirmation")).getText());

        driver.quit();

    }
}
