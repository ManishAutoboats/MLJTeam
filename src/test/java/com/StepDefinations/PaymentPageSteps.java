package com.StepDefinations;

import com.pages.PaymentPage;
import com.pages.ProductPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PaymentPageSteps {
	
	ProductPage product = new ProductPage();
	PaymentPage payment = new PaymentPage();
	
	@When("user add product into the basket")
	public void user_add_product_into_the_basket() {
	   product.addToCart();
	}
	@When("user naviate to checkout")
	public void user_naviate_to_checkout() {
		product.clickOnCartIcon();
		product.clickOnCheckoutBtn();
	   
	}
	
	
	@When("user enter firstName {string} lastName {string} and PostalCOde {string}")
	public void user_enter_first_name_last_name_and_postal_c_ode(String fname, String lname, String pcode) {
	    payment.enterUserDetails(fname, lname, pcode);
	}

	
	@When("user place an order")
	public void user_place_an_order() {
		payment.placeOrder();
	   
	}
	@Then("validate the sucess message {string}")
	public void validate_the_sucess_message(String message) {
	    
		 payment.validateOrderConfirmation(message);
		
	}



}
