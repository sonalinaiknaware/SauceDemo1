package com.SouceDemo.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPOMClassFlipCart {
WebDriver driver;

@FindBy(xpath="//input[@class='_2IX_2- VJZDxU']")
WebElement username;

public void sendUserName() {
	username.sendKeys("9975852574");
}

@FindBy(xpath="//input[@class='_2IX_2- _3mctLh VJZDxU']")
WebElement password;
public void sendPassword() {
	password.sendKeys("June@108");
}

@FindBy(xpath="//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")
WebElement loginBtn;
public void clickLoginBtn() {
	loginBtn.click();
}
	public LoginPOMClassFlipCart(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
}

