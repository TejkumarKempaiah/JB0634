package com.Session12;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchSeleniumSite 
{
	public static WebDriver driver;
	
	static
	{
		System.setProperty("webdriver.chrome.driver","/Users/tajkumarkempaiah/Downloads/chromedriver");
	}
	
	public static void main(String[] args)
	{
		//open chrome browser
		driver = new ChromeDriver();
//		driver.manage().window().fullscreen();
//		driver.get("https://www.seleniumhq.org/");
//		System.out.println("Page title is: "+driver.getTitle());
//		System.out.println("Current url is: "+driver.getCurrentUrl());
//		driver.close();	
	}
}
