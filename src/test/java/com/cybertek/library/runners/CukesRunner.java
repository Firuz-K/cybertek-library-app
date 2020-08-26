package com.cybertek.library.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty","html:target/cucumber-report.html",
        "json:target/cucumber.json",
        "rerun:target/rerun.txt"}
        ,glue = "com/cybertek/library/step_definitions",
        features = "src/test/resources/features",
        dryRun = false,
        tags = "@run"
)


public class CukesRunner {
}
