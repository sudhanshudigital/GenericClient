package com.qa.infotech;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Client  { 

	public WebDriver webDriver = null;
	public SikuliDriver sikuliDriver = null; 
	
	public Client(String ip) throws Exception 
	{
		String url = "http://" + ip + ":4444/wd/hub/";
		
		sikuliDriver = new SikuliDriver(ip);
		webDriver = new RemoteWebDriver(new URL(url), DesiredCapabilities.firefox());		
	}
}