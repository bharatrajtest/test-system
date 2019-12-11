package com.testing.stepdefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import static com.testing.common.functions.GeneralFunctions.*;
import com.testing.common.functions.GeneralFunctions;

public class ConditionalVerifications {
	GeneralFunctions gf = new GeneralFunctions();
	 @When("^\"([^\"]*)\" is entered into the \"([^\"]*)\" editbox$")
	    public void is_entered_into_the_editbox(String value, String object) throws Throwable {		
		gf.type(gf.getObject(driver,gf.getElementContent(object)), value);
	    }
	 @When("^I click on \"([^\"]*)\"$")
	    public void I_click(String Object){
		 gf.click(gf.getObject(driver,gf.getElementContent(Object)));
	 }
}
