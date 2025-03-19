package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features", publish = true, glue = { "stepdefinition",
		"hooks" }, plugin = { "pretty", "html:target/CucumberReports/CucumberReports.html" })
public class TestRunner {

}
