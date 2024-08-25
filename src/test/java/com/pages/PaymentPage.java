package com.pages;

import org.openqa.selenium.By;

import com.helper.Base;

public class PaymentPage extends Base {
	
	
	By firstName = By.xpath("//input[@id='first-name']");
	By lastName = By.xpath("//input[@id='last-name']");
	By postalCode = By.xpath("//input[@id='postal-code']");
	By continueBtn = By.xpath("//input[@type='submit']");
	By finishBtn = By.xpath("//a[@class='btn_action cart_button']");
	By thankYouMessage = By.xpath("//h2[@class='complete-header']");
			
	
	
	
	public void enterUserDetails(String fname,String lname,String pcode) {
		  clearAndEnterText(firstName,fname);
		  clearAndEnterText(lastName, lname);
		  clearAndEnterText(postalCode, pcode);
		  clickOnElement(continueBtn);

		
	}
	
	 public void placeOrder() {
		 clickOnElement(finishBtn);
		 
		 
	 }
	 
	  public void validateOrderConfirmation(String message) {
		  
		  ValidateText(driver.findElement(thankYouMessage), message);
	  }
	

}
