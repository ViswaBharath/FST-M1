package testRunners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/features",
        glue = {"stepDefinitions"},
        tags ="@activity4",
//        tags ="@activity5",
//        plugin = {"pretty"},
        plugin = {"html: test-reports"},
        monochrome = true
)
public class Activity4Runner {
}
