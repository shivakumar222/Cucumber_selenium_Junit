package com.TestRunner;
import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="D:\\eclipse workspace\\shiva\\Cucumber_selenium_Junit\\Features.feature\\TestV3app.feature",
glue= {"com.stepdefinitions"},
monochrome=true,
plugin= {"pretty","html:target/HtmlReports"}
)

public class Runner {

}
