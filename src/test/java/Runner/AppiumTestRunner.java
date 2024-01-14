package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "json:target/cucumber-reports","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        features = {"src/test/java/Features"},
        glue = {"StepClass","Hooks"},
        monochrome = true,
        tags = "@AddProductToCart",
        dryRun = false
)
public class AppiumTestRunner {
}
