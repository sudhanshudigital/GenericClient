package com.qa.infotech;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class User {

	public static void main(String [] args) throws Exception 
	{
		
		Client client = new Client("10.0.9.165");
		
		client.sikuliDriver.type("startButton.png");
		
		client.webDriver.get("http://www.google.com");
		WebElement element = client.webDriver.findElement(By.name("q"));
		element.sendKeys("Cheese!");
        element.submit();
        System.out.println("Page title is: " + client.webDriver.getTitle());
        (new WebDriverWait(client.webDriver, 50)).until(new ExpectedCondition<Boolean>() 
	        {
	            public Boolean apply(WebDriver d) 
	            {
	                return d.getTitle().toLowerCase().startsWith("cheese!");
	            }
	        }
        );
        System.out.println("Page title is: " + client.webDriver.getTitle());
        client.webDriver.quit();
	}
}
