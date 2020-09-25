package com.hrm.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class) // automation tool running with is cucumber mentioning it as a class
@CucumberOptions(features = "src/test/resources/features/", // location of the features
		glue = "com/hrm/stepDefinitions", // path of our stepDefinitions
		dryRun = false, 
		monochrome = true, 
		tags = "@context", 
		strict = false, 
		plugin = { "pretty",
				"html:target/cucumber-default-reports", "rerun:target/FailedTests.txt", "json:target/cucumber.json" })
public class TestRunner {

}
