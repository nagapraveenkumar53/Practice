package com.orangehrm.module.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class RegularFunctions extends BrowserSetup {

	public static Select select;
	public Actions act = new Actions(driver);
	//BrowserSetup br=new BrowserSetup();
	public WebElement findElemen(By locator)
	{
		return driver.findElement(locator);
	}
	
	public WebElement findElement(String identifier, String locator)
	{
		WebElement e=null;
		switch(identifier)
		{
		case "name" :
			e=driver.findElement(By.name(locator));
			break;
		case "id":
			e=driver.findElement(By.id(locator));
			break;
		case "xpath":
			e=driver.findElement(By.xpath(locator));
			break;
		case "linktext" :
			e=driver.findElement(By.linkText(locator));
			break;
		default :
			System.out.println("WebElement not found");
		}
		return e;
	}
	
	public boolean verifyTitle(String Title)
	{
		//Assert.assertEquals(driver.getTitle(), Title);
		
		if(driver.getTitle().equals(Title))
		{
		System.out.println(Title+" : Is Verified");
		return true;
		}else{
			System.out.println("Page not loaded properly");
			return false;
		}
	}
	
	public void enterText(By element, String text)
	{
		try{
		findElemen(element).sendKeys(text);
		}
		catch (Exception e) {
			System.out.println("Element is not found ");
		}
	}

	public void click(By element){
		try{
		findElemen(element).click();
		}
		catch(Exception e){
			System.out.println("Element not found / not clickable");
		}
		
	}
	
	public void selectElement(String identifier, String locator) {
		WebElement e = findElement(identifier, locator);
		select = new Select(e);
	}
	
	public void moveToElement(By locator) {
		WebElement e = findElemen(locator);
		act.moveToElement(e).perform();
	}
	
	public boolean verifyElement(By locator, String text)
	{
		if(driver.findElement(locator).getText().equals(text))
		{
		System.out.println(text+" : Is Verified");
		return true;
		}else{
			System.out.println("Page not loaded properly");
			return false;
		}
	}
	
}
