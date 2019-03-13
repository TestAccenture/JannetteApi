package com.apipublicuser.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		features="src/test/resources/feature", 
		tags= {"@Feature1","@tag1,@tag2"},
		glue = {"com.apipublicuser.step_definitions"},
		snippets = SnippetType.UNDERSCORE,
		monochrome = true,
		dryRun = false,
		plugin = {"json:reportJson/cucumber.json"}
)
public class Runner {
	
}