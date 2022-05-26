package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.security.Key;
import java.time.Duration;

public class Activity1 {
    private WebDriver driver;
    private WebDriverWait wait;

    @Given("^User is on Google home page$")
    public void userOnHomePage(){
        driver = new FirefoxDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://www.google.com");
    }

    @When("^User types in Cheese and hits Enter$")
    public void userTypesCheese(){
        driver.findElement(By.name("q")).sendKeys("Cheese", Keys.ENTER);
    }

    @Then("^Show how many search results were shown$")
    public void showResults(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("result-stats")));
        String results = driver.findElement(By.id("result-stats")).getText();
        System.out.println("Total results are -> "+results);
    }

//    @And("^Close the browser$")
//    public void closeBrowser(){
//        driver.quit();
//    }
}
