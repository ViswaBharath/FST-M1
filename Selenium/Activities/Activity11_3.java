import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity11_3 {

    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.training-support.net/selenium/javascript-alerts");
        System.out.println("Page title is :  "+ driver.getTitle());

        driver.findElement(By.id("prompt")).click();
        Alert promptAlert = driver.switchTo().alert();
        System.out.println("Simple alert text is : "+promptAlert.getText());
        promptAlert.sendKeys("Yes you are");

        promptAlert.accept();



        driver.quit();

    }
}
