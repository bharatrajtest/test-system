package com.testing.stepdefinitions;



import org.testng.Assert;
import static com.testing.common.functions.GeneralFunctions.*;

import com.testing.common.apifunctions.ApiFunctions;
import com.testing.common.functions.GeneralFunctions;

import cucumber.api.java.en.Then;

public class VerificationDefinitions {
	GeneralFunctions gf = new GeneralFunctions();
	ApiFunctions af = new ApiFunctions();
	
	 /**
     * Validates a given element is present
     *
     * @param element - The string recognition for the object we search for.
     * @throws InterruptedException
     */
	
	@Then("^the \"([^\"]*)\" element should be present$")
    public void element_should_be_present(String element) throws InterruptedException{		
		if(gf.waitForObject(driver,gf.getElementContent(element),10)){
		System.out.println("Object found "+element);
		}else{
			Assert.fail("Object not found "+element);
		}
	}
	
	 /**
     * Validates api response
     *
     * @param parameter - api query parameter
     * @param method - POST GET or PATCH
     * @throws Throwable
     */
	@Then("^validate the response for \"([^\"]*)\" city through OpenWeather \"([^\"]*)\" API$")
	public void validate_the_response_for_city_through_OpenWeather_API(String parameter, String method) throws Throwable {
		if(method.equalsIgnoreCase("get")){
		if(af.getResponsecode(parameter)==200){
			System.out.println("200 OK response recieved for search parameter "+parameter);
			}else{
				Assert.fail("200 OK response recieved for search parameter "+parameter);
			}
		}
	}
	

}
