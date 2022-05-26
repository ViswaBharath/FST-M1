import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_2 {

    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/selenium/simple-form");
        System.out.println("Page title is :  "+ driver.getTitle());

        driver.findElement(By.xpath("//*[@id=\"firstName\"]")).sendKeys("Akshay");
        driver.findElement(By.xpath("//*[@id=\"lastName\"]")).sendKeys("Sharma");
        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("akshaysharma9@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"number\"]")).sendKeys("9066561111");
        driver.findElement(By.cssSelector("input.green")).click();

        driver.quit();

    }
}
