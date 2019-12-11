package com.testing.objectrepository;
/**
 * This interface has all elements of Candidate Hub
 *
 */
public interface ProcessingLocators {
	
	//openweathermap Home Page
	public String Navbar_Header = "//a[@class='navbar-brand']//img[@class='img-responsive']";		
	public String City_Search_Textbox = "(//input[@name='q'])[2]";
	public String Error_Message = "//div[contains(text(),'Not found')]";
	public String Search_Button = "//button[contains(text(),' Search')]";
	public String City_Name = "//a[contains(text(),'London, GB')]";
	
	
	
	
	
	
	
	
	
}

