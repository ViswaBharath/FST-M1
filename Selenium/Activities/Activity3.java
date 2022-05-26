import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity3 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();

        driver.get("https://training-support.net/selenium/simple-form");
        System.out.println("Page title is :  "+ driver.getTitle());

        driver.findElement(By.id("firstName")).sendKeys("Akshay");
        driver.findElement(By.id("lastName")).sendKeys("Sharma");
        driver.findElement(By.id("email")).sendKeys("akshaysharma9@gmail.com");
        driver.findElement(By.id("number")).sendKeys("9066561111");
        driver.findElement(By.cssSelector("input.green")).click();

        driver.quit();







    }
}
