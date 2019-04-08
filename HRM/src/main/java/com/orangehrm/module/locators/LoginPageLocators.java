package com.orangehrm.module.locators;

import org.openqa.selenium.By;

import com.orangehrm.module.model.LoginModel;

public class LoginPageLocators extends LoginModel {

	public By userName = By.name("txtUserName");
	public By password = By.name("txtPassword");
	public By login = By.name("Submit");
	public By logout = By.linkText("Logout");

	

}