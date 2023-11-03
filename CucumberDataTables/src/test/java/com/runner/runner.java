package com.runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features/dataTable.feature", glue = "com.CucumberDataTables",plugin= {"pretty","html:target/cucumber-reports/cucumber.html","pretty","json:target/cucumber-reports/cucumber.json"})
public class runner {

}
