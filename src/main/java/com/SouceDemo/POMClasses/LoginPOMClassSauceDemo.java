package com.SouceDemo.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPOMClassSauceDemo {
	WebDriver driver;

	@FindBy(xpath = "(//input[@class='input_error form_input'])[1]")
	WebElement useName;

	public void sendUsername() {
		useName.sendKeys("standard_user");
	}

	@FindBy(xpath = "(//input[@class='input_error form_input'])[2]")
	WebElement passWord;

	public void sendPassWord() {
		passWord.sendKeys("secret_sauce");

	}

	@FindBy(xpath = "//input[@class='submit-button btn_action']")
	WebElement loginBtn;

	public void clickLoginBtn() {
		loginBtn.click();
	}
	@FindBy(xpath = "//a[@class='shopping_cart_link']")
	WebElement cart;
	
	public String clickcart() {
		String countOfProduct=cart.getText();
		return countOfProduct;
	}

	public LoginPOMClassSauceDemo(WebDriver driver) {
		this.driver = driver;

		PageFactory.initElements(driver, this);

	}

}
