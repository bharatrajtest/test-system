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
/**
*
* @author Bharatraj 
* Main class for "GIVEN" statements for use within the framework
*/
public class SetUpDefinitions {
	private Scenario myScenario;
	GeneralFunctions gf = new GeneralFunctions();
	
	//screenshot for cucumber report
	@Before()
    public void embedScreenshotStep(Scenario scenario) {

	myScenario = scenario;

    }
	
    /**
     * Based on runmode yes or no execution is performed for data driven or examples section
     *
     * @param runmode - yes or no 
     * 
     */
	@Given("^Runmode is \"([^\"]*)\"$")
	public void Runmode_is(String runmode){
		if(runmode.equals("N")){
			throw new PendingException("Skippping test as runmode is NO");
		}
	}
	/**
     * Navigates to Application under test URL 
     *
     * @param url - Application under test URL 
     * @param browser - browser as chrome or firefox
     * 
     */
	@Given("^I go to \"([^\"]*)\" on \"([^\"]*)\"$")
	public void I_Go_To_url(String url,String browser){
		System.out.println("I am going to "+ url +" on  "+ browser);
		 gf.openBrowser(browser);
		 gf.navigate(url);
	}
	//screenshot for cucumber report
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
