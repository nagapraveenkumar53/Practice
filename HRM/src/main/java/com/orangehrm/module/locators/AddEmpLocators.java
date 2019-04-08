package com.orangehrm.module.locators;

import org.openqa.selenium.By;

import com.orangehrm.module.model.AddEmpModel;

public class AddEmpLocators extends AddEmpModel{
	
	public By PIM=By.linkText("PIM");
	public By AddEmpLoc=By.linkText("Add Employee");
	public By AddEmpHead=By.xpath("//*[@class='mainHeading']/h2");
	
	/*public void AddEmpModel(By PIM)
	{
		this.PIM = PIM;
	}*/

}
