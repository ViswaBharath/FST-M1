import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity11_2 {

    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.training-support.net/selenium/javascript-alerts");
        System.out.println("Page title is :  "+ driver.getTitle());

        driver.findElement(By.id("confirm")).click();
        Alert confirmAlert = driver.switchTo().alert();
        System.out.println("Simple alert text is : "+confirmAlert.getText());
//        confirmAlert.accept();
        confirmAlert.dismiss();



        driver.quit();

    }
}
