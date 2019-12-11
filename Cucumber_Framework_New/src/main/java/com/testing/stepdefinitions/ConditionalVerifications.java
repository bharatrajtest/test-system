package com.testing.stepdefinitions;

import cucumber.api.java.en.When;
import static com.testing.common.functions.GeneralFunctions.*;
import com.testing.common.functions.GeneralFunctions;
/**
*
* @author Bharatraj 
* Main class for conditional("WHEN") statements for use within the framework
*/
public class ConditionalVerifications {
	GeneralFunctions gf = new GeneralFunctions();
	
	//EDITBOX METHODS
    /**
     * definition enters value into a specified edit field
     *
     * @param value - The value to be entered
     * @param object - The string recognition for the object we search for.
     * @throws Throwable
     */
	 @When("^\"([^\"]*)\" is entered into the \"([^\"]*)\" editbox$")
	    public void is_entered_into_the_editbox(String value, String object) throws Throwable {		
		gf.type(gf.getObject(driver,gf.getElementContent(object)), value);
	    }
	  /**
	     * Selects and click a given element
	     *
	     * @param Object - The string recognition for the link we search for.
	     * 
	     */
	 @When("^I click on \"([^\"]*)\"$")
	    public void I_click(String Object){
		 gf.click(gf.getObject(driver,gf.getElementContent(Object)));
	 }
}
