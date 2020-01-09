package com.scodeen.util;

import java.util.ArrayList;
import java.util.List;

import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

public class SMSUtil {
	private static final String API_KEY = "F8z1kMcVYDriJEUZ25QK4vaPtXuojOWGyhsLexNqbCARIdH9S7LK1phWJ0urNdwVnM26z8Dq9Hbm54Ie";
	public static void sendSMS(String message,String numberList){
		
		try {

        HttpPost post = new HttpPost("https://www.fast2sms.com/dev/bulk");

        // add request parameter, form parameters
        List<NameValuePair> urlParameters = new ArrayList<>();
        urlParameters.add(new BasicNameValuePair("sender_id", "FSTSMS"));
        urlParameters.add(new BasicNameValuePair("message", message));
        urlParameters.add(new BasicNameValuePair("language", "english"));
        urlParameters.add(new BasicNameValuePair("route", "p"));
        urlParameters.add(new BasicNameValuePair("numbers", numberList));
        

        post.setEntity(new UrlEncodedFormEntity(urlParameters));
        post.setHeader("authorization", API_KEY);
        post.setHeader("Content-Type", "application/x-www-form-urlencoded");

        try (CloseableHttpClient httpClient = HttpClients.createDefault();
        	
             CloseableHttpResponse response = httpClient.execute(post)) {

            System.out.println(EntityUtils.toString(response.getEntity()));
        }
        
		}catch (Exception e) {
			// TODO: handle exception
		}
	}

public static void main(String[] args) {
	sendSMS("This is test sms", "9182229397");
}
}
