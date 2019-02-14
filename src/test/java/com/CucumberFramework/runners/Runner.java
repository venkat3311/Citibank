package com.CucumberFramework.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = "html:target/cucumber",
        features = "src/test/resources/features",
        glue = "step_definitions",
        tags = "@wip",
        dryRun = false

)
public class Runner {

}