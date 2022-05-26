import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5_3 {

    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/dynamic-controls");
        System.out.println("Page title is :  "+ driver.getTitle());

        WebElement textInput = driver.findElement(By.xpath("//input[@id='input-text']"));
        System.out.println("Text field is enabled, True/False: " + textInput.isEnabled());
        driver.findElement(By.id("toggleInput")).click();
        System.out.println("Text field is enabled, True/False: " + textInput.isEnabled());


        driver.quit();

    }
}
