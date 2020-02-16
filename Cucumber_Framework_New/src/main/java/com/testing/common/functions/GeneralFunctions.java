package com.testing.common.functions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//import com.testing.objectrepository.BaseLocators;

/**
*
* @author Bharatraj 
* Main class for general functions for use within the framework
*/
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
	
	public boolean waitForObject(WebDriver driver, String object, int timeout)
			throws InterruptedException {

		boolean flag = false;
		int timecompare = 0;
		while (flag == false) {
			Thread.sleep(1000);
			timecompare += 1;
			if (timecompare == timeout) {
				return flag;
			}
			WebElement lookfor = getObject(driver, object);
			if (lookfor != null) {
				if (lookfor.isDisplayed()) {
					flag = true;
					return flag;
				}
			}
		}

		return flag;
	}

	public WebElement getObject(WebDriver driver2, String recString) {
		try {
			WebElement o_elem = driver.findElement(By.id(recString));
			System.out.println("Found object " + recString);
			return (o_elem);
		} catch (Exception e) {
			;
		}
		try {
			WebElement o_elem = driver.findElement(By.className(recString));
			System.out.println("Found object " + recString);
			return (o_elem);
		} catch (Exception e) {
			;
		} // Don't do anything if it fails. Continue.

		try {
			WebElement o_elem = driver.findElement(By.linkText(recString));
			System.out.println("Found object " + recString);
			return (o_elem);
		} catch (Exception e) {
			;
		} // Don't do anything if it fails. Continue.
		try {
			WebElement o_elem = driver.findElement(By.name(recString));
			System.out.println("Found object " + recString);
			return (o_elem);
		} catch (Exception e) {
			;
		} // Don't do anything if it fails. Continue.
		try {
			WebElement o_elem = driver.findElement(By
					.partialLinkText(recString));
			System.out.println("Found object " + recString);
			return (o_elem);
		} catch (Exception e) {
			;
		} // Don't do anything if it fails. Continue.
		try {
			WebElement o_elem = driver.findElement(By.tagName(recString));
			System.out.println("Found object " + recString);
			return (o_elem);
		} catch (Exception e) {
			;
		} // Don't do anything if it fails. Continue.
		try {
			WebElement o_elem = driver.findElement(By.xpath(recString));
			System.out.println("Found object " + recString);
			return (o_elem);
		} catch (Exception e) {
			e.getStackTrace();
		} // Don't do anything if it fails. Continue.
		try {
			WebElement o_elem = driver.findElement(By.cssSelector(recString));
			System.out.println("Found object " + recString);
			return (o_elem);
		} catch (Exception e) {
			e.getStackTrace();
		} // Don't do anything if it fails. Continue.

		return (null);

	}

	public void type(WebElement object, String value) {
		object.clear();
		object.sendKeys(value);

	}

	public void click(WebElement object) {
		object.click();

	}

}
