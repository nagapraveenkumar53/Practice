package com.orangehrm.module.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserSetup extends XLUtils {
	
	public static WebDriver driver;
	
	public void LaunchBrowser(String Browser)
	{
		switch (Browser)
		{
		case "chrome" :
			System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver_win32\\chromedriver.exe");
			driver= new ChromeDriver();
			break;
		case "firefox" :
			System.setProperty("webdriver.gecko.driver", "D:\\Software\\geckodriver-v0.23.0-win32\\geckodriver.exe");
			driver=new FirefoxDriver();
			break;
		}
	}
	public void maxmizeBrowser()
	{
		driver.manage().window().maximize();
	}
	public void getURL(String url)
	{
		driver.get(url);
	}
	
	
	
	public void closeBrowser()
	{ 
		//driver.close();
		driver.quit();
	}
	
		
	
}
