package com.orangehrm.module.pages;

import com.orangehrm.module.locators.AddEmpLocators;
import com.orangehrm.module.utils.ReadFileData;

public class AddEmpPage extends AddEmpLocators {

	ReadFileData rd = new ReadFileData();

	public void clickOnAddEmp() {
		moveToElement(PIM);
		click(AddEmpLoc);
	}

	public void verifyAddEmp() {
		verifyElement(AddEmpHead, "PIM : Add Employee");
	}

	public void AddEmp() {
		// String
		// fname=rd.getDataFromPropertiesFile("D:\\Framework\\NewProject\\HRM\\src\\main\\resources\\config.properties").getProperty(fName);

	}

	
	
	
	
	
	
}
