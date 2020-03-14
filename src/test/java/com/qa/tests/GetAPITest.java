package com.qa.tests;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;
import org.json.JSONException;
import com.qa.base.TestBase;
import com.qa.client.RestClient;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GetAPITest extends TestBase{
	TestBase testBase;
	String serviceurl;
	String apiurl;
	String url;
	RestClient restClient;
	
	
	
	//@BeforeMethod
	public void setUp() throws ClientProtocolException, IOException,JSONException{
		testBase = new TestBase();
		serviceurl = prop.getProperty("URL");
		apiurl = prop.getProperty("serviceURL");
	     url = serviceurl + apiurl;
		
		
		
}

	
	@Test
	public void getAPITest() throws ClientProtocolException, IOException, JSONException {
		
		restClient = new RestClient();
		restClient.get(url);
		
		
		
	}

	@Test
	public void testing(){
		System.out.println("Working");
	}
	
	
	

}
