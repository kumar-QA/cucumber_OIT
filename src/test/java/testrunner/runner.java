package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
		  features = "./src/test/resource/Features",
		  glue = {"stepdefination","myhooks"},
		  tags = "@Regression",
		 plugin = {"pretty", "html:target/cucumber-reports.html"}
		)

public class runner {

}
