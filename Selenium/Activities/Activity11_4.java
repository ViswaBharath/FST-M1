import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Set;

public class Activity11_4 {

    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        driver.get("https://www.training-support.net/selenium/tab-opener");
        System.out.println("Page title is :  "+ driver.getTitle());

        String parentWindow = driver.getWindowHandle();
        System.out.println("Parent window : "+parentWindow);

        driver.findElement(By.id("launcher")).click();
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));

        Set<String> allWindows = driver.getWindowHandles();
        System.out.println("All windows : "+allWindows);
        for(String handle: allWindows){
            driver.switchTo().window(handle);
        }
        System.out.println("Current Window : "+driver.getWindowHandle());
        wait.until(ExpectedConditions.titleIs("Newtab"));
        System.out.println("New title : "+driver.getTitle());

//        String newTabText = driver.findElement(By.cssSelector(".ui.icon div.content")).getText();
//        System.out.println("New tab heading is: " + newTabText);

        driver.findElement(By.id("actionButton")).click();
        wait.until(ExpectedConditions.numberOfWindowsToBe(3));

        Set<String> allWindowHandles = driver.getWindowHandles();
        System.out.println("All windows : "+allWindowHandles);
        for(String handle: allWindowHandles){
            driver.switchTo().window(handle);
        }
        System.out.println("New Current Window : "+driver.getWindowHandle());
        wait.until(ExpectedConditions.titleIs("Newtab2"));
        System.out.println("New tab title : "+driver.getTitle());
//        newTabText = driver.findElement(By.cssSelector(".ui.icon div.content")).getText();
//        System.out.println("New tab heading is: " + newTabText);

        driver.quit();

    }
}
