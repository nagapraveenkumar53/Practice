package com.orangehrm.module.testcases;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.orangehrm.module.pages.LoginPage;

public class LoginTestCase extends LoginPage {
	@BeforeClass
	public void browserLaunch() {
		launchBrowsr();
		openHRM();
		verifyTitle("OrangeHRM - New Level of HR Management");
		System.out.println("Home page succesfully loaded");
	}

	@Test
	public void logIn() throws IOException {
		loginToHRM();
		verifyTitle("OrangeHRM");
		System.out.println("Login Succssful");
	}


	
	
	
	/*@Test
	public void logout() {
		logOutHRM();
	}

	@AfterClass
	public void closeBrowsers() {
		closeBrowser();
	}
*/
}
