import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Activity9_2 {

    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();

        driver.get(" https://training-support.net/selenium/selects");
        System.out.println("Page title is :  "+ driver.getTitle());

        WebElement valueSelected = driver.findElement(By.cssSelector("#multi-value"));

        Select multiSelect = new Select(driver.findElement(By.cssSelector("#multi-select")));

        if(multiSelect.isMultiple()){

            multiSelect.selectByVisibleText("Javascript");
            System.out.println(valueSelected.getText());

            multiSelect.selectByValue("node");
            System.out.println(valueSelected.getText());

            for(int i=4;i<7;i++){
                multiSelect.selectByIndex(i);
            }
            System.out.println(valueSelected.getText());

            multiSelect.deselectByValue("node");
            System.out.println(valueSelected.getText());

            multiSelect.deselectByIndex(7);
            System.out.println(valueSelected.getText());

            List<WebElement> selectedOptions = multiSelect.getAllSelectedOptions();
            //Print all selected options
            for(WebElement selectedOption : selectedOptions) {
                System.out.println("Selected option: " + selectedOption.getText());
            }

            //Deselect all options
            multiSelect.deselectAll();
            System.out.println(valueSelected.getText());
        }

        driver.quit();

    }
}
