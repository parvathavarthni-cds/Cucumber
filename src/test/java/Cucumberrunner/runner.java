package Cucumberrunner;


import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
features ="Features",
glue = {"/Com.Gradle_automation/src/test/java/stepdefinitions"}
//glue = { "stepdefs" }

)

public class runner {

}