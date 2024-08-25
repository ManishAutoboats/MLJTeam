package com.pages;

import org.openqa.selenium.By;

import com.helper.Base;

public class ProductPage extends Base {

	By addToCart = By.xpath("(//button[@class='btn_primary btn_inventory'])[1]");
	By cartIcon = By.xpath("//a[@class='shopping_cart_link fa-layers fa-fw']");
	By checkoutBtn = By.xpath("//a[@class='btn_action checkout_button']");

	public void addToCart() {
		clickOnElement(addToCart);

	}

	public void clickOnCartIcon() {
		clickOnElement(cartIcon);
	}

	public void clickOnCheckoutBtn() {
		clickOnElement(checkoutBtn);

	}

}
