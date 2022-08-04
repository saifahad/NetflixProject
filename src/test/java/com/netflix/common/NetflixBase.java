package com.netflix.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NetflixBase {
	public WebDriver Driver;
	
	
	public void launchBrowser () {
		
		WebDriverManager.chromiumdriver().setup();
		
		Driver = new ChromeDriver();
		
		Driver.get("http://netflix.com");
		
		Driver.manage().window().maximize();
		
		
		
	}
	public void closeBrowser () {
		
	Driver.close ();
	
		
	}
}
