import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Activity9_1 {

    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();

        driver.get("https://training-support.net/selenium/selects");
        System.out.println("Page title is :  "+ driver.getTitle());

        WebElement valueSelected = driver.findElement(By.cssSelector("#single-value"));

        Select dropDown = new Select(driver.findElement(By.cssSelector("#single-select")));
        dropDown.selectByVisibleText("Option 2");
        System.out.println("Value selected: "+valueSelected.getText());

        dropDown.selectByIndex(3);
        System.out.println("Value selected: "+valueSelected.getText());

        dropDown.selectByValue("4");
        System.out.println("Value selected: "+valueSelected.getText());

        List<WebElement> options = dropDown.getOptions();
        for(WebElement element: options){
            System.out.println("Option : "+ element.getText());
        }
        driver.quit();

    }
}
