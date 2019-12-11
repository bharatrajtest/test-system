package com.testing.common.apifunctions;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

/**
*
* @author Bharatraj 
* Main class for API functions for use within the framework
*/
public class ApiFunctions {

	public int getResponsecode(String parameter) {
		try {
			String hostname = "https://api.openweathermap.org";		
	        String route="/data/2.5/weather?q="+parameter;
			String appid="&appid=48ebab2cbbd2efc774aaf18fd6feeb66";
			String url =hostname+route+appid;
			
			HttpClient client = HttpClientBuilder.create().build();
			
			HttpGet request = new HttpGet(url);

			// add request header
			//request.addHeader("content-type", "application/json");
			//request.addHeader("User-Agent", USER_AGENT);
			
			HttpResponse response = client.execute(request);
			System.out.println("Response Code : " + response.getStatusLine().getStatusCode());			
			String responseString = EntityUtils.toString(response.getEntity());
			System.out.println("Response String : " + responseString);	
			
			return response.getStatusLine().getStatusCode();
		} catch (Exception e) {
			return 0;
		}
		
	}

	

}
