import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class Activity8_2 {

    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();

        driver.get("https://training-support.net/selenium/tables");
        System.out.println("Page title is :  "+ driver.getTitle());

        List<WebElement> columns = driver.findElements(By.xpath("//table[@id='sortableTable']/thead/tr/th"));
        List<WebElement> rows = driver.findElements(By.xpath("//table[@id='sortableTable']/tbody/tr"));

        System.out.println("Total columns are: "+columns.size());
        System.out.println("Total rows are: "+rows.size());

        WebElement cellValueBeforeSort = driver.findElement(By.xpath("//table[@id='sortableTable']/tbody/tr[2]/td[2]"));
        System.out.println("Second row, second column value is : " + cellValueBeforeSort.getText());
        driver.findElement(By.xpath("//table[@id='sortableTable']/thead/tr/th[2]")).click();

        WebElement cellValueAfterSort = driver.findElement(By.xpath("//table[@id='sortableTable']/tbody/tr[2]/td[2]"));
        System.out.println("Second row, second column value is : " + cellValueAfterSort.getText());

        WebElement footer = driver.findElement(By.xpath("//table[@id='sortableTable']/tfoot/tr"));
        System.out.println("Table footer values: " + footer.getText());

        driver.quit();

    }
}
