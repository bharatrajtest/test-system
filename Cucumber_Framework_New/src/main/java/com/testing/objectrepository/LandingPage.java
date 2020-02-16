package com.testing.objectrepository;

import org.openqa.selenium.WebDriver;

import com.testing.common.functions.GeneralFunctions;

public class LandingPage {
	WebDriver driver;
	GeneralFunctions gf = new GeneralFunctions();
	public static String AUT_url = "https://openweathermap.org/";
	public static String Navbar_Header = "//a[@class='navbar-brand']//img[@class='img-responsive']";		
	public static String City_Search_Textbox = "(//input[@name='q'])[2]";
	public static String Error_Message = "//div[contains(text(),'Not found')]";
	public static String Search_Button = "//button[contains(text(),' Search')]";
	public static String City_Name = "//a[contains(text(),'London, GB')]";
	
	public LandingPage(WebDriver driver){
        this.driver = driver;

    }
	public String getElementContent(String content) {
		try {
			return LandingPage.class.getField(content).get((LandingPage.class)).toString();
		} catch (Exception ex) {
			return content;
		}
	}
	public void getUrl(String url, String browser) {
		 gf.openBrowser(browser);		 
		 gf.navigate(getElementContent(url));
		
	}

	public boolean isElementPresent(String element) {
		try {
			return gf.waitForObject(driver,getElementContent(element),10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
		
	}
	
	
}
