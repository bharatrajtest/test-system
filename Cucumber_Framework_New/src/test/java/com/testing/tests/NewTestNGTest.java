package com.testing.tests;


import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.BeforeClass;

/**
 * Run file for test-ng telling the tool where the feature files are
 */
@CucumberOptions(features = "src/test/java/com/testing/featurefiles/", 
glue = {"com.testing.stepdefinitions"},
plugin = {"pretty", "json:target/cucumber_results/cucumber.json", "html:target/cucumber_results/cucumber_html"})
public class NewTestNGTest extends AbstractTestNGCucumberTests {
   
    @BeforeClass
    public void beforeTests() {
        
    }

    public NewTestNGTest() {
    }
    
    
}
