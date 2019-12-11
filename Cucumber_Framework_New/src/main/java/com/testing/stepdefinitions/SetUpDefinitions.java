package com.testing.stepdefinitions;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;

import com.testing.common.functions.GeneralFunctions;

import static com.testing.common.functions.GeneralFunctions.*;

import cucumber.api.PendingException;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;

public class SetUpDefinitions {
	private Scenario myScenario;
	GeneralFunctions gf = new GeneralFunctions();
	@Before()
    public void embedScreenshotStep(Scenario scenario) {

	myScenario = scenario;

    }
	@Given("^Runmode is \"([^\"]*)\"$")
	public void Runmode_is(String runmode){
		if(runmode.equals("N")){
			throw new PendingException("Skippping test as runmode is NO");
		}
	}
	@Given("^I go to \"([^\"]*)\" on \"([^\"]*)\"$")
	public void I_Go_To_Salesforce(String url,String browser){
		System.out.println("I am going to "+ url +" on  "+ browser);
		 gf.openBrowser(browser);
		 gf.navigate(url);
	}
	
	 @After
	    public void afterScenario() {
		myScenario.write("Finishing scenario: " + myScenario.getName());
		if (myScenario.isFailed()) {
		    try {
			byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			myScenario.embed(screenshot, "image/png");
		    } catch (WebDriverException somePlatformsDontSupportScreenshots) {
			System.out.println(somePlatformsDontSupportScreenshots.getMessage());;
		    }
		}
		    //driver.quit();
		
	    }
	 
	 

	
}
