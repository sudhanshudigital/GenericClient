package com.qa.infotech;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class SikuliDriver 
{
	URL url = null;
	java.net.HttpURLConnection connection = null;
	
	SikuliDriver(String ip) throws Exception
	{
		url = new URL("http://" + ip + ":4567/sikuliServer");
		connection = (java.net.HttpURLConnection) url.openConnection();
	}
	
	public void callSikuliServer(String urlParameters) throws Exception
	{
		connection.setRequestMethod("POST");
		connection.setRequestProperty("Accept-Language", "en-US,en;q=0.5");
 
		connection.setDoOutput(true);
		DataOutputStream wr = new DataOutputStream(connection.getOutputStream());
		wr.writeBytes(urlParameters);
		wr.flush();
		wr.close();
 
		int responseCode = connection.getResponseCode();
		System.out.println("\nSending 'POST' request to URL : " + url);
		System.out.println("Post parameters : " + urlParameters);
		System.out.println("Response Code : " + responseCode);
 
		BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
		System.out.println(in.readLine());
 		
	}
	
	public void click(String image) throws Exception
	{
		String urlParameters = "command=click&image1=" + image;
		callSikuliServer(urlParameters);
	}
	
	public void dobuleClick(String image) throws Exception
	{
		String urlParameters = "command=dobuleClick&image1=" + image;
		callSikuliServer(urlParameters);
	}

	public void type(String myText) throws Exception
	{
		String urlParameters = "command=type&image1=" + myText;
		callSikuliServer(urlParameters);
	}

	public void exists(String image) throws Exception
	{
		String urlParameters = "command=exists&image1=" + image;
		callSikuliServer(urlParameters);
	}

	public void find(String image) throws Exception
	{
		String urlParameters = "command=find&image1=" + image;
		callSikuliServer(urlParameters);
	}

	public void findAll(String image) throws Exception
	{
		String urlParameters = "command=findAll&image1=" + image;
		callSikuliServer(urlParameters);
	}

	public void wait(String image, String value) throws Exception
	{
		String urlParameters = "command=wait&image1=" + image+ "time=" + value;
		callSikuliServer(urlParameters);
	}

	public void waitVanish(String image, String value) throws Exception
	{
		String urlParameters = "command=waitVanish&image1=" + image+ "time=" + value;
		callSikuliServer(urlParameters);
	}

	public void dragDrop(String image1, String image2) throws Exception
	{
		String urlParameters = "command=dragDrop&image1=" + image1 + "image2=" + image2;
		callSikuliServer(urlParameters);
	}
	
}