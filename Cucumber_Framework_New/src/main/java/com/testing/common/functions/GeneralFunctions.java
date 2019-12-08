package com.testing.common.functions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GeneralFunctions {
	public static WebDriver driver;
	
	public void openBrowser(String browsertype){		
		if(browsertype.equals("Mozilla") ){
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\geckodriver\\geckodriver.exe");
			driver=new FirefoxDriver();		
		}else if(browsertype.equals("Chrome")){
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\chrome\\chromedriver.exe");
			driver=new ChromeDriver();			
		}else if(browsertype.equals("IE")){
			//IE set up
			}
		//driver.manage().window().maximize();		
				
	}
	public void navigate(String URL){		
		driver.get(URL);		
		}

}
