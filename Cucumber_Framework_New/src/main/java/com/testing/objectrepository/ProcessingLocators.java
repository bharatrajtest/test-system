package com.testing.objectrepository;
/**
 * interface for Home Page
 *
 */
public interface ProcessingLocators {
	
	public String AUT_url = "https://openweathermap.org/";
	public String Navbar_Header = "//a[@class='navbar-brand']//img[@class='img-responsive']";		
	public String City_Search_Textbox = "(//input[@name='q'])[2]";
	public String Error_Message = "//div[contains(text(),'Not found')]";
	public String Search_Button = "//button[contains(text(),' Search')]";
	public String City_Name = "//a[contains(text(),'London, GB')]";
	
	
	
	
	
	
	
	
	
}

