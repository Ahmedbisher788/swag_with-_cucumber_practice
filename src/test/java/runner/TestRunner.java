package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/Feature",
        glue = {"StepDefinitions"},
        plugin = {
                "pretty",
                "html:target/cucumber-html-report",
                "json:target/cucumber.json",
                "testng:target/testng-cucumber.xml"

        }
)

public class TestRunner extends AbstractTestNGCucumberTests {
}
