package com.testing.stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.testing.objectrepository.LandingPage;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class VerifyLayoutSteps {
	WebDriver driver;
	LandingPage objLand;
	/**
     * Based on runmode yes or no execution is performed for data driven or examples section
     *
     * @param runmode - yes or no 
     * 
     */
	@Given("^Runmode is \"([^\"]*)\"$")
	public void Runmode_is(String runmode){
		if(runmode.equals("N")){
			//skips test case
			throw new PendingException("Skippping test as runmode is NO");
			//fails test case
			//throw new RuntimeException("Skippping test as runmode is NO");
		}
	}
	/**
     * Navigates to Application under test URL 
     *
     * @param url - Application under test URL 
     * @param browser - browser as chrome or firefox
	 * @throws SecurityException 
	 * @throws NoSuchFieldException 
	 * @throws IllegalAccessException 
	 * @throws IllegalArgumentException 
     * 
     */
	@When("^I go to \"([^\"]*)\" on \"([^\"]*)\"$")
	public void I_Go_To_url(String url,String browser){
		objLand =new LandingPage(driver);
		objLand.getUrl(url,browser);		
	}
	
	 /**
     * Validates a given element is present
     *
     * @param element - The string recognition for the object we search for.
     * @throws InterruptedException
     */
	
	@Then("^the \"([^\"]*)\" element should be present$")
	public void element_should_be_present(String element) throws InterruptedException {
		if (objLand.isElementPresent(element)) {
			System.out.println("Object found " + element);
		} else {
			Assert.fail("Object not found " + element);
		}

	}
	
}
