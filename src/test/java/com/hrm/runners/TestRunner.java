package com.hrm.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class) // automation tool running with is cucumber mentioning it as a class
@CucumberOptions(features = "src/test/resources/features/", 
		glue = "com/hrm/stepDefinitions", 
		dryRun = false, 
		monochrome = true, 
		tags = "@ContactDetails", 
		strict = false, // if there are any undefined methods, the test will fail automatically
		plugin = { "pretty",
				"html:target/cucumber-default-reports", "rerun:target/FailedTests.txt", "json:target/cucumber.json" })
public class TestRunner {

}
