package com.netflix.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features= "Features",
		glue = "com.netflix.steps"
		)

public class TestRunner extends AbstractTestNGCucumberTests {

}
