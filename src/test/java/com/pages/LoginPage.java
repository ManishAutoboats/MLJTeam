package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.helper.Base;

public class LoginPage extends Base {

	By username = By.xpath("//input[@id='user-name']");
	By password = By.xpath("//input[@id='password']");
	By loginBtn = By.xpath("//input[@id='login-button']");



	public void enterUserAndPassword() {
		 waitForElement(username).sendKeys(prop.getProperty("username"));
	     waitForElement(password).sendKeys(prop.getProperty("password"));
		
	
	}
	
	public void clickOnLoginBtn() {
		waitForElement(loginBtn);
		clickOnElement(loginBtn);

	}

}
