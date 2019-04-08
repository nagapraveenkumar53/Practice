package com.orangehrm.module.pages;

import java.io.IOException;

import com.orangehrm.module.locators.LoginPageLocators;
import com.orangehrm.module.utils.ReadFileData;
import com.orangehrm.module.utils.XLUtils;

public class LoginPage extends LoginPageLocators {

	ReadFileData rd=new ReadFileData();
	XLUtils xl=new XLUtils();
	

	public void launchBrowsr() {
		LaunchBrowser("chrome");
		maxmizeBrowser();
	}
	public void openHRM()
	{
		getURL("http://apps.qaplanet.in/hrm/login.php");
	}

	public void loginToHRM() throws IOException {
		String username=xl.getStringCellData("D:\\Framework\\NewProject\\HRM\\src\\main\\resources\\Data.xlsx", "Sheet1", 1, 0);
		String passwor=xl.getStringCellData("D:\\Framework\\NewProject\\HRM\\src\\main\\resources\\Data.xlsx", "Sheet1", 1, 1);
		
		findElemen(userName).sendKeys(username);
		findElemen(password).sendKeys(passwor);
		findElemen(login).click();
	}

	public void logOutHRM() {
		findElemen(logout).click();
	}

}
